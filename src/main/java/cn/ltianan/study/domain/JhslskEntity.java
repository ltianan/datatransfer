package cn.ltianan.study.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JHSLSK", schema = "dbo")
public class JhslskEntity {
    private int jhslsk;
    private String readercode;
    private String barcode;
    private Date orderdate;
    private Date yhdate;
    private Date backdate;
    private String operater;

    @Id
    @Column(name = "jhslsk", nullable = false)
    public int getJhslsk() {
        return jhslsk;
    }

    public void setJhslsk(int jhslsk) {
        this.jhslsk = jhslsk;
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
    @Column(name = "backdate", nullable = true)
    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    @Basic
    @Column(name = "operater", nullable = true, length = 20)
    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JhslskEntity that = (JhslskEntity) o;
        return jhslsk == that.jhslsk &&
                Objects.equals(readercode, that.readercode) &&
                Objects.equals(barcode, that.barcode) &&
                Objects.equals(orderdate, that.orderdate) &&
                Objects.equals(yhdate, that.yhdate) &&
                Objects.equals(backdate, that.backdate) &&
                Objects.equals(operater, that.operater);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jhslsk, readercode, barcode, orderdate, yhdate, backdate, operater);
    }
}
