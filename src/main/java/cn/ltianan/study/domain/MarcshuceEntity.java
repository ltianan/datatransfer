package cn.ltianan.study.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "marcshuce", schema = "public", catalog = "sjlibold")
public class MarcshuceEntity {
    private String shuceid;
    private String sshid;
    private String ydsmid;
    private String yssmid;
    private String tiaoma;
    private String ztai;
    private String userid;
    private Timestamp optime;
    private BigDecimal taojia;
    private BigDecimal cejia;
    private String jzleixing;
    private String zdfangshi;
    private String wxlyuan;
    private String beizhu;
    private String jcmshu;
    private String yjbshi;
    private Timestamp yjoptime;
    private String qkyssmid;
    private int zjcshu;

    @Id
    @Column(name = "shuceid", nullable = false, length = 32)
    public String getShuceid() {
        return shuceid;
    }

    public void setShuceid(String shuceid) {
        this.shuceid = shuceid;
    }

    @Basic
    @Column(name = "sshid", nullable = false, length = 32)
    public String getSshid() {
        return sshid;
    }

    public void setSshid(String sshid) {
        this.sshid = sshid;
    }

    @Basic
    @Column(name = "ydsmid", nullable = true, length = 32)
    public String getYdsmid() {
        return ydsmid;
    }

    public void setYdsmid(String ydsmid) {
        this.ydsmid = ydsmid;
    }

    @Basic
    @Column(name = "yssmid", nullable = true, length = 32)
    public String getYssmid() {
        return yssmid;
    }

    public void setYssmid(String yssmid) {
        this.yssmid = yssmid;
    }

    @Basic
    @Column(name = "tiaoma", nullable = false, length = 100)
    public String getTiaoma() {
        return tiaoma;
    }

    public void setTiaoma(String tiaoma) {
        this.tiaoma = tiaoma;
    }

    @Basic
    @Column(name = "ztai", nullable = false, length = 10)
    public String getZtai() {
        return ztai;
    }

    public void setZtai(String ztai) {
        this.ztai = ztai;
    }

    @Basic
    @Column(name = "userid", nullable = false, length = 32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "optime", nullable = false)
    public Timestamp getOptime() {
        return optime;
    }

    public void setOptime(Timestamp optime) {
        this.optime = optime;
    }

    @Basic
    @Column(name = "taojia", nullable = false, precision = 2)
    public BigDecimal getTaojia() {
        return taojia;
    }

    public void setTaojia(BigDecimal taojia) {
        this.taojia = taojia;
    }

    @Basic
    @Column(name = "cejia", nullable = false, precision = 2)
    public BigDecimal getCejia() {
        return cejia;
    }

    public void setCejia(BigDecimal cejia) {
        this.cejia = cejia;
    }

    @Basic
    @Column(name = "jzleixing", nullable = true, length = 100)
    public String getJzleixing() {
        return jzleixing;
    }

    public void setJzleixing(String jzleixing) {
        this.jzleixing = jzleixing;
    }

    @Basic
    @Column(name = "zdfangshi", nullable = true, length = 100)
    public String getZdfangshi() {
        return zdfangshi;
    }

    public void setZdfangshi(String zdfangshi) {
        this.zdfangshi = zdfangshi;
    }

    @Basic
    @Column(name = "wxlyuan", nullable = true, length = 100)
    public String getWxlyuan() {
        return wxlyuan;
    }

    public void setWxlyuan(String wxlyuan) {
        this.wxlyuan = wxlyuan;
    }

