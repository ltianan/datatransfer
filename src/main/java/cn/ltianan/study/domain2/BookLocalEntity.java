package cn.ltianan.study.domain2;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "book_local", schema = "public")
public class BookLocalEntity {
    private int localId;
    private String localCode;
    private int deptId;
    private String localName;
    private String nano;
    private String status;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

//    @SequenceGenerator(sequenceName="book_local_local_id_seq", name="abc" )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hilo")
    @GenericGenerator(name = "hilo",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "book_local_local_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "optimizer", value = "hilo")
            })
    @Column(name = "local_id", nullable = false)
    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    @Basic
    @Column(name = "local_code", nullable = false, length = 64)
    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
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
    @Column(name = "local_name", nullable = false, length = 128)
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
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
        BookLocalEntity that = (BookLocalEntity) o;
        return localId == that.localId &&
                deptId == that.deptId &&
                Objects.equals(localCode, that.localCode) &&
                Objects.equals(localName, that.localName) &&
                Objects.equals(nano, that.nano) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localId, localCode, deptId, localName, nano, status, createBy, createTime, updateBy, updateTime);
    }
}
