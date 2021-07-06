package cn.ltianan.study.controller;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import cn.ltianan.study.common.TDMarcHelper;
import cn.ltianan.study.domain.*;
import cn.ltianan.study.domain2.*;
import cn.ltianan.study.repository.primaryRepository.*;
import cn.ltianan.study.repository.secondaryRepository.*;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import cn.ltianan.study.common.MarcUtil;
import cn.ltianan.study.common.MarcUtil.MarcType;
import cn.ltianan.study.dto.NlcbibDTO;
import cn.ltianan.study.util.RandomTimestamp;
import cn.ltianan.study.util.RandomValue;


@Controller
@RequestMapping("/data")
public class DataTransformController {
	@Autowired
	private ZskRepository zskRepository;

	@Autowired
	private SckRepository sckRepository;

	@Autowired
	private SshRepository sshRepository;

	@Autowired
	private DzkRepository dzkRepository;

	@Autowired
	private JhskRepository jhskRepository;

	@Autowired
	private JhslskRepository jhslskRepository;

	@Autowired
	private MarcsshRepository marcsshRepository;

	@Autowired
	private BookIndexRepository bookIndexRepository;
	
	@Autowired BibRepository bibRepository;
	
	@Autowired MarcTypeRepository marcTypeRepository;
	
	@Autowired MarcshuceRepository marcshuceRepository;

	@Autowired BookLocalRepository bookLocalRepository;

	@Autowired BookRepository bookRepository;

	@Autowired CirReaderRepository cirReaderRepository;

	@Autowired CirReaderUnitRepository cirReaderUnitRepository;

	@Autowired CirReaderTypeRepository cirReaderTypeRepository;
	
	@Autowired  MarczdzchaoRepository marczdzchaoRepository;
	@Autowired
	BookClassMaxOrderNoRepository bookClassMaxOrderNoRepository;
	
	@Autowired
	BookClassMaxOrderNoJpaRepository bookClassMaxOrderNoJpaRepository;
	
	@Autowired NlcbibRepository nlcbibRepository;
	@Autowired NlcbibJpaRepository nlcbibJpaRepository;
	
	@Autowired BibMaxRecordIdRepository bibMaxRecordIdRepository;
	
	@Autowired CirCircleRepository cirCircleRepository;
	
	@ResponseBody
	@RequestMapping("/listmarcinfo")
	public List<ZskEntity> listMarcinfo() {
		return (List<ZskEntity>) zskRepository.findAll();
	}

	@ResponseBody
	@RequestMapping("/listtenzsk")
	public List<ZskEntity> listZskResults(){
		Integer [] ids={1,2,3,4,5,6,7,8,9,10};
		List<Integer> idsList=Arrays.asList(ids);
		return (List<ZskEntity>)zskRepository.findAllById(idsList);
	}
	
	@ResponseBody
	@RequestMapping("/transformData")
	public boolean transformData() throws UnsupportedEncodingException {
		boolean finish=false;
		//转换逻辑
		List<ZskEntity> zskDatas=(List<ZskEntity>) zskRepository.findAll(new Sort(Sort.Direction.ASC,"zskid"));
		for(ZskEntity zsk:zskDatas) {
			Date date=new Date();
			Timestamp now = new Timestamp(date.getTime());
			BibEntity bib=new BibEntity();

			List<SckEntity> scks = sckRepository.findByZskid(zsk.getZskid());
			System.out.println("zskid for query scks:"+zsk.getZskid());
			if(scks!=null&&scks.size()>0){
				zsk.setZsktemp(scks.get(0).getPrice().toString());//临时将价格传入这里，这个字段没用到
			}else{
				zsk.setZsktemp("0.00");
			}

			MarcUtil oldMarcUtil=new MarcUtil();
			oldMarcUtil.setCharset("utf-8");
			//TODO 将查询的信息转换为简易MARC数据（TDMARC）
			TDMarcHelper tdMarcHelper=new TDMarcHelper(zsk);
			oldMarcUtil.setRecord(tdMarcHelper.getEasyMarcFromZsk());
//
			oldMarcUtil.setType(MarcType.TDMARC);
			String marc=oldMarcUtil.getMarc(MarcType.CNMARC, false);
//			String marc=zsk.getMarc();
			MarcUtil marcUtil=new MarcUtil();
			marcUtil.setRecord(marc);
			marcUtil.readMarc("UTF-8");
			MarcTypeEntity marcType=marcTypeRepository.findById(1).get();
			bib=setBib(marcUtil,marcType);
		
			bib.setBibId(zsk.getZskid());//单馆的时候默认相等
			bib.setRecordId(zsk.getZskid());
			//TODO 将18030 编码转换为utf-8编码存储marc
			String marcnow=marcUtil.getNewCharsetRecord("utf-8");
			bib.setMarc(marcnow);

			bib.setCreateBy("admin");
			bib.setCreateTime(zsk.getCatatime());
			bib.setUpdateBy("admin");
			bib.setUpdateTime(zsk.getCatatime());
			bib.setRecommend("1");//默认不推荐
			bib.setBookTypeId(1);
			bib.setMarcTypeId(1);
			bib.setParentId(0);
			bib.setDeptId(100);
			bibRepository.save(bib);		
		}
		finish=true;
		return finish;		
	}
	
