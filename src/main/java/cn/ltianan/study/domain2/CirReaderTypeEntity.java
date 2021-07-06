package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cir_reader_type", schema = "public")
public class CirReaderTypeEntity {
    private int readerTypeId;
    private String readerTypeCode;
    private int deptId;
    private String readerTypeName;
    private BigDecimal cardFee;
    private String status;
    private String expireType;
    private Integer effectiveDays;
    private Date expireDate;
    private String forNativeDept;
    private int borrowNum;
    private int borrowDay;
    private int orderBookNum;
    private Integer orderDay;
    private BigDecimal expirePayPerday;
    private Integer lostPayPerbook;
    private Integer reborrowTimes;
    private Integer reborrowDay;
    private BigDecimal maxDebt;
    private int maxExpireBorrowNum;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "reader_type_id", nullable = false)
    public int getReaderTypeId() {
        return readerTypeId;
    }

    public void setReaderTypeId(int readerTypeId) {
        this.readerTypeId = readerTypeId;
    }

    @Basic
    @Column(name = "reader_type_code", nullable = false, length = 128)
    public String getReaderTypeCode() {
        return readerTypeCode;
    }

    public void setReaderTypeCode(String readerTypeCode) {
        this.readerTypeCode = readerTypeCode;
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
    @Column(name = "reader_type_name", nullable = false, length = 128)
    public String getReaderTypeName() {
        return readerTypeName;
    }

    public void setReaderTypeName(String readerTypeName) {
        this.readerTypeName = readerTypeName;
    }

    @Basic
    @Column(name = "card_fee", nullable = true, precision = 2)
    public BigDecimal getCardFee() {
        return cardFee;
    }

    public void setCardFee(BigDecimal cardFee) {
        this.cardFee = cardFee;
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
    @Column(name = "expire_type", nullable = true, length = -1)
    public String getExpireType() {
        return expireType;
    }

    public void setExpireType(String expireType) {
        this.expireType = expireType;
    }

    @Basic
    @Column(name = "effective_days", nullable = true)
    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    @Basic
    @Column(name = "expire_date", nullable = true)
    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    @Basic
    @Column(name = "for_native_dept", nullable = true, length = -1)
    public String getForNativeDept() {
        return forNativeDept;
    }

    public void setForNativeDept(String forNativeDept) {
        this.forNativeDept = forNativeDept;
    }

    @Basic
    @Column(name = "borrow_num", nullable = false)
    public int getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(int borrowNum) {
        this.borrowNum = borrowNum;
    }

    @Basic
    @Column(name = "borrow_day", nullable = false)
    public int getBorrowDay() {
        return borrowDay;
    }

    public void setBorrowDay(int borrowDay) {
        this.borrowDay = borrowDay;
    }

    @Basic
    @Column(name = "order_book_num", nullable = false)
    public int getOrderBookNum() {
        return orderBookNum;
    }

    public void setOrderBookNum(int orderBookNum) {
        this.orderBookNum = orderBookNum;
    }

    @Basic
    @Column(name = "order_day", nullable = true)
    public Integer getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(Integer orderDay) {
        this.orderDay = orderDay;
    }

    @Basic
    @Column(name = "expire_pay_perday", nullable = true, precision = 2)
    public BigDecimal getExpirePayPerday() {
        return expirePayPerday;
    }

    public void setExpirePayPerday(BigDecimal expirePayPerday) {
        this.expirePayPerday = expirePayPerday;
    }

    @Basic
    @Column(name = "lost_pay_perbook", nullable = true)
    public Integer getLostPayPerbook() {
        return lostPayPerbook;
    }

    public void setLostPayPerbook(Integer lostPayPerbook) {
        this.lostPayPerbook = lostPayPerbook;
    }

    @Basic
    @Column(name = "reborrow_times", nullable = true)
    public Integer getReborrowTimes() {
        return reborrowTimes;
    }

    public void setReborrowTimes(Integer reborrowTimes) {
        this.reborrowTimes = reborrowTimes;
    }

    @Basic
    @Column(name = "reborrow_day", nullable = true)
    public Integer getReborrowDay() {
        return reborrowDay;
    }

    public void setReborrowDay(Integer reborrowDay) {
        this.reborrowDay = reborrowDay;
    }

    @Basic
    @Column(name = "max_debt", nullable = true, precision = 2)
    public BigDecimal getMaxDebt() {
        return maxDebt;
    }

    public void setMaxDebt(BigDecimal maxDebt) {
        this.maxDebt = maxDebt;
    }

    @Basic
    @Column(name = "max_expire_borrow_num", nullable = false)
    public int getMaxExpireBorrowNum() {
        return maxExpireBorrowNum;
    }

    public void setMaxExpireBorrowNum(int maxExpireBorrowNum) {
        this.maxExpireBorrowNum = maxExpireBorrowNum;
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
        CirReaderTypeEntity that = (CirReaderTypeEntity) o;
        return readerTypeId == that.readerTypeId &&
                deptId == that.deptId &&
                borrowNum == that.borrowNum &&
                borrowDay == that.borrowDay &&
                orderBookNum == that.orderBookNum &&
                maxExpireBorrowNum == that.maxExpireBorrowNum &&
                Objects.equals(readerTypeCode, that.readerTypeCode) &&
                Objects.equals(readerTypeName, that.readerTypeName) &&
                Objects.equals(cardFee, that.cardFee) &&
                Objects.equals(status, that.status) &&
                Objects.equals(expireType, that.expireType) &&
                Objects.equals(effectiveDays, that.effectiveDays) &&
                Objects.equals(expireDate, that.expireDate) &&
                Objects.equals(forNativeDept, that.forNativeDept) &&
                Objects.equals(orderDay, that.orderDay) &&
                Objects.equals(expirePayPerday, that.expirePayPerday) &&
                Objects.equals(lostPayPerbook, that.lostPayPerbook) &&
                Objects.equals(reborrowTimes, that.reborrowTimes) &&
                Objects.equals(reborrowDay, that.reborrowDay) &&
                Objects.equals(maxDebt, that.maxDebt) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readerTypeId, readerTypeCode, deptId, readerTypeName, cardFee, status, expireType, effectiveDays, expireDate, forNativeDept, borrowNum, borrowDay, orderBookNum, orderDay, expirePayPerday, lostPayPerbook, reborrowTimes, reborrowDay, maxDebt, maxExpireBorrowNum, createBy, createTime, updateBy, updateTime);
    }
}
