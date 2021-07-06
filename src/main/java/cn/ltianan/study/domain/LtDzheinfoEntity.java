package cn.ltianan.study.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "lt_dzheinfo", schema = "public", catalog = "sjlibold")
public class LtDzheinfoEntity {
    private String dzid;
    private String dzzhao;
    private String xming;
    private String ztai;
    private String mima;
    private String zjlx;
    private String zjhma;
    private Timestamp jzrqi;
    private Timestamp qyrqi;
    private Timestamp bzrqi;
    private String zhuanye;
    private String zhiwu;
    private String zcheng;
    private String xueli;
    private String minzu;
    private Timestamp csrqi;
    private boolean xingbie;
    private String shouji;
    private String dianhua;
    private String dizhi;
    private String youbian;
    private String dzyjian;
    private String jiguan;
    private String xingqu;
    private int jifen;
    private int jycshu;
    private int yycshu;
    private int xjcshu;
    private int wzcshu;
    private int gjhjcshu;
    private BigDecimal qkuan;
    private BigDecimal yajin;
    private Timestamp optime;
    private byte[] zpian;
    private String zhiye;
    private Timestamp ztstartdate;
    private Timestamp ztenddate;
    private String dzdw;
    private String beizhu;
    private String openid;
    private String zpianyshi;
    private String xjh;
    private String xueduan;
    private String ban;
    private String ji;

    @Id
    @Column(name = "dzid", nullable = false, length = 32)
    public String getDzid() {
        return dzid;
    }

    public void setDzid(String dzid) {
        this.dzid = dzid;
    }

    @Basic
    @Column(name = "dzzhao", nullable = false, length = 60)
    public String getDzzhao() {
        return dzzhao;
    }

    public void setDzzhao(String dzzhao) {
        this.dzzhao = dzzhao;
    }

    @Basic
    @Column(name = "xming", nullable = false, length = 30)
    public String getXming() {
        return xming;
    }

    public void setXming(String xming) {
        this.xming = xming;
    }

    @Basic
    @Column(name = "ztai", nullable = false, length = 40)
    public String getZtai() {
        return ztai;
    }

    public void setZtai(String ztai) {
        this.ztai = ztai;
    }

    @Basic
    @Column(name = "mima", nullable = false, length = 30)
    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    @Basic
    @Column(name = "zjlx", nullable = true, length = 10)
    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    @Basic
    @Column(name = "zjhma", nullable = true, length = 60)
    public String getZjhma() {
        return zjhma;
    }

    public void setZjhma(String zjhma) {
        this.zjhma = zjhma;
    }

    @Basic
    @Column(name = "jzrqi", nullable = false)
    public Timestamp getJzrqi() {
        return jzrqi;
    }

    public void setJzrqi(Timestamp jzrqi) {
        this.jzrqi = jzrqi;
    }

    @Basic
    @Column(name = "qyrqi", nullable = false)
    public Timestamp getQyrqi() {
        return qyrqi;
    }

    public void setQyrqi(Timestamp qyrqi) {
        this.qyrqi = qyrqi;
    }

    @Basic
    @Column(name = "bzrqi", nullable = false)
    public Timestamp getBzrqi() {
        return bzrqi;
    }

    public void setBzrqi(Timestamp bzrqi) {
        this.bzrqi = bzrqi;
    }

    @Basic
    @Column(name = "zhuanye", nullable = true, length = 10)
    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    @Basic
    @Column(name = "zhiwu", nullable = true, length = 100)
    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    @Basic
    @Column(name = "zcheng", nullable = true, length = 100)
    public String getZcheng() {
        return zcheng;
    }

    public void setZcheng(String zcheng) {
        this.zcheng = zcheng;
    }