    @Basic
    @Column(name = "beizhu", nullable = true, length = 200)
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "jcmshu", nullable = true, length = 100)
    public String getJcmshu() {
        return jcmshu;
    }

    public void setJcmshu(String jcmshu) {
        this.jcmshu = jcmshu;
    }

    @Basic
    @Column(name = "yjbshi", nullable = true, length = 50)
    public String getYjbshi() {
        return yjbshi;
    }

    public void setYjbshi(String yjbshi) {
        this.yjbshi = yjbshi;
    }

    @Basic
    @Column(name = "yjoptime", nullable = true)
    public Timestamp getYjoptime() {
        return yjoptime;
    }

    public void setYjoptime(Timestamp yjoptime) {
        this.yjoptime = yjoptime;
    }

    @Basic
    @Column(name = "qkyssmid", nullable = true, length = 32)
    public String getQkyssmid() {
        return qkyssmid;
    }

    public void setQkyssmid(String qkyssmid) {
        this.qkyssmid = qkyssmid;
    }

    @Basic
    @Column(name = "zjcshu", nullable = false)
    public int getZjcshu() {
        return zjcshu;
    }

    public void setZjcshu(int zjcshu) {
        this.zjcshu = zjcshu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcshuceEntity that = (MarcshuceEntity) o;

        if (zjcshu != that.zjcshu) return false;
        if (shuceid != null ? !shuceid.equals(that.shuceid) : that.shuceid != null) return false;
        if (sshid != null ? !sshid.equals(that.sshid) : that.sshid != null) return false;
        if (ydsmid != null ? !ydsmid.equals(that.ydsmid) : that.ydsmid != null) return false;
        if (yssmid != null ? !yssmid.equals(that.yssmid) : that.yssmid != null) return false;
        if (tiaoma != null ? !tiaoma.equals(that.tiaoma) : that.tiaoma != null) return false;
        if (ztai != null ? !ztai.equals(that.ztai) : that.ztai != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (optime != null ? !optime.equals(that.optime) : that.optime != null) return false;
        if (taojia != null ? !taojia.equals(that.taojia) : that.taojia != null) return false;
        if (cejia != null ? !cejia.equals(that.cejia) : that.cejia != null) return false;
        if (jzleixing != null ? !jzleixing.equals(that.jzleixing) : that.jzleixing != null) return false;
        if (zdfangshi != null ? !zdfangshi.equals(that.zdfangshi) : that.zdfangshi != null) return false;
        if (wxlyuan != null ? !wxlyuan.equals(that.wxlyuan) : that.wxlyuan != null) return false;
        if (beizhu != null ? !beizhu.equals(that.beizhu) : that.beizhu != null) return false;
        if (jcmshu != null ? !jcmshu.equals(that.jcmshu) : that.jcmshu != null) return false;
        if (yjbshi != null ? !yjbshi.equals(that.yjbshi) : that.yjbshi != null) return false;
        if (yjoptime != null ? !yjoptime.equals(that.yjoptime) : that.yjoptime != null) return false;
        if (qkyssmid != null ? !qkyssmid.equals(that.qkyssmid) : that.qkyssmid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shuceid != null ? shuceid.hashCode() : 0;
        result = 31 * result + (sshid != null ? sshid.hashCode() : 0);
        result = 31 * result + (ydsmid != null ? ydsmid.hashCode() : 0);
        result = 31 * result + (yssmid != null ? yssmid.hashCode() : 0);
        result = 31 * result + (tiaoma != null ? tiaoma.hashCode() : 0);
        result = 31 * result + (ztai != null ? ztai.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (optime != null ? optime.hashCode() : 0);
        result = 31 * result + (taojia != null ? taojia.hashCode() : 0);
        result = 31 * result + (cejia != null ? cejia.hashCode() : 0);
        result = 31 * result + (jzleixing != null ? jzleixing.hashCode() : 0);
        result = 31 * result + (zdfangshi != null ? zdfangshi.hashCode() : 0);
        result = 31 * result + (wxlyuan != null ? wxlyuan.hashCode() : 0);
        result = 31 * result + (beizhu != null ? beizhu.hashCode() : 0);
        result = 31 * result + (jcmshu != null ? jcmshu.hashCode() : 0);
        result = 31 * result + (yjbshi != null ? yjbshi.hashCode() : 0);
        result = 31 * result + (yjoptime != null ? yjoptime.hashCode() : 0);
        result = 31 * result + (qkyssmid != null ? qkyssmid.hashCode() : 0);
        result = 31 * result + zjcshu;
        return result;
    }
}
