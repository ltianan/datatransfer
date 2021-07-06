package cn.ltianan.study.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ZCHAOTABLE", schema = "dbo")
public class ZchaotableEntity {
    private int id;
    private String ztfLhao;
    private String ztflming;
    private Integer maxzchao;

    @Id
    @Basic
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ZTFLhao", nullable = true, length = 20)
    public String getZtfLhao() {
        return ztfLhao;
    }

    public void setZtfLhao(String ztfLhao) {
        this.ztfLhao = ztfLhao;
    }

    @Basic
    @Column(name = "ZTFLMING", nullable = true, length = 30)
    public String getZtflming() {
        return ztflming;
    }

    public void setZtflming(String ztflming) {
        this.ztflming = ztflming;
    }

    @Basic
    @Column(name = "MAXZCHAO", nullable = true)
    public Integer getMaxzchao() {
        return maxzchao;
    }

    public void setMaxzchao(Integer maxzchao) {
        this.maxzchao = maxzchao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZchaotableEntity that = (ZchaotableEntity) o;
        return id == that.id &&
                Objects.equals(ztfLhao, that.ztfLhao) &&
                Objects.equals(ztflming, that.ztflming) &&
                Objects.equals(maxzchao, that.maxzchao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ztfLhao, ztflming, maxzchao);
    }
}
