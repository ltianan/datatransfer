package cn.ltianan.study.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JHSK", schema = "dbo")
public class JhskEntity {
    private int jhskid;
    private String readercode;
    private String barcode;
    private Date orderdate;
    private Date yhdate;
    private String operater;
    private Integer res;

    @Id
    @Column(name = "jhskid", nullable = false)
    public int getJhskid() {
        return jhskid;
    }

    public void setJhskid(int jhskid) {
        this.jhskid = jhskid;
    }

    @Basic
    @Column(name = "readercode", nullable = true, length = 20)
    public String getReadercode() {
        return readercode;
    }

    public void setReadercode(String readercode) {
        this.readercode = readercode;
    }

    @Basic
    @Column(name = "barcode", nullable = true, length = 20)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Basic
    @Column(name = "orderdate", nullable = true)
    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Basic
    @Column(name = "yhdate", nullable = true)
    public Date getYhdate() {
        return yhdate;
    }

    public void setYhdate(Date yhdate) {
        this.yhdate = yhdate;
    }

    @Basic
    @Column(name = "operater", nullable = true, length = 20)
    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    @Basic
    @Column(name = "res", nullable = true)
    public Integer getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JhskEntity that = (JhskEntity) o;
        return jhskid == that.jhskid &&
                Objects.equals(readercode, that.readercode) &&
                Objects.equals(barcode, that.barcode) &&
                Objects.equals(orderdate, that.orderdate) &&
                Objects.equals(yhdate, that.yhdate) &&
                Objects.equals(operater, that.operater) &&
                Objects.equals(res, that.res);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jhskid, readercode, barcode, orderdate, yhdate, operater, res);
    }
}
