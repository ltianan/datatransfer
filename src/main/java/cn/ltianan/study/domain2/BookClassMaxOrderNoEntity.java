package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "book_class_max_order_no", schema = "public")
public class BookClassMaxOrderNoEntity {
    private int classMaxOrderNoId;
    private int deptId;
    private String classNo;
    private int classMaxOrderNo;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "class_max_order_no_id", nullable = false)
    public int getClassMaxOrderNoId() {
        return classMaxOrderNoId;
    }

    public void setClassMaxOrderNoId(int classMaxOrderNoId) {
        this.classMaxOrderNoId = classMaxOrderNoId;
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
    @Column(name = "class_no", nullable = false, length = 100)
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Basic
    @Column(name = "class_max_order_no", nullable = false)
    public int getClassMaxOrderNo() {
        return classMaxOrderNo;
    }

    public void setClassMaxOrderNo(int classMaxOrderNo) {
        this.classMaxOrderNo = classMaxOrderNo;
    }

    @Basic
    @Column(name = "update_by", nullable = true, length = 64)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookClassMaxOrderNoEntity that = (BookClassMaxOrderNoEntity) o;

        if (classMaxOrderNoId != that.classMaxOrderNoId) return false;
        if (deptId != that.deptId) return false;
        if (classMaxOrderNo != that.classMaxOrderNo) return false;
        if (classNo != null ? !classNo.equals(that.classNo) : that.classNo != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classMaxOrderNoId;
        result = 31 * result + deptId;
        result = 31 * result + (classNo != null ? classNo.hashCode() : 0);
        result = 31 * result + classMaxOrderNo;
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
