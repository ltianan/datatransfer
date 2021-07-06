package cn.ltianan.study.domain;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "marcinfo", schema = "public", catalog = "sjlibold")
public class MarcinfoEntity {
    private String marcid;
    private String marcnrong;
    private String marcxml;
    private String ztai;
    private boolean fujian;
    private String leixing;
    private String flag;
    private byte[] fengmian;
    private String fengmianfile;
    private boolean havefengmian;

    @Id
    @Column(name = "marcid", nullable = false, length = 32)
    public String getMarcid() {
        return marcid;
    }

    public void setMarcid(String marcid) {
        this.marcid = marcid;
    }

    @Basic
    @Column(name = "marcnrong", nullable = false, length = -1)
    public String getMarcnrong() {
        return marcnrong;
    }

    public void setMarcnrong(String marcnrong) {
        this.marcnrong = marcnrong;
    }

    @Basic
    @Column(name = "marcxml", nullable = true, length = -1)
    public String getMarcxml() {
        return marcxml;
    }

    public void setMarcxml(String marcxml) {
        this.marcxml = marcxml;
    }

    @Basic
    @Column(name = "ztai", nullable = false, length = 3)
    public String getZtai() {
        return ztai;
    }

    public void setZtai(String ztai) {
        this.ztai = ztai;
    }

    @Basic
    @Column(name = "fujian", nullable = false)
    public boolean isFujian() {
        return fujian;
    }

    public void setFujian(boolean fujian) {
        this.fujian = fujian;
    }

    @Basic
    @Column(name = "leixing", nullable = false, length = 10)
    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    @Basic
    @Column(name = "flag", nullable = true, length = 32)
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "fengmian", nullable = true)
    public byte[] getFengmian() {
        return fengmian;
    }

    public void setFengmian(byte[] fengmian) {
        this.fengmian = fengmian;
    }

    @Basic
    @Column(name = "fengmianfile", nullable = true, length = 250)
    public String getFengmianfile() {
        return fengmianfile;
    }

    public void setFengmianfile(String fengmianfile) {
        this.fengmianfile = fengmianfile;
    }

    @Basic
    @Column(name = "havefengmian", nullable = false)
    public boolean isHavefengmian() {
        return havefengmian;
    }

    public void setHavefengmian(boolean havefengmian) {
        this.havefengmian = havefengmian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcinfoEntity that = (MarcinfoEntity) o;

        if (fujian != that.fujian) return false;
        if (havefengmian != that.havefengmian) return false;
        if (marcid != null ? !marcid.equals(that.marcid) : that.marcid != null) return false;
        if (marcnrong != null ? !marcnrong.equals(that.marcnrong) : that.marcnrong != null) return false;
        if (marcxml != null ? !marcxml.equals(that.marcxml) : that.marcxml != null) return false;
        if (ztai != null ? !ztai.equals(that.ztai) : that.ztai != null) return false;
        if (leixing != null ? !leixing.equals(that.leixing) : that.leixing != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (!Arrays.equals(fengmian, that.fengmian)) return false;
        if (fengmianfile != null ? !fengmianfile.equals(that.fengmianfile) : that.fengmianfile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = marcid != null ? marcid.hashCode() : 0;
        result = 31 * result + (marcnrong != null ? marcnrong.hashCode() : 0);
        result = 31 * result + (marcxml != null ? marcxml.hashCode() : 0);
        result = 31 * result + (ztai != null ? ztai.hashCode() : 0);
        result = 31 * result + (fujian ? 1 : 0);
        result = 31 * result + (leixing != null ? leixing.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(fengmian);
        result = 31 * result + (fengmianfile != null ? fengmianfile.hashCode() : 0);
        result = 31 * result + (havefengmian ? 1 : 0);
        return result;
    }
}
