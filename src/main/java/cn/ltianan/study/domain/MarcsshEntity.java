package cn.ltianan.study.domain;

import javax.persistence.*;

@Entity
@Table(name = "marcssh", schema = "public", catalog = "sjlibold")
public class MarcsshEntity {
    private String sshid;
    private String marcid;
    private String sshao;
    private String zchao;
    private String zzhao;
    private String leixing;
    private String flhao;
    private Integer zch;

    @Id
    @Column(name = "sshid", nullable = false, length = 32)
    public String getSshid() {
        return sshid;
    }

    public void setSshid(String sshid) {
        this.sshid = sshid;
    }

    @Basic
    @Column(name = "marcid", nullable = false, length = 32)
    public String getMarcid() {
        return marcid;
    }

    public void setMarcid(String marcid) {
        this.marcid = marcid;
    }

    @Basic
    @Column(name = "sshao", nullable = false, length = 100)
    public String getSshao() {
        return sshao;
    }

    public void setSshao(String sshao) {
        this.sshao = sshao;
    }

    @Basic
    @Column(name = "zchao", nullable = true, length = 100)
    public String getZchao() {
        return zchao;
    }

    public void setZchao(String zchao) {
        this.zchao = zchao;
    }

    @Basic
    @Column(name = "zzhao", nullable = true, length = 100)
    public String getZzhao() {
        return zzhao;
    }

    public void setZzhao(String zzhao) {
        this.zzhao = zzhao;
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
    @Column(name = "flhao", nullable = true, length = 100)
    public String getFlhao() {
        return flhao;
    }

    public void setFlhao(String flhao) {
        this.flhao = flhao;
    }

    @Basic
    @Column(name = "zch", nullable = true)
    public Integer getZch() {
        return zch;
    }

    public void setZch(Integer zch) {
        this.zch = zch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcsshEntity that = (MarcsshEntity) o;

        if (sshid != null ? !sshid.equals(that.sshid) : that.sshid != null) return false;
        if (marcid != null ? !marcid.equals(that.marcid) : that.marcid != null) return false;
        if (sshao != null ? !sshao.equals(that.sshao) : that.sshao != null) return false;
        if (zchao != null ? !zchao.equals(that.zchao) : that.zchao != null) return false;
        if (zzhao != null ? !zzhao.equals(that.zzhao) : that.zzhao != null) return false;
        if (leixing != null ? !leixing.equals(that.leixing) : that.leixing != null) return false;
        if (flhao != null ? !flhao.equals(that.flhao) : that.flhao != null) return false;
        if (zch != null ? !zch.equals(that.zch) : that.zch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sshid != null ? sshid.hashCode() : 0;
        result = 31 * result + (marcid != null ? marcid.hashCode() : 0);
        result = 31 * result + (sshao != null ? sshao.hashCode() : 0);
        result = 31 * result + (zchao != null ? zchao.hashCode() : 0);
        result = 31 * result + (zzhao != null ? zzhao.hashCode() : 0);
        result = 31 * result + (leixing != null ? leixing.hashCode() : 0);
        result = 31 * result + (flhao != null ? flhao.hashCode() : 0);
        result = 31 * result + (zch != null ? zch.hashCode() : 0);
        return result;
    }
}
