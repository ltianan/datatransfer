package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "marc_type", schema = "public")
public class MarcTypeEntity {
    private int marcTypeId;
    private String typeName;
    private String attachment;
    private String author;
    private String booksize;
    private String classno;
    private String doctype;
    private String isbn;
    private String issn;
    private String language;
    private String orderno;
    private String page;
    private String price;
    private String pubdate;
    private String publisher;
    private String pubplace;
    private String seriesTitle;
    private String seriesAuthor;
    private String title;
    private String parallelTitle;
    private String subtitle;
    private String sectionName;
    private String sectionNo;
    private String upno;
    private String edition;
    private String subject;
    private String summary;
    private String frequency;
    private String withnote;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;
    private String otherAuthor;

    @Id
    @Column(name = "marc_type_id", nullable = false)
    public int getMarcTypeId() {
        return marcTypeId;
    }

    public void setMarcTypeId(int marcTypeId) {
        this.marcTypeId = marcTypeId;
    }

    @Basic
    @Column(name = "type_name", nullable = false, length = 60)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "attachment", nullable = true, length = 4)
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 4)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "booksize", nullable = true, length = 4)
    public String getBooksize() {
        return booksize;
    }

    public void setBooksize(String booksize) {
        this.booksize = booksize;
    }

    @Basic
    @Column(name = "classno", nullable = true, length = 4)
    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    @Basic
    @Column(name = "doctype", nullable = true, length = 4)
    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    @Basic
    @Column(name = "isbn", nullable = false, length = 4)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "issn", nullable = true, length = 4)
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "language", nullable = true, length = 4)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "orderno", nullable = true, length = 4)
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Basic
    @Column(name = "page", nullable = true, length = 4)
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Basic
    @Column(name = "price", nullable = true, length = 4)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "pubdate", nullable = true, length = 4)
    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "publisher", nullable = false, length = 4)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "pubplace", nullable = true, length = 4)
    public String getPubplace() {
        return pubplace;
    }

    public void setPubplace(String pubplace) {
        this.pubplace = pubplace;
    }

    @Basic
    @Column(name = "series_title", nullable = true, length = 4)
    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    @Basic
    @Column(name = "series_author", nullable = true, length = 4)
    public String getSeriesAuthor() {
        return seriesAuthor;
    }

    public void setSeriesAuthor(String seriesAuthor) {
        this.seriesAuthor = seriesAuthor;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 4)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "parallel_title", nullable = true, length = 4)
    public String getParallelTitle() {
        return parallelTitle;
    }

    public void setParallelTitle(String parallelTitle) {
        this.parallelTitle = parallelTitle;
    }

    @Basic
    @Column(name = "subtitle", nullable = true, length = 4)
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @Column(name = "section_name", nullable = true, length = 4)
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Basic
    @Column(name = "section_no", nullable = true, length = 4)
    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    @Basic
    @Column(name = "upno", nullable = true, length = 4)
    public String getUpno() {
        return upno;
    }

    public void setUpno(String upno) {
        this.upno = upno;
    }

    @Basic
    @Column(name = "edition", nullable = true, length = 4)
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "subject", nullable = true, length = 4)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 4)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "frequency", nullable = true, length = 4)
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "withnote", nullable = true, length = 4)
    public String getWithnote() {
        return withnote;
    }

    public void setWithnote(String withnote) {
        this.withnote = withnote;
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
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "other_author", nullable = true, length = 4)
    public String getOtherAuthor() {
        return otherAuthor;
    }

    public void setOtherAuthor(String otherAuthor) {
        this.otherAuthor = otherAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcTypeEntity that = (MarcTypeEntity) o;

        if (marcTypeId != that.marcTypeId) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (booksize != null ? !booksize.equals(that.booksize) : that.booksize != null) return false;
        if (classno != null ? !classno.equals(that.classno) : that.classno != null) return false;
        if (doctype != null ? !doctype.equals(that.doctype) : that.doctype != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (issn != null ? !issn.equals(that.issn) : that.issn != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (orderno != null ? !orderno.equals(that.orderno) : that.orderno != null) return false;
        if (page != null ? !page.equals(that.page) : that.page != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (pubdate != null ? !pubdate.equals(that.pubdate) : that.pubdate != null) return false;
        if (publisher != null ? !publisher.equals(that.publisher) : that.publisher != null) return false;
        if (pubplace != null ? !pubplace.equals(that.pubplace) : that.pubplace != null) return false;
        if (seriesTitle != null ? !seriesTitle.equals(that.seriesTitle) : that.seriesTitle != null) return false;
        if (seriesAuthor != null ? !seriesAuthor.equals(that.seriesAuthor) : that.seriesAuthor != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (parallelTitle != null ? !parallelTitle.equals(that.parallelTitle) : that.parallelTitle != null)
            return false;
        if (subtitle != null ? !subtitle.equals(that.subtitle) : that.subtitle != null) return false;
        if (sectionName != null ? !sectionName.equals(that.sectionName) : that.sectionName != null) return false;
        if (sectionNo != null ? !sectionNo.equals(that.sectionNo) : that.sectionNo != null) return false;
        if (upno != null ? !upno.equals(that.upno) : that.upno != null) return false;
        if (edition != null ? !edition.equals(that.edition) : that.edition != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;
        if (withnote != null ? !withnote.equals(that.withnote) : that.withnote != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (otherAuthor != null ? !otherAuthor.equals(that.otherAuthor) : that.otherAuthor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = marcTypeId;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (booksize != null ? booksize.hashCode() : 0);
        result = 31 * result + (classno != null ? classno.hashCode() : 0);
        result = 31 * result + (doctype != null ? doctype.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (orderno != null ? orderno.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (pubdate != null ? pubdate.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (pubplace != null ? pubplace.hashCode() : 0);
        result = 31 * result + (seriesTitle != null ? seriesTitle.hashCode() : 0);
        result = 31 * result + (seriesAuthor != null ? seriesAuthor.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (parallelTitle != null ? parallelTitle.hashCode() : 0);
        result = 31 * result + (subtitle != null ? subtitle.hashCode() : 0);
        result = 31 * result + (sectionName != null ? sectionName.hashCode() : 0);
        result = 31 * result + (sectionNo != null ? sectionNo.hashCode() : 0);
        result = 31 * result + (upno != null ? upno.hashCode() : 0);
        result = 31 * result + (edition != null ? edition.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (withnote != null ? withnote.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (otherAuthor != null ? otherAuthor.hashCode() : 0);
        return result;
    }
}
