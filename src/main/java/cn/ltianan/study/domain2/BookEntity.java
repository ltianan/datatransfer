package cn.ltianan.study.domain2;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "book", schema = "public")
public class BookEntity {
    private int bookId;
    private int oriDeptId;
    private int nowDeptId;
    private int oriLocalId;
    private int nowLocalId;
    private String bookBarcode;
    private String bookStatus;
    private BigDecimal bookPrice;
    private BigDecimal bookSetPrice;
    private int indexId;
    private String bookSource;
    private String bookMediaType;
    private String bookDescription;
    private Timestamp shouldBackTime;
    private String bookUuid;
    private String oriPlaceNo;
    private String nowPlaceNo;
    private String nano;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hilo")
    @GenericGenerator(name = "hilo",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "book_book_id_seq"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "optimizer", value = "hilo")
            })
    @Column(name = "book_id", nullable = false)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "ori_dept_id", nullable = false)
    public int getOriDeptId() {
        return oriDeptId;
    }

    public void setOriDeptId(int oriDeptId) {
        this.oriDeptId = oriDeptId;
    }

    @Basic
    @Column(name = "now_dept_id", nullable = false)
    public int getNowDeptId() {
        return nowDeptId;
    }

    public void setNowDeptId(int nowDeptId) {
        this.nowDeptId = nowDeptId;
    }

    @Basic
    @Column(name = "ori_local_id", nullable = false)
    public int getOriLocalId() {
        return oriLocalId;
    }

    public void setOriLocalId(int oriLocalId) {
        this.oriLocalId = oriLocalId;
    }

    @Basic
    @Column(name = "now_local_id", nullable = false)
    public int getNowLocalId() {
        return nowLocalId;
    }

    public void setNowLocalId(int nowLocalId) {
        this.nowLocalId = nowLocalId;
    }

    @Basic
    @Column(name = "book_barcode", nullable = false, length = 64)
    public String getBookBarcode() {
        return bookBarcode;
    }

    public void setBookBarcode(String bookBarcode) {
        this.bookBarcode = bookBarcode;
    }

    @Basic
    @Column(name = "book_status", nullable = false, length = 8)
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Basic
    @Column(name = "book_price", nullable = false, precision = 2)
    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Basic
    @Column(name = "book_set_price", nullable = false, precision = 2)
    public BigDecimal getBookSetPrice() {
        return bookSetPrice;
    }

    public void setBookSetPrice(BigDecimal bookSetPrice) {
        this.bookSetPrice = bookSetPrice;
    }

    @Basic
    @Column(name = "index_id", nullable = false)
    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    @Basic
    @Column(name = "book_source", nullable = true, length = 64)
    public String getBookSource() {
        return bookSource;
    }

    public void setBookSource(String bookSource) {
        this.bookSource = bookSource;
    }

    @Basic
    @Column(name = "book_media_type", nullable = true, length = 64)
    public String getBookMediaType() {
        return bookMediaType;
    }

    public void setBookMediaType(String bookMediaType) {
        this.bookMediaType = bookMediaType;
    }

    @Basic
    @Column(name = "book_description", nullable = true, length = 200)
    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    @Basic
    @Column(name = "should_back_time", nullable = true)
    public Timestamp getShouldBackTime() {
        return shouldBackTime;
    }

    public void setShouldBackTime(Timestamp shouldBackTime) {
        this.shouldBackTime = shouldBackTime;
    }

    @Basic
    @Column(name = "book_uuid", nullable = true, length = 64)
    public String getBookUuid() {
        return bookUuid;
    }

    public void setBookUuid(String bookUuid) {
        this.bookUuid = bookUuid;
    }

    @Basic
    @Column(name = "ori_place_no", nullable = true, length = 64)
    public String getOriPlaceNo() {
        return oriPlaceNo;
    }

    public void setOriPlaceNo(String oriPlaceNo) {
        this.oriPlaceNo = oriPlaceNo;
    }

    @Basic
    @Column(name = "now_place_no", nullable = true, length = 64)
    public String getNowPlaceNo() {
        return nowPlaceNo;
    }

    public void setNowPlaceNo(String nowPlaceNo) {
        this.nowPlaceNo = nowPlaceNo;
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

        BookEntity that = (BookEntity) o;

        if (bookId != that.bookId) return false;
        if (oriDeptId != that.oriDeptId) return false;
        if (nowDeptId != that.nowDeptId) return false;
        if (oriLocalId != that.oriLocalId) return false;
        if (nowLocalId != that.nowLocalId) return false;
        if (indexId != that.indexId) return false;
        if (bookBarcode != null ? !bookBarcode.equals(that.bookBarcode) : that.bookBarcode != null) return false;
        if (bookStatus != null ? !bookStatus.equals(that.bookStatus) : that.bookStatus != null) return false;
        if (bookPrice != null ? !bookPrice.equals(that.bookPrice) : that.bookPrice != null) return false;
        if (bookSetPrice != null ? !bookSetPrice.equals(that.bookSetPrice) : that.bookSetPrice != null) return false;
        if (bookSource != null ? !bookSource.equals(that.bookSource) : that.bookSource != null) return false;
        if (bookMediaType != null ? !bookMediaType.equals(that.bookMediaType) : that.bookMediaType != null)
            return false;
        if (bookDescription != null ? !bookDescription.equals(that.bookDescription) : that.bookDescription != null)
            return false;
        if (shouldBackTime != null ? !shouldBackTime.equals(that.shouldBackTime) : that.shouldBackTime != null)
            return false;
        if (bookUuid != null ? !bookUuid.equals(that.bookUuid) : that.bookUuid != null) return false;
        if (oriPlaceNo != null ? !oriPlaceNo.equals(that.oriPlaceNo) : that.oriPlaceNo != null) return false;
        if (nowPlaceNo != null ? !nowPlaceNo.equals(that.nowPlaceNo) : that.nowPlaceNo != null) return false;
        if (nano != null ? !nano.equals(that.nano) : that.nano != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + oriDeptId;
        result = 31 * result + nowDeptId;
        result = 31 * result + oriLocalId;
        result = 31 * result + nowLocalId;
        result = 31 * result + (bookBarcode != null ? bookBarcode.hashCode() : 0);
        result = 31 * result + (bookStatus != null ? bookStatus.hashCode() : 0);
        result = 31 * result + (bookPrice != null ? bookPrice.hashCode() : 0);
        result = 31 * result + (bookSetPrice != null ? bookSetPrice.hashCode() : 0);
        result = 31 * result + indexId;
        result = 31 * result + (bookSource != null ? bookSource.hashCode() : 0);
        result = 31 * result + (bookMediaType != null ? bookMediaType.hashCode() : 0);
        result = 31 * result + (bookDescription != null ? bookDescription.hashCode() : 0);
        result = 31 * result + (shouldBackTime != null ? shouldBackTime.hashCode() : 0);
        result = 31 * result + (bookUuid != null ? bookUuid.hashCode() : 0);
        result = 31 * result + (oriPlaceNo != null ? oriPlaceNo.hashCode() : 0);
        result = 31 * result + (nowPlaceNo != null ? nowPlaceNo.hashCode() : 0);
        result = 31 * result + (nano != null ? nano.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