	@ResponseBody
	@RequestMapping("/insertBookIndex")
	public boolean insertBookIndex() throws UnsupportedEncodingException {
		boolean finish=false;
		//转换逻辑
		List<ZskEntity> zskDatas=(List<ZskEntity>) zskRepository.findAll(new Sort(Sort.Direction.ASC,"zskid"));
		for(ZskEntity zsk:zskDatas) {
			Date date=new Date();
			BookIndexEntity bookIndex=new BookIndexEntity();
			bookIndex.setAuthorNo("");
			bookIndex.setIndexId(zsk.getZskid());
			bookIndex.setBibId(zsk.getZskid());
			String sshaofull=zsk.getClasscode()+"/"+zsk.getZch();
			if(zsk.getFzqfh()!=null&&!zsk.getFzqfh().equals("")){
				sshaofull=sshaofull+zsk.getFzqfh();
			}
			bookIndex.setCallNo(sshaofull);
			bookIndex.setClassNo(zsk.getClasscode());
			bookIndex.setDeptId(100);
			bookIndex.setBookNum(zsk.getBookcount());
			bookIndex.setOrderNo(Integer.parseInt(zsk.getZch()+""));
			bookIndexRepository.save(bookIndex);

		}
		finish=true;
		return finish;		
	}	

	@ResponseBody
	@RequestMapping("/insertBookLocal")
	public String insertBookLocal(){
		List<String> bookplaces=sckRepository.listBookplaceName();
		Timestamp now=new Timestamp(System.currentTimeMillis());
		for(String booklocalName:bookplaces){
			BookLocalEntity bookLocal=new BookLocalEntity();
			bookLocal.setCreateBy("admin");
			bookLocal.setCreateTime(now);
			bookLocal.setDeptId(100);
			bookLocal.setLocalCode(100+booklocalName);
			bookLocal.setLocalName(booklocalName);
			bookLocal.setStatus("0");
			bookLocalRepository.save(bookLocal);
		}

		return "插入藏址成功!";
	}


	@ResponseBody
	@RequestMapping("/insertBook")
	public boolean insertBook() throws UnsupportedEncodingException {
		boolean finish=false;
		List<SckEntity> scks=(List<SckEntity>) sckRepository.findAll(new Sort(Sort.Direction.ASC,"opertime"));
		List<BookLocalEntity> booklocals= (List<BookLocalEntity>) bookLocalRepository.findAll();
		Map<String,Integer> booklocalMaps=new HashMap<>();
		for(BookLocalEntity local:booklocals){
			booklocalMaps.put(local.getLocalName(),local.getLocalId());
		}

		for(SckEntity b:scks) {
			BookEntity book=new BookEntity();
			book.setBookBarcode(b.getBarcode());
//			book.setBookId(b.getSckid()); 设置自增
			book.setIndexId(b.getZskid());
//			book.getBookId()
			book.setBookMediaType("纸张");
			if(b.getPrice().compareTo(BigDecimal.valueOf(100000))>0){
				book.setBookPrice(BigDecimal.ZERO);
				book.setBookSetPrice(BigDecimal.ZERO);
			}else{
				book.setBookPrice(b.getPrice());
				book.setBookSetPrice(b.getPrice());
			}
			book.setBookSource("订购");
			String bookStatus="在馆";
			if(b.getBookstatus().equals("库本")){
			}else if(b.getBookstatus().equals("注销")){
				bookStatus="剔除";
			}else if(b.getBookstatus().equals("借出")){
				bookStatus="借出";
			}
			book.setBookStatus(bookStatus);
			book.setCreateBy("admin");
			book.setCreateTime(b.getOpertime());
//			book.setUpdateBy("admin");
//			book.setUpdateTime(b.getOpertime());
			book.setNowDeptId(100);
			book.setNowLocalId(booklocalMaps.get(b.getBookplace()));
			book.setOriDeptId(100);
			book.setOriLocalId(booklocalMaps.get(b.getBookplace()));
			bookRepository.save(book);
		}
		finish=true;
		return finish;		
	}

