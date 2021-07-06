package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cir_circle", schema = "public")
public class CirCircleEntity {
    private int circleId;
    private int readerId;
    private int bookId;
    private int borrowReaderTypeId;
    private int readerDeptId;
    private int borrowDeptId;
    private Integer returnDeptId;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String returnBy;
    private Timestamp returnTime;
    private Timestamp shouldReturnTime;
    private Integer renewTimes;
    private String isInterlibraryLending;
    private String isInterlibraryReturning;
    private String returnType;
    private String nano;
    private int bibId;
    private int indexId;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "circle_id", nullable = false)
    public int getCircleId() {
        return circleId;
    }

    public void setCircleId(int circleId) {
        this.circleId = circleId;
    }

    @Basic
    @Column(name = "reader_id", nullable = false)
    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    @Basic
    @Column(name = "book_id", nullable = false)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "borrow_reader_type_id", nullable = false)
    public int getBorrowReaderTypeId() {
        return borrowReaderTypeId;
    }

    public void setBorrowReaderTypeId(int borrowReaderTypeId) {
        this.borrowReaderTypeId = borrowReaderTypeId;
    }

    @Basic
    @Column(name = "reader_dept_id", nullable = false)
    public int getReaderDeptId() {
        return readerDeptId;
    }

    public void setReaderDeptId(int readerDeptId) {
        this.readerDeptId = readerDeptId;
    }

    @Basic
    @Column(name = "borrow_dept_id", nullable = false)
    public int getBorrowDeptId() {
        return borrowDeptId;
    }

    public void setBorrowDeptId(int borrowDeptId) {
        this.borrowDeptId = borrowDeptId;
    }

    @Basic
    @Column(name = "return_dept_id", nullable = true)
    public Integer getReturnDeptId() {
        return returnDeptId;
    }

    public void setReturnDeptId(Integer returnDeptId) {
        this.returnDeptId = returnDeptId;
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

    @Basic
    @Column(name = "return_by", nullable = true, length = 64)
    public String getReturnBy() {
        return returnBy;
    }

    public void setReturnBy(String returnBy) {
        this.returnBy = returnBy;
    }

    @Basic
    @Column(name = "return_time", nullable = true)
    public Timestamp getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Timestamp returnTime) {
        this.returnTime = returnTime;
    }

    @Basic
    @Column(name = "should_return_time", nullable = false)
    public Timestamp getShouldReturnTime() {
        return shouldReturnTime;
    }

    public void setShouldReturnTime(Timestamp shouldReturnTime) {
        this.shouldReturnTime = shouldReturnTime;
    }

    @Basic
    @Column(name = "renew_times", nullable = true)
    public Integer getRenewTimes() {
        return renewTimes;
    }

    public void setRenewTimes(Integer renewTimes) {
        this.renewTimes = renewTimes;
    }

    @Basic
    @Column(name = "is_interlibrary_lending", nullable = true, length = -1)
    public String getIsInterlibraryLending() {
        return isInterlibraryLending;
    }

    public void setIsInterlibraryLending(String isInterlibraryLending) {
        this.isInterlibraryLending = isInterlibraryLending;
    }

    @Basic
    @Column(name = "is_interlibrary_returning", nullable = true, length = -1)
    public String getIsInterlibraryReturning() {
        return isInterlibraryReturning;
    }

    public void setIsInterlibraryReturning(String isInterlibraryReturning) {
        this.isInterlibraryReturning = isInterlibraryReturning;
    }

    @Basic
    @Column(name = "return_type", nullable = true, length = -1)
    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @Basic
    @Column(name = "nano", nullable = true, length = 200)
    public String getNano() {
        return nano;
    }

    public void setNano(String nano) {
        this.nano = nano;
    }

    @Basic
    @Column(name = "bib_id", nullable = false)
    public int getBibId() {
        return bibId;
    }

    public void setBibId(int bibId) {
        this.bibId = bibId;
    }

    @Basic
    @Column(name = "index_id", nullable = false)
    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CirCircleEntity that = (CirCircleEntity) o;

        if (circleId != that.circleId) return false;
        if (readerId != that.readerId) return false;
        if (bookId != that.bookId) return false;
        if (borrowReaderTypeId != that.borrowReaderTypeId) return false;
        if (readerDeptId != that.readerDeptId) return false;
        if (borrowDeptId != that.borrowDeptId) return false;
        if (returnDeptId != null ? !returnDeptId.equals(that.returnDeptId) : that.returnDeptId != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (returnBy != null ? !returnBy.equals(that.returnBy) : that.returnBy != null) return false;
        if (returnTime != null ? !returnTime.equals(that.returnTime) : that.returnTime != null) return false;
        if (shouldReturnTime != null ? !shouldReturnTime.equals(that.shouldReturnTime) : that.shouldReturnTime != null)
            return false;
        if (renewTimes != null ? !renewTimes.equals(that.renewTimes) : that.renewTimes != null) return false;
        if (isInterlibraryLending != null ? !isInterlibraryLending.equals(that.isInterlibraryLending) : that.isInterlibraryLending != null)
            return false;
        if (isInterlibraryReturning != null ? !isInterlibraryReturning.equals(that.isInterlibraryReturning) : that.isInterlibraryReturning != null)
            return false;
        if (returnType != null ? !returnType.equals(that.returnType) : that.returnType != null) return false;
        if (nano != null ? !nano.equals(that.nano) : that.nano != null) return false;
        if (bibId != that.bibId) return false;
        if (indexId != that.indexId) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = circleId;
        result = 31 * result + readerId;
        result = 31 * result + bookId;
        result = 31 * result + borrowReaderTypeId;
        result = 31 * result + readerDeptId;
        result = 31 * result + borrowDeptId;
        result = 31 * result + (returnDeptId != null ? returnDeptId.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (returnBy != null ? returnBy.hashCode() : 0);
        result = 31 * result + (returnTime != null ? returnTime.hashCode() : 0);
        result = 31 * result + (shouldReturnTime != null ? shouldReturnTime.hashCode() : 0);
        result = 31 * result + (renewTimes != null ? renewTimes.hashCode() : 0);
        result = 31 * result + (isInterlibraryLending != null ? isInterlibraryLending.hashCode() : 0);
        result = 31 * result + (isInterlibraryReturning != null ? isInterlibraryReturning.hashCode() : 0);
        result = 31 * result + (returnType != null ? returnType.hashCode() : 0);
        result = 31 * result + (nano != null ? nano.hashCode() : 0);
        result = 31 * result + bibId;
        result = 31 * result + indexId;
        return result;
    }
}
