package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cir_reader_unit", schema = "public")
public class CirReaderUnitEntity {
    private int readerUnitId;
    private String readerUnitCode;
    private int deptId;
    private String readerUnitName;
    private Integer readerTypeId;
    private String nano;
    private String status;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "reader_unit_id", nullable = false)
    public int getReaderUnitId() {
        return readerUnitId;
    }

    public void setReaderUnitId(int readerUnitId) {
        this.readerUnitId = readerUnitId;
    }

    @Basic
    @Column(name = "reader_unit_code", nullable = false, length = 64)
    public String getReaderUnitCode() {
        return readerUnitCode;
    }

    public void setReaderUnitCode(String readerUnitCode) {
        this.readerUnitCode = readerUnitCode;
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
    @Column(name = "reader_unit_name", nullable = false, length = 128)
    public String getReaderUnitName() {
        return readerUnitName;
    }

    public void setReaderUnitName(String readerUnitName) {
        this.readerUnitName = readerUnitName;
    }

    @Basic
    @Column(name = "reader_type_id", nullable = true)
    public Integer getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(Integer readerTypeId) {
        this.readerTypeId = readerTypeId;
    }

    @Basic
    @Column(name = "nano", nullable = true, length = -1)
    public String getNano() {
        return nano;
    }

    public void setNano(String nano) {
        this.nano = nano;
    }

    @Basic
    @Column(name = "status", nullable = true, length = -1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = 64)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
        CirReaderUnitEntity that = (CirReaderUnitEntity) o;
        return readerUnitId == that.readerUnitId &&
                deptId == that.deptId &&
                Objects.equals(readerUnitCode, that.readerUnitCode) &&
                Objects.equals(readerUnitName, that.readerUnitName) &&
                Objects.equals(readerTypeId, that.readerTypeId) &&
                Objects.equals(nano, that.nano) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readerUnitId, readerUnitCode, deptId, readerUnitName, readerTypeId, nano, status, createBy, createTime, updateBy, updateTime);
    }
}
