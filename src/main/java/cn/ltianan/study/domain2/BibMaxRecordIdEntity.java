package cn.ltianan.study.domain2;

import javax.persistence.*;

@Entity
@Table(name = "bib_max_record_id", schema = "public")
public class BibMaxRecordIdEntity {
    private int id;
    private int deptId;
    private int maxRecordId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dept_id", nullable = false)
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "max_record_id", nullable = false)
    public int getMaxRecordId() {
        return maxRecordId;
    }

    public void setMaxRecordId(int maxRecordId) {
        this.maxRecordId = maxRecordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BibMaxRecordIdEntity that = (BibMaxRecordIdEntity) o;

        if (id != that.id) return false;
        if (deptId != that.deptId) return false;
        if (maxRecordId != that.maxRecordId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deptId;
        result = 31 * result + maxRecordId;
        return result;
    }
}