	@ResponseBody
	@RequestMapping("/insertReaderType")
	public boolean insertReaderType() throws UnsupportedEncodingException {
		CirReaderTypeEntity typeEntity=new CirReaderTypeEntity();
		typeEntity.setBorrowDay(90);//可借天数
		typeEntity.setBorrowNum(5);
		typeEntity.setCardFee(BigDecimal.ZERO);
		typeEntity.setCreateBy("admin");
		typeEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));
		typeEntity.setDeptId(100);
		typeEntity.setEffectiveDays(365);
		typeEntity.setExpirePayPerday(BigDecimal.valueOf(0.1));
		typeEntity.setExpireType("0");
		typeEntity.setForNativeDept("0");
		typeEntity.setLostPayPerbook(1);
		typeEntity.setMaxDebt(BigDecimal.ZERO);
		typeEntity.setMaxExpireBorrowNum(0);
		typeEntity.setOrderBookNum(0);
		typeEntity.setOrderDay(0);
		typeEntity.setReaderTypeCode("100本单位职工");
		typeEntity.setReaderTypeId(1);
		typeEntity.setReaderTypeName("本单位职工");
		typeEntity.setReborrowDay(0);
		typeEntity.setReborrowTimes(0);
		typeEntity.setStatus("0");
		cirReaderTypeRepository.save(typeEntity);
		return true;
	}

	@ResponseBody
	@RequestMapping("/insertReaderUnit")
	public boolean insertReaderUnit() throws UnsupportedEncodingException {
		Integer deptId=100;
		CirReaderUnitEntity readerUnitEntity=new CirReaderUnitEntity();
		readerUnitEntity.setCreateBy("admin");
		readerUnitEntity.setCreateTime(new Timestamp(System.currentTimeMillis()));
		readerUnitEntity.setDeptId(deptId);
		readerUnitEntity.setNano(null);
		readerUnitEntity.setReaderTypeId(1);//默认1
		readerUnitEntity.setReaderUnitCode(deptId+"番禺中医院");
		readerUnitEntity.setReaderUnitId(1);
		readerUnitEntity.setReaderUnitName("番禺中医院");
		readerUnitEntity.setStatus("0");
		cirReaderUnitRepository.save(readerUnitEntity);
		return true;
	}
	
	@ResponseBody
	@RequestMapping("/insertReader")
	public boolean insertReader() throws UnsupportedEncodingException {
		boolean finish=false;
		//转换逻辑
		List<DzkEntity> readers=(List<DzkEntity>) dzkRepository.findAll();
		for(DzkEntity r:readers) {
			CirReaderEntity reader= new CirReaderEntity();
//			reader.setAddress(r.g());
			Date date = r.getPaperdate();
			if(date!=null) {
				reader.setBirthday(new java.sql.Date(date.getTime()));
			}
//			reader.setBirthplace(r.getJiguan());
			reader.setCreateBy("admin");
			reader.setCreateTime(new Timestamp(r.getPaperdate().getTime()));
			reader.setDebt(BigDecimal.ZERO);
			reader.setDeposit(BigDecimal.ZERO);
			reader.setDeptId(100);
//			reader.setEmail(r.get());
			Date jzrqi=r.getTerm();
			if(jzrqi!=null) {
				reader.setExpireDate(new java.sql.Date(jzrqi.getTime()));
			}
//			reader.setIdcard(r.getZjhma());
//			reader.setMobile(r.ge());
			reader.setNation("汉");
//			reader.setReadercardNo(r.getDzzhao());
			reader.setReaderName(r.getName());
			reader.setReaderNo(r.getReadercode());
			reader.setReaderPassword("123456");
			if(reader.getExpireDate().after(new Date())){
				reader.setReaderStatus("0");//读者证状态为正常
			}else{
				reader.setReaderStatus("1");//注销
			}
			reader.setReaderTypeId(1);
			reader.setReaderUnitId(1);
			if(r.getSex()!=null) {
				if (r.getSex().equals("男")) {
					reader.setSex("0");//男
				} else if(r.getSex().equals("女")){
					reader.setSex("1");//女
				}else{
					reader.setSex("2");//未知
				}
			}else{
				reader.setSex("2");//未知
			}
			Date qyrqi=r.getPaperdate();
			if(qyrqi!=null) {
				reader.setStartDate(new java.sql.Date(qyrqi.getTime()));
			}
//			reader.setTel(r.getDianhua());
			
			cirReaderRepository.save(reader);		
			
		}
		finish=true;
		return finish;		
	}

	@ResponseBody
	@RequestMapping("/insertCirCircle")
	public boolean insertCirCircle(){
		List<JhslskEntity> jhslsks=jhslskRepository.findAll(new Sort(Sort.Direction.ASC,"jhslsk"));
		Integer deptId=100;
		for(JhslskEntity jhslsk:jhslsks){
			CirCircleEntity circleEntity=new CirCircleEntity();
			CirReaderEntity reader=cirReaderRepository.findByReaderNo(jhslsk.getReadercode().toUpperCase());
			BookEntity book=bookRepository.findByBookBarcode(jhslsk.getBarcode().toUpperCase());
			if(reader!=null&&book!=null) {
				circleEntity.setBookId(book.getBookId());//查询出来
				circleEntity.setBibId(book.getIndexId());
				circleEntity.setIndexId(book.getIndexId());
				circleEntity.setReaderId(reader.getReaderId());//查询出来
				circleEntity.setBorrowDeptId(deptId);
				circleEntity.setBorrowReaderTypeId(1);
				circleEntity.setCreateBy("admin");
				circleEntity.setCreateTime(new Timestamp(jhslsk.getOrderdate().getTime()));
				circleEntity.setIsInterlibraryLending("N");
				circleEntity.setIsInterlibraryReturning("N");
				circleEntity.setNano(null);
				circleEntity.setReaderDeptId(deptId);
//			circleEntity.setReaderId();前面设置了
				circleEntity.setRenewTimes(0);
				circleEntity.setReturnBy("admin");
				circleEntity.setReturnDeptId(deptId);
				circleEntity.setReturnTime(new Timestamp(jhslsk.getBackdate().getTime()));
				if (jhslsk.getYhdate().after(jhslsk.getBackdate())) {
					circleEntity.setReturnType("b");//正常归还
				} else {
					circleEntity.setReturnType("o");//超期归还
				}
				circleEntity.setShouldReturnTime(new Timestamp(jhslsk.getYhdate().getTime()));
//			circleEntity.setUpdateBy("admin");
//			circleEntity.setUpdateTime("");
				cirCircleRepository.save(circleEntity);
			}
		}

		List<JhskEntity> jhsks=jhskRepository.findAll(new Sort(Sort.Direction.ASC,"jhskid"));
		for(JhskEntity jhsk:jhsks){
			CirCircleEntity circleEntity=new CirCircleEntity();
			CirReaderEntity reader=cirReaderRepository.findByReaderNo(jhsk.getReadercode().toUpperCase());
			BookEntity book=bookRepository.findByBookBarcode(jhsk.getBarcode().toUpperCase());
			if(reader!=null&&book!=null) {
				circleEntity.setBookId(book.getBookId());//查询出来
				circleEntity.setBibId(book.getIndexId());
				circleEntity.setIndexId(book.getIndexId());
				circleEntity.setReaderId(reader.getReaderId());//查询出来
				circleEntity.setBorrowDeptId(deptId);
				circleEntity.setBorrowReaderTypeId(1);
				circleEntity.setCreateBy("admin");
				circleEntity.setCreateTime(new Timestamp(jhsk.getOrderdate().getTime()));
				circleEntity.setIsInterlibraryLending("N");
				circleEntity.setIsInterlibraryReturning("N");
				circleEntity.setNano(null);
				circleEntity.setReaderDeptId(deptId);
				circleEntity.setRenewTimes(0);
				circleEntity.setReturnType("n");//未归还
				circleEntity.setShouldReturnTime(new Timestamp(jhsk.getYhdate().getTime()));
				cirCircleRepository.save(circleEntity);
			}

		}


		return true;
	}

	@ResponseBody
	@RequestMapping("/insertClassMaxIndexOrder")
	public boolean insertClassMaxIndexOrder() {
		boolean finish =false;
		List<MarczdzchaoEntity> zdzchaos=(List<MarczdzchaoEntity>) marczdzchaoRepository.findAll();
		for(MarczdzchaoEntity z:zdzchaos) {
			BookClassMaxOrderNoEntity cmon=new BookClassMaxOrderNoEntity();
			cmon.setClassMaxOrderNo(Integer.parseInt(z.getZdzchao()));
			cmon.setClassNo(z.getFlhao());
			cmon.setDeptId(100);
			cmon.setUpdateBy("admin");
			cmon.setUpdateTime(z.getOptime());
			bookClassMaxOrderNoRepository.save(cmon);		
		}
		
		finish=true;
		return finish;
	}


	@ResponseBody
	@RequestMapping("/insertBibAndBooks")
	public boolean insertBibAndBooks() throws UnsupportedEncodingException {
		boolean finish=false;
		
		
		//转换逻辑
		List<Map> maps=nlcbibRepository.findRandomNlcData(10000);//获取10W数据
		String json = JSON.toJSONString(maps);
		List<NlcbibEntity> nlcbibs= JSON.parseArray(json, NlcbibEntity.class);
		
		//获取当前已使用的插入的条码；
		int nowbarcodeInt=getMaxBarcodeFromBook();
		
		for(NlcbibEntity nlcbib:nlcbibs) {
			Timestamp now = RandomTimestamp.randomTimestamp("2010-01-01", "2019-10-25");
			BibEntity bib=new BibEntity();
			String marc=nlcbib.getCnmarc();
			
			MarcUtil marcUtil=new MarcUtil();
			marcUtil.setRecord(marc);
			marcUtil.readMarc("utf-8");
			MarcTypeEntity marcType=marcTypeRepository.findById(1).get();
			bib=setBib(marcUtil,marcType);

			BibMaxRecordIdEntity nowBibMaxRecordIdEntity =getBibMaxRecordIdEntity();
			if(nowBibMaxRecordIdEntity==null) {
				//something went wrong
				BibMaxRecordIdEntity newBibMaxRecordIdEntity=new BibMaxRecordIdEntity();
				newBibMaxRecordIdEntity.setMaxRecordId(1);
			}else {
				nowBibMaxRecordIdEntity.setMaxRecordId(nowBibMaxRecordIdEntity.getMaxRecordId()+1);
			}
			bib.setRecordId(nowBibMaxRecordIdEntity.getMaxRecordId());
			
		
//			bib.setMarcid(nlcbib.getMarcid());
			bib.setMarc(marc);
			bib.setCreateBy("admin");
			bib.setCreateTime(now);
			bib.setUpdateBy("admin");
			bib.setUpdateTime(now);
			bib.setRecommend("1");//默认不推荐
			bib.setBookTypeId(1);
			bib.setMarcTypeId(1);
			bib.setParentId(0);
			bib.setDeptId(100);
			BibEntity bibwithID=bibRepository.save(bib);
			bibMaxRecordIdRepository.save(nowBibMaxRecordIdEntity);
			
			System.out.println(bibwithID.getBibId());
						
			BookClassMaxOrderNoEntity maxOrderNoEntity=getBookClassMaxOrderNoEntity(bibwithID.getClassno(),bibwithID.getDeptId());
			
			BookIndexEntity bookIndex=getBookIndexByClassno(bibwithID.getClassno(),bibwithID.getDeptId(),maxOrderNoEntity);
			if(maxOrderNoEntity==null) {
				BookClassMaxOrderNoEntity newBookClassMaxOrderNoEntity=new BookClassMaxOrderNoEntity();
				newBookClassMaxOrderNoEntity.setDeptId(bib.getDeptId());
				newBookClassMaxOrderNoEntity.setClassNo(bib.getClassno());
				newBookClassMaxOrderNoEntity.setUpdateBy(bib.getCreateBy());
				newBookClassMaxOrderNoEntity.setUpdateTime(now);
				newBookClassMaxOrderNoEntity.setClassMaxOrderNo(1);
				bookClassMaxOrderNoRepository.save(newBookClassMaxOrderNoEntity);
			}else {
				maxOrderNoEntity.setClassMaxOrderNo(maxOrderNoEntity.getClassMaxOrderNo()+1);
				bookClassMaxOrderNoRepository.save(maxOrderNoEntity);//更新最大种次号
			}
			bookIndex.setBibId(bibwithID.getBibId());
			BookIndexEntity bookIndexWithId=bookIndexRepository.save(bookIndex);
			
			BigDecimal price=BigDecimal.ZERO;
			
			if(bib.getPrice()!=null) {//获取
				String reg = "[1-9]\\d*\\.?\\d*";    //提取字符串末尾的数字：封妖塔守卫71 == >> 71  
				String s = bib.getPrice();
				Pattern p2 = Pattern.compile(reg);  
				Matcher m2 = p2.matcher(s);  
				if(m2.find()){  
					price = BigDecimal.valueOf(Double.parseDouble((m2.group(0))));
				}
			}
			
			int addedcount=getRandomInt(2,4);
			for(int i=0;i<addedcount;i++) {
				nowbarcodeInt++;
				String barcode=getBarcode(nowbarcodeInt);
				BookEntity book=new BookEntity();
				book.setBookBarcode(barcode);
				book.setBookMediaType("纸张");
				book.setBookPrice(price);
				book.setBookSetPrice(price);
				book.setBookSource("订购");
				book.setBookStatus("在馆");
				book.setCreateBy("admin");
				book.setCreateTime(now);
				book.setUpdateBy("admin");
				book.setUpdateTime(now);
				book.setNowDeptId(100);
				book.setNowLocalId(1);
				book.setOriDeptId(100);
				book.setOriLocalId(1);
				book.setIndexId(bookIndexWithId.getIndexId());
				bookRepository.save(book);
			}
			
			
			
		}
		finish=true;
		return finish;
	}
	
	@ResponseBody
	@RequestMapping("/insertReaderAndCircle/{num}")
	public boolean insertReaderAndCircle(@PathVariable(value="num",required=true)Integer num) {
		boolean finish=false;
		boolean insertReader=false;
		if(insertReader) {
			int readerNostart=getMaxReaderBarocdeFromCirReader();//获取已使用的条码
			readerNostart++;//第一个未使用的读者证号
			for(int i=0;i<num;i++) {
				int readerNo=readerNostart+i;
				String readerNoStr=getReaderBarcode(readerNo);
				CirReaderEntity reader= new CirReaderEntity();
				Map<String, String> readerMap=RandomValue.getPersonInfo();
				String json = JSON.toJSONString(readerMap);
				reader = JSON.parseObject(json, CirReaderEntity.class);
				reader.setReaderNo(readerNoStr);
				reader.setCreateBy("admin");
				Timestamp createTime=RandomTimestamp.randomTimestamp("2012-12-31", "2020-12-31");
				reader.setCreateTime(createTime);
				reader.setDebt(BigDecimal.ZERO);
				reader.setDeposit(BigDecimal.ZERO);
				reader.setDeptId(100);
				reader.setExpireDate(new java.sql.Date(RandomTimestamp.randomDate("2022-12-31", "2025-12-31").getTime()));
				reader.setNation("汉");
				reader.setReaderPassword(readerNoStr);
				reader.setReaderStatus("0");//读者状态为正常
				reader.setReaderTypeId(1);
				reader.setReaderUnitId(null);
				reader.setStartDate(new java.sql.Date(createTime.getTime()));
				cirReaderRepository.save(reader);		
			}
		}
		
		boolean insertCircle=true;
		
		if(insertCircle) {
			List<CirReaderEntity> rids=findTestingReaderIds();
			
			int maxR=rids.size()-1;
			List<BookEntity> bids= findTestingBookIds();
			int maxB=bids.size()-1;
			for(int i=0;i<num;i++) {
				CirCircleEntity circle=new CirCircleEntity();
				int bi=getRandomInt(0, maxB);//随机图书id
				int ri=getRandomInt(0, maxR);
				circle.setBookId(bids.get(bi).getBookId());
				circle.setReaderId(rids.get(ri).getReaderId());
				circle.setBorrowDeptId(100);
				circle.setBorrowReaderTypeId(1);
				circle.setCreateBy("admin");
				Timestamp borrowTime=RandomTimestamp.randomTimestamp("2010-01-01", "2019-10-25");
				circle.setCreateTime(borrowTime);
				int day=30;//30天应还时间
				circle.setShouldReturnTime(new Timestamp(borrowTime.getTime()+((long) day) * 24 * 3600 * 1000));				
				if(getRandomInt(1, 100)>97) {//假设超期率有3%;
					int returnday=getRandomInt(31, 50);
					Timestamp returnTime=new Timestamp(borrowTime.getTime()+((long) returnday) * 24 * 3600 * 1000);
					if(returnTime.after(new Timestamp(new Date().getTime()))) {
						circle.setReturnType("n");//未归还
					}else {
						circle.setReturnBy("admin");
						circle.setReturnTime(returnTime);
						circle.setReturnType("o");//超期归还
						circle.setReturnDeptId(100);
					}
				}else {
					int returnday=getRandomInt(1, 30);
					Timestamp returnTime=new Timestamp(borrowTime.getTime()+((long) returnday) * 24 * 3600 * 1000);
					if(returnTime.after(new Timestamp(new Date().getTime()))) {
						circle.setReturnType("n");//未归还
					}else {
						circle.setReturnBy("admin");
						circle.setReturnTime(returnTime);
						circle.setReturnType("b");//正常归还
						circle.setReturnDeptId(100);
					}
				}
				
				circle.setIsInterlibraryLending("N");
				circle.setIsInterlibraryReturning("N");
				circle.setRenewTimes(0);
				cirCircleRepository.save(circle);
			}
			
		}
		
		
		
		
		
		
		
		
		
		finish=true;
		return finish;
	}
	
	
	
	
	public static int getRandomInt(int min,int max) {//1-5,随机数
		Random random = new Random();
		int s = random.nextInt(max)%(max-min+1) + min;
		return s;
	}
	
	//根据当前的数值获取9位的条码T000000001
	public String getBarcode(int barcodeNow) {
		return "X"+String.format("%08d", barcodeNow);
	}
	
	//返回读者证号
	public String getReaderBarcode(int readerBarcodeNow) {
		return "R"+String.format("%06d", readerBarcodeNow);
	}
	
	public List<CirReaderEntity> findTestingReaderIds(){
		List<Map> maps=cirReaderRepository.findTestingReaderIds();
		String json = JSON.toJSONString(maps);
		List<CirReaderEntity> readerids= JSON.parseArray(json, CirReaderEntity.class);
		return readerids;
	}
	
	public List<BookEntity> findTestingBookIds(){
		List<Map> maps=bookRepository.findTestingBookIds();
		String json = JSON.toJSONString(maps);
		List<BookEntity> bookids= JSON.parseArray(json, BookEntity.class);
		return bookids;
	}
	
	
	
	
	/**
	 * 获取已插入最大读者证号
	 * @return
	 */
	public int getMaxReaderBarocdeFromCirReader() {
		CirReaderEntity reader=cirReaderRepository.getCirReaderEntityByReaderBarcode();
		if(reader==null) {
			return 0;
		}else {
			int n=Integer.parseInt(reader.getReaderNo().replace("R", ""));
			return n;
		}
	}
	
	/**
	 * 获取已插入最大条码
	 * @return
	 */
	public int getMaxBarcodeFromBook() {
		BookEntity book=bookRepository.getBookEntityByBookBarcode();
		if(book==null) {
			return 0;
		}else {
			int n=Integer.parseInt(book.getBookBarcode().replace("X", ""));
			return n;
		}
		
	}
	
	//获取某成员馆某个分类最大种次号
	public BookClassMaxOrderNoEntity getBookClassMaxOrderNoEntity(String classno,int deptId) {
		BookClassMaxOrderNoEntity maxOrderNoEntity=bookClassMaxOrderNoJpaRepository.findOneByClassNoAndDeptId(classno, deptId);		
		return maxOrderNoEntity;
	}
	
	//生成索书号
	public BookIndexEntity getBookIndexByClassno(String classno,int bibId,BookClassMaxOrderNoEntity maxOrderNoEntity) {
		BookIndexEntity bi=new BookIndexEntity();
		bi.setBookNum(0);
		bi.setAuthorNo(null);
		bi.setClassNo(classno);
		
		bi.setDeptId(100);
		bi.setBibId(bibId);
		if(maxOrderNoEntity!=null) {//说明有
			int maxorder=maxOrderNoEntity.getClassMaxOrderNo();
			maxorder++;
			bi.setOrderNo(maxorder);
			bi.setCallNo(classno+"/"+maxorder);
		}else {
			bi.setOrderNo(1);
			bi.setCallNo(classno+"/1");
		}
		
		return bi;
	}
	
	public BibMaxRecordIdEntity getBibMaxRecordIdEntity() {
		return bibMaxRecordIdRepository.findById(1).get();//获取当前馆的最大书目记录号
	}
	
	
	
	
	public static String getContentByMarcType(MarcUtil marcUtil,String subFieldAndTag) {
		String subfieldContent=null;
		subfieldContent=marcUtil.getSubFieldByTag(subFieldAndTag);		
		return subfieldContent;
	}
	
	/**
	 * 按marc类型读取marc数据，设置书目相关字段内容，但不包括marc内容
	 * @param marcUtil
	 * @param marcType
	 * @return
	 */
	public static BibEntity setBib(MarcUtil marcUtil,MarcTypeEntity marcType) {
		BibEntity bib=new BibEntity();
		if(marcUtil.isValid()){
			bib.setAuthor(getContentByMarcType(marcUtil,marcType.getAuthor()));
			bib.setAttachment(getContentByMarcType(marcUtil,marcType.getAttachment()));
			bib.setBooksize(getContentByMarcType(marcUtil,marcType.getBooksize()));
			bib.setClassno(getContentByMarcType(marcUtil,marcType.getClassno()));
			bib.setDoctype(getContentByMarcType(marcUtil,marcType.getDoctype()));
			bib.setEdition(getContentByMarcType(marcUtil,marcType.getEdition()));
			bib.setFrequency(getContentByMarcType(marcUtil,marcType.getFrequency()));
			bib.setIsbn(getContentByMarcType(marcUtil,marcType.getIsbn()));
			bib.setIssn(getContentByMarcType(marcUtil,marcType.getIssn()));
			bib.setLanguage(getContentByMarcType(marcUtil,marcType.getLanguage()));
			bib.setOrderno(getContentByMarcType(marcUtil,marcType.getOrderno()));
			bib.setOtherAuthor(getContentByMarcType(marcUtil, marcType.getOtherAuthor()));
			bib.setPage(getContentByMarcType(marcUtil,marcType.getPage()));
			bib.setParallelTitle(getContentByMarcType(marcUtil,marcType.getParallelTitle()));
			bib.setPrice(getContentByMarcType(marcUtil,marcType.getPrice()));
			bib.setProductBarcode(marcUtil.getProductBarCode(marcType.getIsbn()));//设置图书的商品条码
			bib.setPubdate(getContentByMarcType(marcUtil,marcType.getPubdate()));
			bib.setPublisher(getContentByMarcType(marcUtil,marcType.getPublisher()));
			bib.setPubplace(getContentByMarcType(marcUtil,marcType.getPubplace()));
//			bib.setRemark(getContentByMarcType(marcUtil,marcType.getRemark()));
			bib.setSeriesAuthor(getContentByMarcType(marcUtil,marcType.getSeriesAuthor()));
			bib.setSeriesTitle(getContentByMarcType(marcUtil,marcType.getSeriesTitle()));
			bib.setSubject(getContentByMarcType(marcUtil,marcType.getSubject()));
			bib.setSubtitle(getContentByMarcType(marcUtil,marcType.getSubtitle()));
			bib.setSummary(getContentByMarcType(marcUtil,marcType.getSummary()));
			bib.setTitle(getContentByMarcType(marcUtil,marcType.getTitle()));
			bib.setUpno(getContentByMarcType(marcUtil,marcType.getUpno()));
			bib.setWithnote(getContentByMarcType(marcUtil,marcType.getWithnote()));
			return bib;
		}else {
			return null;
		}
	}
}
