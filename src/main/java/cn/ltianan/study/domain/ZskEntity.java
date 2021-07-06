package cn.ltianan.study.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ZSK", schema = "dbo")
public class ZskEntity {
    private int zskid;
    private String cataman;
    private Timestamp catatime;
    private String bookname;
    private String othername;
    private String funame;
    private String author;
    private String edition;
    private String isbn;
    private String pubplace;
    private String publisher;
    private String pubdate;
    private String pages;
    private String appendix;
    private String classcode;
    private String authorcode;
    private String books;
    private String booksauthor;
    private String endnote;
    private String docclass;
    private String measure;
    private Integer bookcount;
    private Short zch;
    private String zdfs;
    private String ztc;
    private String lagclass;
    private String marc;
    private String fzqfh;
    private String cbbh;
    private String tubiao;
    private String yuedu;
    private String laiyuan;
    private String zsktemp;

    @Id
    @Column(name = "zskid", nullable = false)
    public int getZskid() {
        return zskid;
    }

    public void setZskid(int zskid) {
        this.zskid = zskid;
    }

    @Basic
    @Column(name = "cataman", nullable = true, length = 20)
    public String getCataman() {
        return cataman;
    }

    public void setCataman(String cataman) {
        this.cataman = cataman;
    }

    @Basic
    @Column(name = "catatime", nullable = true)
    public Timestamp getCatatime() {
        return catatime;
    }

    public void setCatatime(Timestamp catatime) {
        this.catatime = catatime;
    }

    @Basic
    @Column(name = "bookname", nullable = true, length = 500)
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Basic
    @Column(name = "othername", nullable = true, length = 300)
    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    @Basic
    @Column(name = "funame", nullable = true, length = 300)
    public String getFuname() {
        return funame;
    }

