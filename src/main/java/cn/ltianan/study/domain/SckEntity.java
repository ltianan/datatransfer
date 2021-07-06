package cn.ltianan.study.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "SCK", schema = "dbo")
public class SckEntity {
    private Integer zskid;
    private int sckid;
    private String barcode;
    private String rollcode;
    private String bookplace;
    private BigDecimal price;
    private boolean borrowstatus;
    private String bookstatus;
    private String operator;
    private Timestamp opertime;
    private String cePrice;
    private String ceHblx;

    @Basic
    @Column(name = "zskid", nullable = true)
    public Integer getZskid() {
        return zskid;
    }

    public void setZskid(Integer zskid) {
        this.zskid = zskid;
    }

    @Basic
    @Column(name = "sckid", nullable = false)
    public int getSckid() {
        return sckid;
    }

    public void setSckid(int sckid) {
        this.sckid = sckid;
    }

    @Id
    @Column(name = "barcode", nullable = false, length = 20)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Basic
    @Column(name = "rollcode", nullable = true, length = 50)
    public String getRollcode() {
        return rollcode;
    }

    public void setRollcode(String rollcode) {
        this.rollcode = rollcode;
    }

    @Basic
    @Column(name = "bookplace", nullable = true, length = 50)
    public String getBookplace() {
        return bookplace;
    }

    public void setBookplace(String bookplace) {
        this.bookplace = bookplace;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "borrowstatus", nullable = false)
    public boolean isBorrowstatus() {
        return borrowstatus;
    }

    public void setBorrowstatus(boolean borrowstatus) {
        this.borrowstatus = borrowstatus;
    }

    @Basic
    @Column(name = "bookstatus", nullable = true, length = 10)
    public String getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
    }

    @Basic
    @Column(name = "operator", nullable = false, length = 20)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "opertime", nullable = false)
    public Timestamp getOpertime() {
        return opertime;
    }

    public void setOpertime(Timestamp opertime) {
        this.opertime = opertime;
    }

    @Basic
    @Column(name = "cePrice", nullable = true, length = 20)
    public String getCePrice() {
        return cePrice;
    }

    public void setCePrice(String cePrice) {
        this.cePrice = cePrice;
    }

    @Basic
    @Column(name = "ceHBLX", nullable = true, length = 20)
    public String getCeHblx() {
        return ceHblx;
    }

    public void setCeHblx(String ceHblx) {
        this.ceHblx = ceHblx;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SckEntity sckEntity = (SckEntity) o;
        return sckid == sckEntity.sckid &&
                borrowstatus == sckEntity.borrowstatus &&
                Objects.equals(zskid, sckEntity.zskid) &&
                Objects.equals(barcode, sckEntity.barcode) &&
                Objects.equals(rollcode, sckEntity.rollcode) &&
                Objects.equals(bookplace, sckEntity.bookplace) &&
                Objects.equals(price, sckEntity.price) &&
                Objects.equals(bookstatus, sckEntity.bookstatus) &&
                Objects.equals(operator, sckEntity.operator) &&
                Objects.equals(opertime, sckEntity.opertime) &&
                Objects.equals(cePrice, sckEntity.cePrice) &&
                Objects.equals(ceHblx, sckEntity.ceHblx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zskid, sckid, barcode, rollcode, bookplace, price, borrowstatus, bookstatus, operator, opertime, cePrice, ceHblx);
    }
}
