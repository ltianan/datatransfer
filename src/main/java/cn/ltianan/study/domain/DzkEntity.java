package cn.ltianan.study.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "DZK", schema = "dbo")
public class DzkEntity {
    private String readercode;
    private String name;
    private String sex;
    private String readerclass;
    private String readunit;
    private Integer bookcount;
    private Integer daycount;
    private Integer orderbook;
    private Integer ordercount;
    private Integer orderday;
    private Integer yordercshu;
    private Integer acount;
    private Integer bcount;
    private Integer yAcount;
    private Integer yBcount;
    private Integer recount;
    private Integer reday;
    private Integer yrecount;
    private boolean ifcanre;
    private BigDecimal fine;
    private BigDecimal defile;
    private BigDecimal lost;
    private boolean wuzheng;
    private String readstatus;
    private Date term;
    private Date paperdate;
    private byte[] photo;
    private Integer yycount;
    private String memo;
    private Date eDate;
    private Integer gkcount;
    private Integer gkdaycount;
    private Integer gkorderbook;

    @Id
    @Column(name = "readercode", nullable = false, length = 20)
    public String getReadercode() {
        return readercode;
    }

    public void setReadercode(String readercode) {
        this.readercode = readercode;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "readerclass", nullable = true, length = 20)
    public String getReaderclass() {
        return readerclass;
    }

    public void setReaderclass(String readerclass) {
        this.readerclass = readerclass;
    }

    @Basic
    @Column(name = "readunit", nullable = true, length = 50)
    public String getReadunit() {
        return readunit;
    }

    public void setReadunit(String readunit) {
        this.readunit = readunit;
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
    @Column(name = "daycount", nullable = true)
    public Integer getDaycount() {
        return daycount;
    }

    public void setDaycount(Integer daycount) {
        this.daycount = daycount;
    }

    @Basic
    @Column(name = "orderbook", nullable = true)
    public Integer getOrderbook() {
        return orderbook;
    }

    public void setOrderbook(Integer orderbook) {
        this.orderbook = orderbook;
    }

    @Basic
    @Column(name = "ordercount", nullable = true)
    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    @Basic
    @Column(name = "orderday", nullable = true)
    public Integer getOrderday() {
        return orderday;
    }

    public void setOrderday(Integer orderday) {
        this.orderday = orderday;
    }

    @Basic
    @Column(name = "yordercshu", nullable = true)
    public Integer getYordercshu() {
        return yordercshu;
    }

    public void setYordercshu(Integer yordercshu) {
        this.yordercshu = yordercshu;
    }

    @Basic
    @Column(name = "Acount", nullable = true)
    public Integer getAcount() {
        return acount;
    }

    public void setAcount(Integer acount) {
        this.acount = acount;
    }

    @Basic
    @Column(name = "Bcount", nullable = true)
    public Integer getBcount() {
        return bcount;
    }

    public void setBcount(Integer bcount) {
        this.bcount = bcount;
    }

    @Basic
    @Column(name = "yAcount", nullable = true)
    public Integer getyAcount() {
        return yAcount;
    }

    public void setyAcount(Integer yAcount) {
        this.yAcount = yAcount;
    }

    @Basic
    @Column(name = "yBcount", nullable = true)
    public Integer getyBcount() {
        return yBcount;
    }

    public void setyBcount(Integer yBcount) {
        this.yBcount = yBcount;
    }

    @Basic
    @Column(name = "recount", nullable = true)
    public Integer getRecount() {
        return recount;
    }

    public void setRecount(Integer recount) {
        this.recount = recount;
    }

    @Basic
    @Column(name = "reday", nullable = true)
    public Integer getReday() {
        return reday;
    }

    public void setReday(Integer reday) {
        this.reday = reday;
    }

    @Basic
    @Column(name = "yrecount", nullable = true)
    public Integer getYrecount() {
        return yrecount;
    }

    public void setYrecount(Integer yrecount) {
        this.yrecount = yrecount;
    }

    @Basic
    @Column(name = "ifcanre", nullable = false)
    public boolean isIfcanre() {
        return ifcanre;
    }

    public void setIfcanre(boolean ifcanre) {
        this.ifcanre = ifcanre;
    }

    @Basic
    @Column(name = "fine", nullable = true, precision = 2)
    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    @Basic
    @Column(name = "defile", nullable = true, precision = 2)
    public BigDecimal getDefile() {
        return defile;
    }

    public void setDefile(BigDecimal defile) {
        this.defile = defile;
    }

    @Basic
    @Column(name = "lost", nullable = true, precision = 2)
    public BigDecimal getLost() {
        return lost;
    }

    public void setLost(BigDecimal lost) {
        this.lost = lost;
    }

    @Basic
    @Column(name = "wuzheng", nullable = false)
    public boolean isWuzheng() {
        return wuzheng;
    }

    public void setWuzheng(boolean wuzheng) {
        this.wuzheng = wuzheng;
    }

    @Basic
    @Column(name = "readstatus", nullable = true, length = 10)
    public String getReadstatus() {
        return readstatus;
    }

    public void setReadstatus(String readstatus) {
        this.readstatus = readstatus;
    }

    @Basic
    @Column(name = "term", nullable = true)
    public Date getTerm() {
        return term;
    }

    public void setTerm(Date term) {
        this.term = term;
    }

    @Basic
    @Column(name = "paperdate", nullable = true)
    public Date getPaperdate() {
        return paperdate;
    }

    public void setPaperdate(Date paperdate) {
        this.paperdate = paperdate;
    }

    @Basic
    @Column(name = "photo", nullable = true)
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "yycount", nullable = true)
    public Integer getYycount() {
        return yycount;
    }