    public void setFuname(String funame) {
        this.funame = funame;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 200)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "edition", nullable = true, length = 20)
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "ISBN", nullable = true, length = 17)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "pubplace", nullable = true, length = 50)
    public String getPubplace() {
        return pubplace;
    }

    public void setPubplace(String pubplace) {
        this.pubplace = pubplace;
    }

    @Basic
    @Column(name = "publisher", nullable = true, length = 50)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "pubdate", nullable = true, length = 10)
    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "pages", nullable = true, length = 50)
    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    @Basic
    @Column(name = "appendix", nullable = true, length = 50)
    public String getAppendix() {
        return appendix;
    }

    public void setAppendix(String appendix) {
        this.appendix = appendix;
    }

    @Basic
    @Column(name = "classcode", nullable = true, length = 20)
    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    @Basic
    @Column(name = "authorcode", nullable = true, length = 10)
    public String getAuthorcode() {
        return authorcode;
    }

    public void setAuthorcode(String authorcode) {
        this.authorcode = authorcode;
    }

    @Basic
    @Column(name = "books", nullable = true, length = 200)
    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    @Basic
    @Column(name = "booksauthor", nullable = true, length = 50)
    public String getBooksauthor() {
        return booksauthor;
    }

    public void setBooksauthor(String booksauthor) {
        this.booksauthor = booksauthor;
    }

    @Basic
    @Column(name = "endnote", nullable = true, length = 500)
    public String getEndnote() {
        return endnote;
    }

    public void setEndnote(String endnote) {
        this.endnote = endnote;
    }

    @Basic
    @Column(name = "docclass", nullable = true, length = 20)
    public String getDocclass() {
        return docclass;
    }

    public void setDocclass(String docclass) {
        this.docclass = docclass;
    }

    @Basic
    @Column(name = "measure", nullable = true, length = 20)
    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Basic
    @Column(name = "bookcount", nullable = true)
    public Integer getBookcount() {
        return bookcount;
    }

    public void setBookcount(Integer bookcount) {
        this.bookcount = bookcount;
    }

    @Basic
    @Column(name = "zch", nullable = true)
    public Short getZch() {
        return zch;
    }

    public void setZch(Short zch) {
        this.zch = zch;
    }

    @Basic
    @Column(name = "zdfs", nullable = true, length = 10)
    public String getZdfs() {
        return zdfs;
    }

    public void setZdfs(String zdfs) {
        this.zdfs = zdfs;
    }

    @Basic
    @Column(name = "ztc", nullable = true, length = 61)
    public String getZtc() {
        return ztc;
    }

    public void setZtc(String ztc) {
        this.ztc = ztc;
    }

    @Basic
    @Column(name = "lagclass", nullable = true, length = 10)
    public String getLagclass() {
        return lagclass;
    }

    public void setLagclass(String lagclass) {
        this.lagclass = lagclass;
    }

    @Basic
    @Column(name = "marc", nullable = true, length = -1)
    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    @Basic
    @Column(name = "fzqfh", nullable = false, length = 20)
    public String getFzqfh() {
        return fzqfh;
    }

    public void setFzqfh(String fzqfh) {
        this.fzqfh = fzqfh;
    }

    @Basic
    @Column(name = "cbbh", nullable = true, length = 20)
    public String getCbbh() {
        return cbbh;
    }

    public void setCbbh(String cbbh) {
        this.cbbh = cbbh;
    }

    @Basic
    @Column(name = "tubiao", nullable = true, length = 50)
    public String getTubiao() {
        return tubiao;
    }

    public void setTubiao(String tubiao) {
        this.tubiao = tubiao;
    }

    @Basic
    @Column(name = "yuedu", nullable = true, length = 20)
    public String getYuedu() {
        return yuedu;
    }

    public void setYuedu(String yuedu) {
        this.yuedu = yuedu;
    }

    @Basic
    @Column(name = "laiyuan", nullable = true, length = 20)
    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    @Basic
    @Column(name = "zsktemp", nullable = true, length = 100)
    public String getZsktemp() {
        return zsktemp;
    }

    public void setZsktemp(String zsktemp) {
        this.zsktemp = zsktemp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZskEntity zskEntity = (ZskEntity) o;
        return zskid == zskEntity.zskid &&
                Objects.equals(cataman, zskEntity.cataman) &&
                Objects.equals(catatime, zskEntity.catatime) &&
                Objects.equals(bookname, zskEntity.bookname) &&
                Objects.equals(othername, zskEntity.othername) &&
                Objects.equals(funame, zskEntity.funame) &&
                Objects.equals(author, zskEntity.author) &&
                Objects.equals(edition, zskEntity.edition) &&
                Objects.equals(isbn, zskEntity.isbn) &&
                Objects.equals(pubplace, zskEntity.pubplace) &&
                Objects.equals(publisher, zskEntity.publisher) &&
                Objects.equals(pubdate, zskEntity.pubdate) &&
                Objects.equals(pages, zskEntity.pages) &&
                Objects.equals(appendix, zskEntity.appendix) &&
                Objects.equals(classcode, zskEntity.classcode) &&
                Objects.equals(authorcode, zskEntity.authorcode) &&
                Objects.equals(books, zskEntity.books) &&
                Objects.equals(booksauthor, zskEntity.booksauthor) &&
                Objects.equals(endnote, zskEntity.endnote) &&
                Objects.equals(docclass, zskEntity.docclass) &&
                Objects.equals(measure, zskEntity.measure) &&
                Objects.equals(bookcount, zskEntity.bookcount) &&
                Objects.equals(zch, zskEntity.zch) &&
                Objects.equals(zdfs, zskEntity.zdfs) &&
                Objects.equals(ztc, zskEntity.ztc) &&
                Objects.equals(lagclass, zskEntity.lagclass) &&
                Objects.equals(marc, zskEntity.marc) &&
                Objects.equals(fzqfh, zskEntity.fzqfh) &&
                Objects.equals(cbbh, zskEntity.cbbh) &&
                Objects.equals(tubiao, zskEntity.tubiao) &&
                Objects.equals(yuedu, zskEntity.yuedu) &&
                Objects.equals(laiyuan, zskEntity.laiyuan) &&
                Objects.equals(zsktemp, zskEntity.zsktemp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zskid, cataman, catatime, bookname, othername, funame, author, edition, isbn, pubplace, publisher, pubdate, pages, appendix, classcode, authorcode, books, booksauthor, endnote, docclass, measure, bookcount, zch, zdfs, ztc, lagclass, marc, fzqfh, cbbh, tubiao, yuedu, laiyuan, zsktemp);
    }
}