    @Basic
    @Column(name = "xueli", nullable = true, length = 100)
    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    @Basic
    @Column(name = "minzu", nullable = true, length = 100)
    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu;
    }

    @Basic
    @Column(name = "csrqi", nullable = true)
    public Timestamp getCsrqi() {
        return csrqi;
    }

    public void setCsrqi(Timestamp csrqi) {
        this.csrqi = csrqi;
    }

    @Basic
    @Column(name = "xingbie", nullable = false)
    public boolean isXingbie() {
        return xingbie;
    }

    public void setXingbie(boolean xingbie) {
        this.xingbie = xingbie;
    }

    @Basic
    @Column(name = "shouji", nullable = true, length = 30)
    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    @Basic
    @Column(name = "dianhua", nullable = true, length = 30)
    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    @Basic
    @Column(name = "dizhi", nullable = true, length = 100)
    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    @Basic
    @Column(name = "youbian", nullable = true, length = 100)
    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian;
    }

    @Basic
    @Column(name = "dzyjian", nullable = true, length = 100)
    public String getDzyjian() {
        return dzyjian;
    }

    public void setDzyjian(String dzyjian) {
        this.dzyjian = dzyjian;
    }

    @Basic
    @Column(name = "jiguan", nullable = true, length = 30)
    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    @Basic
    @Column(name = "xingqu", nullable = true, length = 100)
    public String getXingqu() {
        return xingqu;
    }

    public void setXingqu(String xingqu) {
        this.xingqu = xingqu;
    }

    @Basic
    @Column(name = "jifen", nullable = false)
    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }

    @Basic
    @Column(name = "jycshu", nullable = false)
    public int getJycshu() {
        return jycshu;
    }

    public void setJycshu(int jycshu) {
        this.jycshu = jycshu;
    }

    @Basic
    @Column(name = "yycshu", nullable = false)
    public int getYycshu() {
        return yycshu;
    }

    public void setYycshu(int yycshu) {
        this.yycshu = yycshu;
    }

    @Basic
    @Column(name = "xjcshu", nullable = false)
    public int getXjcshu() {
        return xjcshu;
    }

    public void setXjcshu(int xjcshu) {
        this.xjcshu = xjcshu;
    }

    @Basic
    @Column(name = "wzcshu", nullable = false)
    public int getWzcshu() {
        return wzcshu;
    }

    public void setWzcshu(int wzcshu) {
        this.wzcshu = wzcshu;
    }

    @Basic
    @Column(name = "gjhjcshu", nullable = false)
    public int getGjhjcshu() {
        return gjhjcshu;
    }

    public void setGjhjcshu(int gjhjcshu) {
        this.gjhjcshu = gjhjcshu;
    }

    @Basic
    @Column(name = "qkuan", nullable = false, precision = 2)
    public BigDecimal getQkuan() {
        return qkuan;
    }

    public void setQkuan(BigDecimal qkuan) {
        this.qkuan = qkuan;
    }

    @Basic
    @Column(name = "yajin", nullable = false, precision = 2)
    public BigDecimal getYajin() {
        return yajin;
    }

    public void setYajin(BigDecimal yajin) {
        this.yajin = yajin;
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
    @Column(name = "zpian", nullable = true)
    public byte[] getZpian() {
        return zpian;
    }

    public void setZpian(byte[] zpian) {
        this.zpian = zpian;
    }

    @Basic
    @Column(name = "zhiye", nullable = true, length = 10)
    public String getZhiye() {
        return zhiye;
    }

    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }

    @Basic
    @Column(name = "ztstartdate", nullable = true)
    public Timestamp getZtstartdate() {
        return ztstartdate;
    }

    public void setZtstartdate(Timestamp ztstartdate) {
        this.ztstartdate = ztstartdate;
    }

    @Basic
    @Column(name = "ztenddate", nullable = true)
    public Timestamp getZtenddate() {
        return ztenddate;
    }

    public void setZtenddate(Timestamp ztenddate) {
        this.ztenddate = ztenddate;
    }

    @Basic
    @Column(name = "dzdw", nullable = true, length = 100)
    public String getDzdw() {
        return dzdw;
    }

    public void setDzdw(String dzdw) {
        this.dzdw = dzdw;
    }

    @Basic
    @Column(name = "beizhu", nullable = true, length = 250)
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "openid", nullable = true, length = 32)
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "zpianyshi", nullable = true, length = -1)
    public String getZpianyshi() {
        return zpianyshi;
    }

    public void setZpianyshi(String zpianyshi) {
        this.zpianyshi = zpianyshi;
    }

    @Basic
    @Column(name = "xjh", nullable = true, length = 100)
    public String getXjh() {
        return xjh;
    }

    public void setXjh(String xjh) {
        this.xjh = xjh;
    }

    @Basic
    @Column(name = "xueduan", nullable = true, length = 100)
    public String getXueduan() {
        return xueduan;
    }

    public void setXueduan(String xueduan) {
        this.xueduan = xueduan;
    }

    @Basic
    @Column(name = "ban", nullable = true, length = 100)
    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Basic
    @Column(name = "ji", nullable = true, length = 100)
    public String getJi() {
        return ji;
    }

    public void setJi(String ji) {
        this.ji = ji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LtDzheinfoEntity that = (LtDzheinfoEntity) o;

        if (xingbie != that.xingbie) return false;
        if (jifen != that.jifen) return false;
        if (jycshu != that.jycshu) return false;
        if (yycshu != that.yycshu) return false;
        if (xjcshu != that.xjcshu) return false;
        if (wzcshu != that.wzcshu) return false;
        if (gjhjcshu != that.gjhjcshu) return false;
        if (dzid != null ? !dzid.equals(that.dzid) : that.dzid != null) return false;
        if (dzzhao != null ? !dzzhao.equals(that.dzzhao) : that.dzzhao != null) return false;
        if (xming != null ? !xming.equals(that.xming) : that.xming != null) return false;
        if (ztai != null ? !ztai.equals(that.ztai) : that.ztai != null) return false;
        if (mima != null ? !mima.equals(that.mima) : that.mima != null) return false;
        if (zjlx != null ? !zjlx.equals(that.zjlx) : that.zjlx != null) return false;
        if (zjhma != null ? !zjhma.equals(that.zjhma) : that.zjhma != null) return false;
        if (jzrqi != null ? !jzrqi.equals(that.jzrqi) : that.jzrqi != null) return false;
        if (qyrqi != null ? !qyrqi.equals(that.qyrqi) : that.qyrqi != null) return false;
        if (bzrqi != null ? !bzrqi.equals(that.bzrqi) : that.bzrqi != null) return false;
        if (zhuanye != null ? !zhuanye.equals(that.zhuanye) : that.zhuanye != null) return false;
        if (zhiwu != null ? !zhiwu.equals(that.zhiwu) : that.zhiwu != null) return false;
        if (zcheng != null ? !zcheng.equals(that.zcheng) : that.zcheng != null) return false;
        if (xueli != null ? !xueli.equals(that.xueli) : that.xueli != null) return false;
        if (minzu != null ? !minzu.equals(that.minzu) : that.minzu != null) return false;
        if (csrqi != null ? !csrqi.equals(that.csrqi) : that.csrqi != null) return false;
        if (shouji != null ? !shouji.equals(that.shouji) : that.shouji != null) return false;
        if (dianhua != null ? !dianhua.equals(that.dianhua) : that.dianhua != null) return false;
        if (dizhi != null ? !dizhi.equals(that.dizhi) : that.dizhi != null) return false;
        if (youbian != null ? !youbian.equals(that.youbian) : that.youbian != null) return false;
        if (dzyjian != null ? !dzyjian.equals(that.dzyjian) : that.dzyjian != null) return false;
        if (jiguan != null ? !jiguan.equals(that.jiguan) : that.jiguan != null) return false;
        if (xingqu != null ? !xingqu.equals(that.xingqu) : that.xingqu != null) return false;
        if (qkuan != null ? !qkuan.equals(that.qkuan) : that.qkuan != null) return false;
        if (yajin != null ? !yajin.equals(that.yajin) : that.yajin != null) return false;
        if (optime != null ? !optime.equals(that.optime) : that.optime != null) return false;
        if (!Arrays.equals(zpian, that.zpian)) return false;
        if (zhiye != null ? !zhiye.equals(that.zhiye) : that.zhiye != null) return false;
        if (ztstartdate != null ? !ztstartdate.equals(that.ztstartdate) : that.ztstartdate != null) return false;
        if (ztenddate != null ? !ztenddate.equals(that.ztenddate) : that.ztenddate != null) return false;
        if (dzdw != null ? !dzdw.equals(that.dzdw) : that.dzdw != null) return false;
        if (beizhu != null ? !beizhu.equals(that.beizhu) : that.beizhu != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (zpianyshi != null ? !zpianyshi.equals(that.zpianyshi) : that.zpianyshi != null) return false;
        if (xjh != null ? !xjh.equals(that.xjh) : that.xjh != null) return false;
        if (xueduan != null ? !xueduan.equals(that.xueduan) : that.xueduan != null) return false;
        if (ban != null ? !ban.equals(that.ban) : that.ban != null) return false;
        if (ji != null ? !ji.equals(that.ji) : that.ji != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dzid != null ? dzid.hashCode() : 0;
        result = 31 * result + (dzzhao != null ? dzzhao.hashCode() : 0);
        result = 31 * result + (xming != null ? xming.hashCode() : 0);
        result = 31 * result + (ztai != null ? ztai.hashCode() : 0);
        result = 31 * result + (mima != null ? mima.hashCode() : 0);
        result = 31 * result + (zjlx != null ? zjlx.hashCode() : 0);
        result = 31 * result + (zjhma != null ? zjhma.hashCode() : 0);
        result = 31 * result + (jzrqi != null ? jzrqi.hashCode() : 0);
        result = 31 * result + (qyrqi != null ? qyrqi.hashCode() : 0);
        result = 31 * result + (bzrqi != null ? bzrqi.hashCode() : 0);
        result = 31 * result + (zhuanye != null ? zhuanye.hashCode() : 0);
        result = 31 * result + (zhiwu != null ? zhiwu.hashCode() : 0);
        result = 31 * result + (zcheng != null ? zcheng.hashCode() : 0);
        result = 31 * result + (xueli != null ? xueli.hashCode() : 0);
        result = 31 * result + (minzu != null ? minzu.hashCode() : 0);
        result = 31 * result + (csrqi != null ? csrqi.hashCode() : 0);
        result = 31 * result + (xingbie ? 1 : 0);
        result = 31 * result + (shouji != null ? shouji.hashCode() : 0);
        result = 31 * result + (dianhua != null ? dianhua.hashCode() : 0);
        result = 31 * result + (dizhi != null ? dizhi.hashCode() : 0);
        result = 31 * result + (youbian != null ? youbian.hashCode() : 0);
        result = 31 * result + (dzyjian != null ? dzyjian.hashCode() : 0);
        result = 31 * result + (jiguan != null ? jiguan.hashCode() : 0);
        result = 31 * result + (xingqu != null ? xingqu.hashCode() : 0);
        result = 31 * result + jifen;
        result = 31 * result + jycshu;
        result = 31 * result + yycshu;
        result = 31 * result + xjcshu;
        result = 31 * result + wzcshu;
        result = 31 * result + gjhjcshu;
        result = 31 * result + (qkuan != null ? qkuan.hashCode() : 0);
        result = 31 * result + (yajin != null ? yajin.hashCode() : 0);
        result = 31 * result + (optime != null ? optime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(zpian);
        result = 31 * result + (zhiye != null ? zhiye.hashCode() : 0);
        result = 31 * result + (ztstartdate != null ? ztstartdate.hashCode() : 0);
        result = 31 * result + (ztenddate != null ? ztenddate.hashCode() : 0);
        result = 31 * result + (dzdw != null ? dzdw.hashCode() : 0);
        result = 31 * result + (beizhu != null ? beizhu.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (zpianyshi != null ? zpianyshi.hashCode() : 0);
        result = 31 * result + (xjh != null ? xjh.hashCode() : 0);
        result = 31 * result + (xueduan != null ? xueduan.hashCode() : 0);
        result = 31 * result + (ban != null ? ban.hashCode() : 0);
        result = 31 * result + (ji != null ? ji.hashCode() : 0);
        return result;
    }
}
