package cn.ltianan.study.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "marczdzchao", schema = "public", catalog = "sjlibold")
public class MarczdzchaoEntity {
    private String zdid;
    private String cygid;
    private String flhao;
    private String zdzchao;
    private Timestamp optime;
    private String userid;
    private String leixing;

    @Id
    @Column(name = "zdid", nullable = false, length = 32)
    public String getZdid() {
        return zdid;
    }

    public void setZdid(String zdid) {
        this.zdid = zdid;
    }

    @Basic
    @Column(name = "cygid", nullable = false, length = 32)
    public String getCygid() {
        return cygid;
    }

    public void setCygid(String cygid) {
        this.cygid = cygid;
    }

    @Basic
    @Column(name = "flhao", nullable = false, length = 100)
    public String getFlhao() {
        return flhao;
    }

    public void setFlhao(String flhao) {
        this.flhao = flhao;
    }

    @Basic
    @Column(name = "zdzchao", nullable = false, length = 100)
    public String getZdzchao() {
        return zdzchao;
    }

    public void setZdzchao(String zdzchao) {
        this.zdzchao = zdzchao;
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
    @Column(name = "userid", nullable = false, length = 32)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "leixing", nullable = false, length = 10)
    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarczdzchaoEntity that = (MarczdzchaoEntity) o;

        if (zdid != null ? !zdid.equals(that.zdid) : that.zdid != null) return false;
        if (cygid != null ? !cygid.equals(that.cygid) : that.cygid != null) return false;
        if (flhao != null ? !flhao.equals(that.flhao) : that.flhao != null) return false;
        if (zdzchao != null ? !zdzchao.equals(that.zdzchao) : that.zdzchao != null) return false;
        if (optime != null ? !optime.equals(that.optime) : that.optime != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (leixing != null ? !leixing.equals(that.leixing) : that.leixing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zdid != null ? zdid.hashCode() : 0;
        result = 31 * result + (cygid != null ? cygid.hashCode() : 0);
        result = 31 * result + (flhao != null ? flhao.hashCode() : 0);
        result = 31 * result + (zdzchao != null ? zdzchao.hashCode() : 0);
        result = 31 * result + (optime != null ? optime.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (leixing != null ? leixing.hashCode() : 0);
        return result;
    }
}
