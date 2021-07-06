package cn.ltianan.study.common;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Marc处理类
 * record 为marc内容
 * leader 头标区
 * directorys 目次区list
 * fields 数据区内容list
 * valid readMarc后设置的一个验证此数据是否为可以处理的数据，
 * @author Angle
 *
 */
public class MarcUtil {
	
	
	public static final String C29 = (char) 29 + "";//GS
	public static final String C30 = (char) 30 + "";//RS
	public static final String C31 = (char) 31 + "";//US
	
	/**
	 * 枚举Marc类型，暂未使用
	 * @author Angle
	 *
	 */	
	public enum MarcType {
		TDMARC,CNMARC,MARC21,NLCDATA;//nlcdata为获取到的国图的数据并非标准的marc数据
	}
	
	
	private String charset;
	
	
	/**
	 * Marc内容
	 */
	private String record;
	/**
	 * CNMARC,MARC21,NLCDATA
	 */
	private MarcType type;
	
	/**
	 * 头标区，定长24位
	 */
	private String leader;
	
	/**
	 * 目次区每个长度为12，后面9位为数字
	 */
	private List<String> directorys;
	
	private List<String> fields;
	
	/**
	 * 验证marc内容是否合法
	 */
	private boolean valid=false;
	
	//默认构造函数
	public MarcUtil() {
		
	}
	
	public static int errCount=0;
	
	//构造函数
	public MarcUtil(String record,MarcType type) {
		this.type=type;
		this.record=record;
	}

	
	
	public String getCharset() {
		return charset;
	}



