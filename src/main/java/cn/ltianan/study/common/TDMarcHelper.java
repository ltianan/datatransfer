package cn.ltianan.study.common;

import cn.ltianan.study.domain.SckEntity;
import cn.ltianan.study.domain.ZskEntity;
import cn.ltianan.study.repository.primaryRepository.SckRepository;
import org.apache.commons.lang3.StringUtils;
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
        String easyMarc="";

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

        //TODO 生成编目时间
        String time = df.format(this.zsk.getCatatime());//编目日期
        StringBuilder stb = new StringBuilder("01003nam0 2200289   450 0010000555932005");
        stb.append(time+"");
        //ISBN ，price 价格
        if(StringUtils.isNotEmpty(ISBN)||StringUtils.isNotEmpty(price)){
            stb.append("010  ");
            if(StringUtils.isNotEmpty(ISBN)){
                stb.append("a"+ISBN);
            }
            if(StringUtils.isNotEmpty(price)){
                stb.append("d"+price);
            }
            stb.append("");
        }

        //lagclass 作品语种
        if(StringUtils.isNotEmpty(lagclass)){
            stb.append("1010 a"+lagclass+"");
        }
        //bookname 正题名，author 作者
        if(StringUtils.isNotEmpty(bookname)||StringUtils.isNotEmpty(author)||StringUtils.isNotEmpty(othername)){
            stb.append("2001 ");
            if(StringUtils.isNotEmpty(bookname)){
                stb.append("a"+bookname);
            }
            if(StringUtils.isNotEmpty(othername)){
                stb.append("d"+othername);
            }
            if(StringUtils.isNotEmpty(author)){
                stb.append("f"+author);
            }
            stb.append("");
        }
        //pubplace 出版地，publisher 出版社，pubdate 出版时间
        if(StringUtils.isNotEmpty(pubplace)||StringUtils.isNotEmpty(publisher)||StringUtils.isNotEmpty(pubdate)){
            stb.append("210  ");
            if(StringUtils.isNotEmpty(pubplace)){
                stb.append("a"+pubplace);
            }
            if(StringUtils.isNotEmpty(publisher)){
                stb.append("c"+publisher);
            }
            if(StringUtils.isNotEmpty(pubdate)){
                stb.append("d"+pubdate);
            }
            stb.append("");
        }
        //pages 页码，measure 尺寸
        if(StringUtils.isNotEmpty(pages)&&StringUtils.isNotEmpty(measure)){
            stb.append("215  a"+pages+"d"+measure+"");
        }else if(StringUtils.isNotEmpty(pages)){
            stb.append("215  a"+pages+"");
        }else if(StringUtils.isNotEmpty(measure)){
            stb.append("215  d"+measure+"");
        }
        //books 丛编题名; booksauthor 丛编责任说明;
        if(StringUtils.isNotEmpty(books)&&StringUtils.isNotEmpty(booksauthor)){
            stb.append("225  a"+books+"f"+booksauthor+"");
        }else if(StringUtils.isNotEmpty(books)){
            stb.append("225  a"+books+"");
        }else if(StringUtils.isNotEmpty(booksauthor)){
            stb.append("225  f"+booksauthor+"");
        }

//        //附注
//        if(StringUtils.isNotEmpty(ybfzhu)){
//            stb.append("300  a"+ybfzhu+"");
//        }

        //endnote 摘要;
        if(StringUtils.isNotEmpty(endnote)){
            stb.append("330  a"+endnote+"");
        }
        if(StringUtils.isNotEmpty(classcode)){
            stb.append("690  a"+classcode+"");
        }
        if(StringUtils.isNotEmpty(author)){
            stb.append("701 0a"+author+"");
        }
        easyMarc=stb.toString();
        return easyMarc;
    }
}
