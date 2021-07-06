package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "cir_reader", schema = "public")
public class CirReaderEntity {
    private int readerId;
    private String readerNo;
    private String readerName;
    private String readerPassword;
    private long deptId;
    private Integer readerUnitId;
    private Integer readerTypeId;
    private String tel;
    private String mobile;
    private String email;
    private String address;
    private BigDecimal deposit;
    private BigDecimal debt;
    private String nation;
    private Date birthday;
    private String birthplace;
    private Date startDate;
    private Date expireDate;
    private Date stoppedDate;
    private String sex;
    private String idcard;
    private String readercardNo;
    private String studentNo;
    private String readerStatus;
    private String openid;
    private String readerAvatar;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "reader_id", nullable = false)
    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    @Basic
    @Column(name = "reader_no", nullable = false, length = 100)
    public String getReaderNo() {
        return readerNo;
    }

    public void setReaderNo(String readerNo) {
        this.readerNo = readerNo;
    }

    @Basic
    @Column(name = "reader_name", nullable = false, length = 30)
    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Basic
    @Column(name = "reader_password", nullable = true, length = 64)
    public String getReaderPassword() {
        return readerPassword;
    }

    public void setReaderPassword(String readerPassword) {
        this.readerPassword = readerPassword;
    }

    @Basic
    @Column(name = "dept_id", nullable = false)
    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "reader_unit_id", nullable = true)
    public Integer getReaderUnitId() {
        return readerUnitId;
    }

    public void setReaderUnitId(Integer readerUnitId) {
        this.readerUnitId = readerUnitId;
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
    @Column(name = "tel", nullable = true, length = 30)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "deposit", nullable = false, precision = 2)
    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    @Basic
    @Column(name = "debt", nullable = false, precision = 2)
    public BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    @Basic
    @Column(name = "nation", nullable = true, length = 20)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "birthplace", nullable = true, length = 50)
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Basic
    @Column(name = "start_date", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "expire_date", nullable = false)
    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    @Basic
    @Column(name = "stopped_date", nullable = true)
    public Date getStoppedDate() {
        return stoppedDate;
    }

    public void setStoppedDate(Date stoppedDate) {
        this.stoppedDate = stoppedDate;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = -1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "idcard", nullable = true, length = 18)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "readercard_no", nullable = true, length = 32)
    public String getReadercardNo() {
        return readercardNo;
    }

    public void setReadercardNo(String readercardNo) {
        this.readercardNo = readercardNo;
    }

    @Basic
    @Column(name = "student_no", nullable = true, length = 32)
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    @Basic
    @Column(name = "reader_status", nullable = true, length = -1)
    public String getReaderStatus() {
        return readerStatus;
    }

    public void setReaderStatus(String readerStatus) {
        this.readerStatus = readerStatus;
    }

    @Basic
    @Column(name = "openid", nullable = true, length = 64)
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "reader_avatar", nullable = true, length = 100)
    public String getReaderAvatar() {
        return readerAvatar;
    }

    public void setReaderAvatar(String readerAvatar) {
        this.readerAvatar = readerAvatar;
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

        CirReaderEntity that = (CirReaderEntity) o;

        if (readerId != that.readerId) return false;
        if (deptId != that.deptId) return false;
        if (readerNo != null ? !readerNo.equals(that.readerNo) : that.readerNo != null) return false;
        if (readerName != null ? !readerName.equals(that.readerName) : that.readerName != null) return false;
        if (readerPassword != null ? !readerPassword.equals(that.readerPassword) : that.readerPassword != null)
            return false;
        if (readerUnitId != null ? !readerUnitId.equals(that.readerUnitId) : that.readerUnitId != null) return false;
        if (readerTypeId != null ? !readerTypeId.equals(that.readerTypeId) : that.readerTypeId != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (deposit != null ? !deposit.equals(that.deposit) : that.deposit != null) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (birthplace != null ? !birthplace.equals(that.birthplace) : that.birthplace != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (expireDate != null ? !expireDate.equals(that.expireDate) : that.expireDate != null) return false;
        if (stoppedDate != null ? !stoppedDate.equals(that.stoppedDate) : that.stoppedDate != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (idcard != null ? !idcard.equals(that.idcard) : that.idcard != null) return false;
        if (readercardNo != null ? !readercardNo.equals(that.readercardNo) : that.readercardNo != null) return false;
        if (studentNo != null ? !studentNo.equals(that.studentNo) : that.studentNo != null) return false;
        if (readerStatus != null ? !readerStatus.equals(that.readerStatus) : that.readerStatus != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (readerAvatar != null ? !readerAvatar.equals(that.readerAvatar) : that.readerAvatar != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = readerId;
        result = 31 * result + (readerNo != null ? readerNo.hashCode() : 0);
        result = 31 * result + (readerName != null ? readerName.hashCode() : 0);
        result = 31 * result + (readerPassword != null ? readerPassword.hashCode() : 0);
        result = 31 * result + (int) (deptId ^ (deptId >>> 32));
        result = 31 * result + (readerUnitId != null ? readerUnitId.hashCode() : 0);
        result = 31 * result + (readerTypeId != null ? readerTypeId.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (deposit != null ? deposit.hashCode() : 0);
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (expireDate != null ? expireDate.hashCode() : 0);
        result = 31 * result + (stoppedDate != null ? stoppedDate.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        result = 31 * result + (readercardNo != null ? readercardNo.hashCode() : 0);
        result = 31 * result + (studentNo != null ? studentNo.hashCode() : 0);
        result = 31 * result + (readerStatus != null ? readerStatus.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (readerAvatar != null ? readerAvatar.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