    public void setYycount(Integer yycount) {
        this.yycount = yycount;
    }

    @Basic
    @Column(name = "memo", nullable = true, length = 100)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "eDate", nullable = true)
    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }

    @Basic
    @Column(name = "gkcount", nullable = true)
    public Integer getGkcount() {
        return gkcount;
    }

    public void setGkcount(Integer gkcount) {
        this.gkcount = gkcount;
    }

    @Basic
    @Column(name = "gkdaycount", nullable = true)
    public Integer getGkdaycount() {
        return gkdaycount;
    }

    public void setGkdaycount(Integer gkdaycount) {
        this.gkdaycount = gkdaycount;
    }

    @Basic
    @Column(name = "gkorderbook", nullable = true)
    public Integer getGkorderbook() {
        return gkorderbook;
    }

    public void setGkorderbook(Integer gkorderbook) {
        this.gkorderbook = gkorderbook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DzkEntity dzkEntity = (DzkEntity) o;
        return ifcanre == dzkEntity.ifcanre &&
                wuzheng == dzkEntity.wuzheng &&
                Objects.equals(readercode, dzkEntity.readercode) &&
                Objects.equals(name, dzkEntity.name) &&
                Objects.equals(sex, dzkEntity.sex) &&
                Objects.equals(readerclass, dzkEntity.readerclass) &&
                Objects.equals(readunit, dzkEntity.readunit) &&
                Objects.equals(bookcount, dzkEntity.bookcount) &&
                Objects.equals(daycount, dzkEntity.daycount) &&
                Objects.equals(orderbook, dzkEntity.orderbook) &&
                Objects.equals(ordercount, dzkEntity.ordercount) &&
                Objects.equals(orderday, dzkEntity.orderday) &&
                Objects.equals(yordercshu, dzkEntity.yordercshu) &&
                Objects.equals(acount, dzkEntity.acount) &&
                Objects.equals(bcount, dzkEntity.bcount) &&
                Objects.equals(yAcount, dzkEntity.yAcount) &&
                Objects.equals(yBcount, dzkEntity.yBcount) &&
                Objects.equals(recount, dzkEntity.recount) &&
                Objects.equals(reday, dzkEntity.reday) &&
                Objects.equals(yrecount, dzkEntity.yrecount) &&
                Objects.equals(fine, dzkEntity.fine) &&
                Objects.equals(defile, dzkEntity.defile) &&
                Objects.equals(lost, dzkEntity.lost) &&
                Objects.equals(readstatus, dzkEntity.readstatus) &&
                Objects.equals(term, dzkEntity.term) &&
                Objects.equals(paperdate, dzkEntity.paperdate) &&
                Arrays.equals(photo, dzkEntity.photo) &&
                Objects.equals(yycount, dzkEntity.yycount) &&
                Objects.equals(memo, dzkEntity.memo) &&
                Objects.equals(eDate, dzkEntity.eDate) &&
                Objects.equals(gkcount, dzkEntity.gkcount) &&
                Objects.equals(gkdaycount, dzkEntity.gkdaycount) &&
                Objects.equals(gkorderbook, dzkEntity.gkorderbook);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(readercode, name, sex, readerclass, readunit, bookcount, daycount, orderbook, ordercount, orderday, yordercshu, acount, bcount, yAcount, yBcount, recount, reday, yrecount, ifcanre, fine, defile, lost, wuzheng, readstatus, term, paperdate, yycount, memo, eDate, gkcount, gkdaycount, gkorderbook);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
