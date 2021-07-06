package cn.ltianan.study.common;

import cn.ltianan.study.domain.SckEntity;
import cn.ltianan.study.domain.ZskEntity;
import cn.ltianan.study.repository.primaryRepository.SckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Optional;

/**
 * @Author Angle
 * @Date 2021-3-29
 */
public class TDMarcHelper {
    private static final DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss.0");

    @Autowired
    private SckRepository sckRepository;

    private ZskEntity zsk;

    public TDMarcHelper(ZskEntity zsk) {
        this.zsk = zsk;
    }

    public String getEasyMarcFromZsk(){
        String tdMarc="";

        Integer zskid=this.zsk.getZskid();
        String ISBN="";
        String othername="";
        String bookname="";
//        String ybfzhu="";
        String author="";
        String pubplace="";
        String publisher="";
        String pubdate="";
        String pages="";
        String measure="";
        String lagclass="";
        String price="";
        String classcode="";
        String books="";
        String booksauthor="";
        String endnote="";
        String newzskid="";
        String cygid="1";
        ISBN=this.zsk.getIsbn();
        othername=this.zsk.getOthername();
//        ybfzhu=this.zsk.getYbfzhu();
        bookname=this.zsk.getBookname();
        author=this.zsk.getAuthor();
        pubplace=this.zsk.getPubplace();
        publisher=this.zsk.getPublisher();
        pubdate=this.zsk.getPubdate();
        pages=this.zsk.getPages();
        measure=this.zsk.getMeasure();
        lagclass=this.zsk.getLagclass();
        books=this.zsk.getBooks();
        booksauthor=this.zsk.getBooksauthor();
        endnote=this.zsk.getEndnote();
        classcode=this.zsk.getClasscode();

        price=zsk.getZsktemp();

        bookname=bookname.replaceAll("'","''");
        othername=othername.replaceAll("'","''");
//        ybfzhu=ybfzhu.replaceAll("'","''");
        author=author.replaceAll("'","''");
        pubplace=pubplace.replaceAll("'","''");
        publisher=publisher.replaceAll("'","''");
        pubdate=pubdate.replaceAll("'","''");
        pages=pages.replaceAll("'","''");
        measure=measure.replaceAll("'","''");
        lagclass=lagclass.replaceAll("'","''");
        books=books.replaceAll("'","''");
        booksauthor=booksauthor.replaceAll("'","''");
        endnote=endnote.replaceAll("'","''");
        classcode=classcode.replaceAll("'","''");
        price=price.replaceAll("'","''");

        //TODO 生成编目时间
        String time = df.format(this.zsk.getCatatime());//编目日期
        StringBuilder stb = new StringBuilder("01003nam0 2200289   450 0010000555932005");
        stb.append(time+"");
        //ISBN ，price 价格
        if(!ISBN.equals("")){
            stb.append("010  a"+ISBN+"dCNY"+price+"");
        }else if(!price.equals("")){
            stb.append("010  dCNY"+price+"");
        }
        //lagclass 作品语种
        if(!lagclass.equals("")){
            stb.append("1010 a"+lagclass+"");
        }
        //bookname 正题名，author 作者
        if(!bookname.equals("")||!author.equals("")||!othername.equals("")){
            stb.append("2001 ");
            if(!bookname.equals("")){
                stb.append("a"+bookname);
            }
            if(!othername.equals("")){
                stb.append("d"+othername);
            }
            if(!author.equals("")){
                stb.append("f"+author);
            }
            stb.append("");
        }
        //pubplace 出版地，publisher 出版社，pubdate 出版时间
        if(!pubplace.equals("")&&!publisher.equals("")&&!pubdate.equals("")){
            stb.append("210  a"+pubplace+"c"+publisher+"d"+pubdate+"");
        }else if(!pubplace.equals("")&&!publisher.equals("")){
            stb.append("210  a"+pubplace+"c"+publisher+"");
        }else if(!pubplace.equals("")&&!pubdate.equals("")){
            stb.append("210  a"+pubplace+"d"+pubdate+"");
        }else if(!publisher.equals("")&&!pubdate.equals("")){
            stb.append("210  c"+publisher+"d"+pubdate+"");
        }
        //pages 页码，measure 尺寸
        if(!pages.equals("")&&!measure.equals("")){
            stb.append("215  a"+pages+"d"+measure+"");
        }else if(!pages.equals("")){
            stb.append("215  a"+pages+"");
        }else if(!measure.equals("")){
            stb.append("215  d"+measure+"");
        }
        //books 丛编题名; booksauthor 丛编责任说明;
        if(!books.equals("")&&!booksauthor.equals("")){
            stb.append("225  a"+books+"f"+booksauthor+"");
        }else if(!books.equals("")){
            stb.append("225  a"+books+"");
        }else if(!booksauthor.equals("")){
            stb.append("225  f"+booksauthor+"");
        }

//        //附注
//        if(!ybfzhu.equals("")){
//            stb.append("300  a"+ybfzhu+"");
//        }

        //endnote 摘要;
        if(!endnote.equals("")){
            stb.append("330  a"+endnote+"");
        }
        if(!classcode.equals("")){
            stb.append("690  a"+classcode+"");
        }
        if(!author.equals("")){
            stb.append("701 0a"+author+"");
        }
        tdMarc=stb.toString();
        return tdMarc;
    }
}
