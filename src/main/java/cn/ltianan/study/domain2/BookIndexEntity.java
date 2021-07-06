package cn.ltianan.study.domain2;

import javax.persistence.*;

@Entity
@Table(name = "book_index", schema = "public")
public class BookIndexEntity {
    private int indexId;
    private int bibId;
    private int deptId;
    private String callNo;
    private String classNo;
    private Integer orderNo;
    private Integer bookNum;
    private String authorNo;
    @Id
    @Column(name = "index_id", nullable = false)
    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
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
    @Column(name = "dept_id", nullable = false)
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "call_no", nullable = false, length = 100)
    public String getCallNo() {
        return callNo;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    @Basic
    @Column(name = "class_no", nullable = true, length = 100)
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Basic
    @Column(name = "order_no", nullable = true)
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "book_num", nullable = true)
    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    @Basic
    @Column(name = "author_no", nullable = true, length = 100)
    public String getAuthorNo() {
        return authorNo;
    }

    public void setAuthorNo(String authorNo) {
        this.authorNo = authorNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookIndexEntity that = (BookIndexEntity) o;

        if (indexId != that.indexId) return false;
        if (bibId != that.bibId) return false;
        if (deptId != that.deptId) return false;
        if (callNo != null ? !callNo.equals(that.callNo) : that.callNo != null) return false;
        if (classNo != null ? !classNo.equals(that.classNo) : that.classNo != null) return false;
        if (orderNo != null ? !orderNo.equals(that.orderNo) : that.orderNo != null) return false;
        if (bookNum != null ? !bookNum.equals(that.bookNum) : that.bookNum != null) return false;
        if (authorNo != null ? !authorNo.equals(that.authorNo) : that.authorNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = indexId;
        result = 31 * result + bibId;
        result = 31 * result + deptId;
        result = 31 * result + (callNo != null ? callNo.hashCode() : 0);
        result = 31 * result + (classNo != null ? classNo.hashCode() : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        result = 31 * result + (bookNum != null ? bookNum.hashCode() : 0);
        result = 31 * result + (authorNo != null ? authorNo.hashCode() : 0);
        return result;
    }
}