	public void setCharset(String charset) {
		this.charset = charset;
	}



	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}	
	
	/**
	 * @return the leader
	 */
	public String getLeader() {
		return leader;
	}

	/**
	 * @param leader the leader to set
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}

	public List<String> getDirectorys() {
		return directorys;
	}

	public void setDirectorys(List<String> directorys) {
		this.directorys = directorys;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	
	public MarcType getType() {
		return type;
	}

	/**
	 * 设置Record格式
	 * @param type
	 */
	public void setType(MarcType type) {
		this.type = type;
	}
	
	
	
	/**
	 * 读取marc信息，设置leader,directorys,fields等值
	 * 
	 * @throws UnsupportedEncodingException 
	 * @author Angle
	 */
	public void readMarc(String charsetName) throws UnsupportedEncodingException {
		valid=true;
		if(this.record!=null) {
			byte[] recordbytes=  this.record.getBytes(charsetName);     //以字节数组存储
			byte[] recordLenBytes=new byte[5];
			System.arraycopy(recordbytes,0,recordLenBytes,0,5);
			try {
			int jlcd=Integer.parseInt(new String(recordLenBytes,charsetName));//记录长度
			System.out.println(jlcd);
			
			if(jlcd!=recordbytes.length) {
				valid=false;
				System.out.println("读取marc失败，记录长度与实际计算的字节数不一致，或是由于按错误的编码读取此记录！");
				System.out.println("headerRecordLength:"+jlcd);
				System.out.println("calRecordLength:"+recordbytes.length);
				return;
			}else {
				if(recordbytes.length>37) {
					byte[] toubiaoqus=new byte[24];
					System.arraycopy(recordbytes,0,toubiaoqus,0,24);
					leader=new String(toubiaoqus,charsetName);//头标区
					
					//设置目次区
					byte[] dirLenBytes=new byte[5];
					System.arraycopy(recordbytes,12,dirLenBytes,0,5);
					int dirlen=Integer.parseInt(new String(dirLenBytes,charsetName));//数据基地址
					if(dirlen%12!=1) {
						valid=false;
						System.out.println("读取目次区长度异常");
					}else {
						directorys=new ArrayList<String>();
						for(int i=24;i<dirlen-1;i=i+12) {
							byte[] directoryByte=new byte[12];
							System.arraycopy(recordbytes,i,directoryByte,0,12);
							String e=new String(directoryByte,charsetName);
							System.out.println("debug --e:"+e);
							directorys.add(e);
						}
						
						byte[] dataBytes=subBytes(recordbytes,dirlen,jlcd-dirlen);
						String data=new String(dataBytes,charsetName);
						System.out.println(data);
						
						String [] alls= record.split(C30);
						if(alls.length==directorys.size()+2) {//如果格式正确。(目次数量==字段内容数量)
							fields=new ArrayList<String>();
							for(int j=1;j<alls.length-1;j++) {
								String fieldString=alls[j];
								System.out.println("fieldContent:"+fieldString);
								fields.add(fieldString);
							}
							
						}else {
							valid=false;
							System.out.println("数据异常，可能数据区数据异常");
							return;
						}
						//TODO 是否需要将子字段读取出来？？
					}
					
				}else {
					valid=false;
					System.out.println("读取marc失败,字符串太短了");
					return;
				}
				
			}
			}catch ( NumberFormatException e) {
				valid=false;
				System.out.println("不能正确读取数字（记录长度、目次区长度等）");
			}			
		}
	}
	
	/**
	 * 根据字段返回字段内容,需要先readMarc()后才能取到值，如果有多个相同的字段，返回第一个字段的内容。
	 * @param fieldTag
	 * @return
	 */
	public String getField(String fieldTag) {
		String content=null;
		if (valid) {
			if (fieldTag != null && fieldTag.length() == 3) {
				if (directorys.size() > 0 && fields.size() == directorys.size()) {// fields.size()==directorys.size() 已经在读取的时候判断过,其实是不需要判断的
					for (int i = 0; i < directorys.size(); i++) {
						if (directorys.get(i).substring(0, 3).equals(fieldTag)) {
							content= fields.get(i);
							break;
						}
					}
				}
			}
		}
//		System.out.println(fieldTag+":"+content);
		return content;
	}
	
	public String getProductBarCode(String subFieldAndTag) {
		String content=null;
		if(subFieldAndTag.length()==4) {
			String fieldTag=subFieldAndTag.substring(0,3);
			String fieldData=this.getField(fieldTag);
			String subFieldTag=subFieldAndTag.substring(3,4);

			if(fieldData!=null) {
				String []subFieldDatas=fieldData.split(C31);
				if(subFieldDatas.length>0) {
					for(String s:subFieldDatas) {
						if(s!=null) {
							if(s.startsWith(subFieldTag)) {
								s=s.substring(1);
								if(content!=null) {
									if(s!=null) {
										content=content+";"+s;
									}
								}else {
									content=s;
								}
							}
						}
					}
				}
			}
		}
		
		return isbntiaoma(content);
		
	}
	
	
	/**
	 * 根据子字段Tag：如200a(如果有多个，取其中的第一个200a) 返回子字段内容(如果有多个则以分隔符;分隔开来)
	 * @param subFieldAndTag
	 * @return
	 */
	public String getSubFieldByTag(String subFieldAndTag) {
		String content=null;
		if(subFieldAndTag.length()==4) {
			String fieldTag=subFieldAndTag.substring(0,3);
			String fieldData=this.getField(fieldTag);
			String subFieldTag=subFieldAndTag.substring(3,4);
			
			if(fieldData!=null) {
				String []subFieldDatas=fieldData.split(C31);
				if(subFieldDatas.length>0) {
					for(String s:subFieldDatas) {
						if(s!=null) {
							if(s.startsWith(subFieldTag)) {
								s=s.substring(1);
								if(content!=null) {
									if(s!=null) {
										content=content+";"+s;
									}
								}else {
									content=s;
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(subFieldAndTag+":"+content);
		return content;
	}
	
	/**
	 * 
	 * @return 返回有序字段
	 * @throws UnsupportedEncodingException 
	 */
	@Deprecated
	public Map<String,String> getZds() throws UnsupportedEncodingException{//获取所有字段的值<zd+index,value>
		Map<String,String> zdsMap=new HashMap<String, String>();
		if(this.type==null){
			System.out.println("请先设置MARC类型！");		
			return null;
		}
		else{
			if(this.record==null)
			{
				System.out.println("MARC内容为空！");
				return null;
			}
			if(this.type==MarcType.CNMARC){
				byte[] contentbyte= this.record.getBytes(charset);     //以字节数组存储
				byte[] recordcounts=new byte[5];
				System.arraycopy(contentbyte,0,recordcounts,0,5);
				int jlcd=Integer.parseInt(new String(recordcounts,charset));//记录长度
				byte[] toubiaoqus=new byte[24];
				System.arraycopy(contentbyte,0,toubiaoqus,0,24);
				String toubiaoqu=new String(toubiaoqus,charset);//头标区
				byte[] nrongwithouttoubiaoqus=new byte[contentbyte.length-24];
				System.arraycopy(contentbyte,24,nrongwithouttoubiaoqus,0,contentbyte.length-24);
				String nrongwithouttoubiaoqu=new String(nrongwithouttoubiaoqus,charset);
				String[] allzds=nrongwithouttoubiaoqu.split("");//以字段结束符分割
				String dzmciqu=allzds[0];
				zdsMap.put("000",toubiaoqu);//000 头标区     0100 (第一个010字段)
				for(int i=1;dzmciqu.length()>=12;){
					String muci=dzmciqu.substring(0,12);//顺序取目次
					String zd=dzmciqu.substring(0,3);
					String nrong="";
					nrong=allzds[i++]+"";
						for(int j=0;j<=9;j++){
							if(!zdsMap.containsKey(zd+j)){
								zdsMap.put(zd+j, nrong);
								break;
							}							
						}					
					dzmciqu=dzmciqu.substring(12);
				}
				return zdsMap;
			}else 
			if(this.type==MarcType.MARC21){
				System.out.println("未实现！");
			}
			return null;
		}
	}
	
	@Override
	public String toString() {
		if(record!=null)
			return record.toString();
		else 
			return null;
	}

	/**
	 *  验证长度合法不
	 * @return
	 */
	public boolean isValid() {
		return valid;	
	}
	
	/**
	 * 
	 * @param newtype 目标MARC格式
	 * @param isreadbyBytes 是否以字节方式读取
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String getMarc(MarcType newtype,Boolean isreadbyBytes) throws UnsupportedEncodingException{
		String result=null;
		if(this.type==null){			
			System.out.println("Please set type first!");
			return result;
		}else{
			if(record==null){
				System.out.println("Please set content first!");
				return result;
			}else{
				if(this.type==newtype){
					return record;
				}else{
					if(newtype==MarcType.CNMARC){//将ELIBMARC转换成CNMARC						
						String toubiaoqu="";//头标区
						toubiaoqu=this.record.substring(0,24);
						String nrongwithouttoubiaoqu=this.record.substring(24);
//						if(nrongwithouttoubiaoqu.startsWith("001")){//如果有001字段也删除掉
//							nrongwithouttoubiaoqu=nrongwithouttoubiaoqu.substring(nrongwithouttoubiaoqu.indexOf("")+1);
//						}
						String dzmciqu="";
						String[] allzds=nrongwithouttoubiaoqu.split("");
						int pydz=0;
						int zdlength=0;
//						dzmciqu=dzmciqu+getdzmuci("001",("S"+marcid+"").getBytes(bianma).length,0);
						String nrong=""; //各个字段的内容和
//						pydz=pydz+("S"+marcid+"").getBytes(bianma).length;
						
						for(int i=0;i<allzds.length;i++){
							if(allzds[i].length()>3){							
								String zd=allzds[i].substring(0, 3);
//								System.out.println(zd);
								String zdnrong=allzds[i].substring(3)+"";
								dzmciqu=dzmciqu+getdzmuci(zd,this.record.getBytes(charset).length,pydz);
								nrong=nrong+zdnrong;
								pydz=pydz+zdnrong.getBytes(charset).length;							
							}
						}
						
						dzmciqu=dzmciqu+"";//地址目次区添加字段结束符
						nrong=nrong+"";//数据区添加记录结束符
						toubiaoqu=String.format("%05d", 24+dzmciqu.getBytes(charset).length+nrong.getBytes(charset).length)+toubiaoqu.substring(5, 12)
								+String.format("%05d",dzmciqu.getBytes(charset).length+24)+toubiaoqu.substring(17, 24);
						toubiaoqu=toubiaoqu.replaceAll(" ", " ");//将长度为2的空格替换为长度1的空格
						result=toubiaoqu+dzmciqu+nrong;
					}else if(newtype==MarcType.MARC21){//将CNMARC转换为MARC21
						byte[] contentbyte= this.record.getBytes(charset);     //以字节数组存储
						byte[] recordcounts=new byte[5];
						System.arraycopy(contentbyte,0,recordcounts,0,5);
						int jlcd=Integer.parseInt(new String(recordcounts,charset));
//						if(jlcd!=contentbyte.length){//如果头标区的记录长度不与字节数组的长度相同,则返回原内容;
//							return "ERR"+easyMarc;
//						}
						byte[] toubiaoqus=new byte[24];
						System.arraycopy(contentbyte,0,toubiaoqus,0,24);
						String toubiaoqu=new String(toubiaoqus,charset);//头标区
//						System.out.println(toubiaoqu);
						
						byte[] nrongwithouttoubiaoqus=new byte[contentbyte.length-24];
						System.arraycopy(contentbyte,24,nrongwithouttoubiaoqus,0,contentbyte.length-24);
//						String nrongwithouttoubiaoqu=easyMarc.substring(24);
						String nrongwithouttoubiaoqu=new String(nrongwithouttoubiaoqus,charset);
						String[] allzds=nrongwithouttoubiaoqu.split("");//以字段结束符分割
						String dzmciqu=allzds[0];
						String marcResult=toubiaoqu;
//						int jidizhi=Integer.parseInt(toubiaoqu.substring(12, 17));
						byte[] jidizhis=new byte[5];
						System.arraycopy(toubiaoqus,12,jidizhis,0,5);
						int jidizhi=Integer.parseInt(new String(jidizhis,charset));
						byte[] dzmciqus=dzmciqu.getBytes(charset);
						
				    	for(int i=1;dzmciqu.length()>=12;){
//				    		byte[] mucis=new byte[12];
//				    		System.arraycopy(dzmciqus,0,mucis,0,12);
				    		String muci=dzmciqu.substring(0,12);
//				    		String muci=new String(mucis);
//				    		byte[] zds=new byte[3];
//				    		System.arraycopy(dzmciqus,0,zds,0,3);
//				    		String zd=new String(zds,bianma);
				    		String zd=dzmciqu.substring(0,3);
				    		String nrong="";
				    		if(isreadbyBytes){//以字节方式获取内容
//				    			byte[] qsdzs=new byte[5];
//				    			System.arraycopy(dzmciqus,7,qsdzs,0,5);
				    			int qsdz;
				    			try{
//				    				System.out.println();
				    				qsdz=Integer.parseInt(muci.substring(7));
				    			}catch(NumberFormatException e){
				    				System.out.println("ERR"+this.record);
									nrong="ERR"+this.record;
									e.printStackTrace();									
									System.out.println(++errCount);
									return nrong="ERR"+this.record;
				    			}
//				    			int qsdz=Integer.parseInt(new String(qsdzs,bianma));
//				    			byte[] cds=new byte[4];
//				    			System.arraycopy(dzmciqus,3,cds,0,4);
//				    			String cdString=new String(cds,bianma);
				    			int cd=Integer.parseInt(muci.substring(3,7));
//				    			int cd=Integer.parseInt(new String(cds,bianma));
//								nrong=easyMarc.substring(jidizhi+qsdz,jidizhi+cd+qsdz);
				    			byte[] nrongbyte=new byte[cd];
								try {
									System.arraycopy(contentbyte,jidizhi+qsdz,nrongbyte,0,cd);
									for(int j=0;j<nrongbyte.length;j++){
										if(nrongbyte[j]==0){  //null值转换为空格,以便插入数据库吧?TODO
											nrongbyte[j]=32;
										}
									}
								} catch (ArrayIndexOutOfBoundsException e) {
									System.out.println("ERR"+this.record);
									nrong="ERR"+this.record;
									e.printStackTrace();									
									System.out.println(++errCount);
									return nrong="ERR"+this.record;
									// TODO Auto-generated catch block
//									System.exit(1);
								}
								nrong=new String(nrongbyte,charset);
								if(!nrong.endsWith("")){
									nrong=nrong+"";
								}
							}else{
								nrong=allzds[i++]+"";
							}
//				    		dzmciqus=subBytes(dzmciqus, 12, dzmciqus.length-12);
				    		dzmciqu=dzmciqu.substring(12);
//				    		dzmciqu=new String(dzmciqus,bianma);
				    		marcResult=marcResult+zd+nrong;				    		
				    	}
				    	marcResult=marcResult+"";
				    		result=marcResult;
					}
				}
			}
			
		}
		return result;
	}

	/**
	 * 将标准Marc数据的编码从oldCharset转换到newCharset,只修改头标区跟地址目次区
	 * @param oldCharset
	 * @param newCharset
	 * @return
	 */
	public String changeRecordCharset(String oldCharset,String newCharset){
		String marc=this.record;



		return marc;
	}
	
	
	public static String getdzmuci(String zd,int lenght,int startposi){
		StringBuilder aa=new StringBuilder();
		aa.append(zd);
		aa.append(String.format("%04d", lenght));		
		aa=aa.append(String.format("%05d", startposi));
		return aa.toString();
	}
	
	/**
	 * 截取子byte
	 * @param src
	 * @param begin
	 * @param count
	 * @return
	 */
	public static byte[] subBytes(byte[] src, int begin, int count) {
        byte[] bs = new byte[count];
        for (int i=begin; i<begin+count; i++) bs[i-begin] = src[i];
        return bs;
    }
	
//	public static Map getZds(){
//		Map map=new HashMap<String, String>();
//		return map;
//		
//	}
	
	/**
	 * 将isbn生成条码
	 * 
	 * @param input
	 * @return
	 */
	public static String isbntiaoma(String input) {
			if(input==null){
				input="";
			}
			String result=input;
			if(input.contains(";")) {
				input=input.substring(0,input.indexOf(";"));
			}
			String lianjie = input.replaceAll(" ", "").replaceAll("-", "").trim();
			//统一到13位isbn，末尾校验位可能错误，接下来会校正。
			if(lianjie.length()==10){
				
				lianjie="978"+lianjie;
			}
			
			//{12d+1[dxX]}
			String regexIsbnCheck="^[\\d]{12}.";//判断前12位是否未数字
			
			if(Pattern.matches(regexIsbnCheck,lianjie)) {
			if(lianjie.length()>=12){
				lianjie=lianjie.substring(0, 13);
				String isbn1="";
				isbn1 = lianjie.substring(0,lianjie.length()-1);
				int jshu =0;
				int oshu=0;
				for(int i=0;i<=11;i++){
					if(((i%2)==0)){
						jshu=jshu+(int)((int)isbn1.charAt(i)-48);
					}else{
						 oshu =oshu+(int)((int)isbn1.charAt(i)-48);
					}
				}
				int sum = oshu*3+jshu;
				int mod = sum%10;
				int mod1 = 10-mod;
				String str = "";
				if(mod1==10){
					str = "0";
				}else{
					str = String.valueOf(mod1); 
				}
				lianjie=lianjie.substring(0,lianjie.length()-1)+str;
				result=lianjie;
			}
			}
			
				return result;
		}

	/**
	 * 返回新的编码的记录
	 * @param newCharsetName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String getNewCharsetRecord(String newCharsetName) throws UnsupportedEncodingException {
		String result=null;
		if(this.isValid()) {
			int newRecordLength=this.getRecord().getBytes(newCharsetName).length;
			String newLeader=String.format("%05d", newRecordLength)+this.getLeader().substring(5);
			StringBuilder newdirectorys=new StringBuilder();
			String fields=this.getRecord().substring(this.getRecord().indexOf(C30)+1);
			int fieldstartIndex=0;
			for(int i=0;i<directorys.size();i++) {
				String directory=directorys.get(i);
				String fieldidx=directory.substring(0, 3);
				String field=this.getFields().get(i)+C30;
				int fieldLength=field.getBytes(newCharsetName).length;
				newdirectorys.append(fieldidx+String.format("%04d", fieldLength)+String.format("%05d", fieldstartIndex));
				fieldstartIndex=fieldstartIndex+fieldLength;
			}
			
			newdirectorys.append(C30);
			
			return newLeader+newdirectorys.toString()+fields;
		}
		return result;
	}
	
	
	/**
	 * 将简易Marc格式转换为标准的CNMARC格式,如果时间没传入，则不更新005的时间
	 * @param easyMarc
	 * @param charSet
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String getCNMARCFromEasyMarc(String easyMarc,String charSet,Date now) throws UnsupportedEncodingException {

		String result=null;

			if(easyMarc==null){
				System.out.println("Please set content first!");
				return result;
			}else{
					String toubiaoqu="";//头标区
					toubiaoqu=easyMarc.substring(0,24);
					String nrongwithouttoubiaoqu=easyMarc.substring(24);
					String dzmciqu="";
					String[] allzds=nrongwithouttoubiaoqu.split("");
					int pydz=0;
					int zdlength=0;
					String nrong=""; //各个字段的内容和
					for(int i=0;i<allzds.length;i++){
						if(allzds[i].length()>3){							
							String zd=allzds[i].substring(0, 3);
							String zdnrong=allzds[i].substring(3)+"";
							if(zd.equals("005")&&now!=null) {
								SimpleDateFormat sdf=new SimpleDateFormat("YYYYMMDDHHmmSS.s");
								zdnrong=sdf.format(now)+"";
							}
							dzmciqu=dzmciqu+getdzmuci(zd,easyMarc.getBytes(charSet).length,pydz);
							nrong=nrong+zdnrong;
							pydz=pydz+zdnrong.getBytes(charSet).length;							
						}
					}
					
					dzmciqu=dzmciqu+"";//地址目次区添加字段结束符
					nrong=nrong+"";//数据区添加记录结束符
					toubiaoqu=String.format("%05d", 24+dzmciqu.getBytes(charSet).length+nrong.getBytes(charSet).length)+toubiaoqu.substring(5, 12)
							+String.format("%05d",dzmciqu.getBytes(charSet).length+24)+toubiaoqu.substring(17, 24);
					result=toubiaoqu+dzmciqu+nrong;
			}		

		return result;
	
	}
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String record="00803cam0 2200253   450 00100130000000500170001301000350003010000410006510100130010610200150011910500180013410600060015220000970015821000310025521500160028630000130030251000480031560600410036369000210040469200190042570100430044470100400048780100220052701200000000120120807142554.0  a7-5074-1126-5b精装dCNY375.00  a20021005d1999    kemy0chiy0110    ea0 achiaeng  aCNb110000  ak   gi  000yy  ar1 a中国房地产统计年鉴9zhong guo fang di chan tong ji nian jianh1999b专著f孟晓苏，莫天全主编  a北京c中国城市出版社d1999  a742页d29cm  a中英文本1 aChina real estate statistical yearbookzeng0 a房地产业x统计资料y中国z1999x年鉴  aF299.233.5-54v4  a29.16042088v2 0a孟晓苏f(1949.12~)9meng xiao su4主编 0a莫天全f(1964~)9mo tian quan4主编 0aCNbNLCc20000106";
//		
//		MarcUtil marcUtil=new MarcUtil();
//		marcUtil.setRecord(record);
//		try {
//			marcUtil.readMarc("GB2312");
//			marcUtil.getSubFieldByTag("2009");
//			marcUtil.getSubFieldByTag("200a");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//	}
	
}


