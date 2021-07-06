package cn.ltianan.study.domain2;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bib", schema = "public")
public class BibEntity {
    private int bibId;
    private int recordId;
    private int deptId;
    private int parentId;
    private String marc;
    private int marcTypeId;
    private Integer bookTypeId;
    private String attachment;
    private String author;
    private String otherAuthor;
    private String booksize;
    private String classno;
    private String doctype;
    private String productBarcode;
    private String isbn;
    private String issn;
    private String language;
    private String orderno;
    private String page;
    private String bookbinding;
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
    private String recommend;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "bib_id", nullable = false)
    public int getBibId() {
        return bibId;
    }

    public void setBibId(int bibId) {
        this.bibId = bibId;
    }

    @Basic
    @Column(name = "record_id", nullable = false)
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
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
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "marc", nullable = true, length = -1)
    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    @Basic
    @Column(name = "marc_type_id", nullable = false)
    public int getMarcTypeId() {
        return marcTypeId;
    }

    public void setMarcTypeId(int marcTypeId) {
        this.marcTypeId = marcTypeId;
    }

    @Basic
    @Column(name = "book_type_id", nullable = true)
    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    @Basic
    @Column(name = "attachment", nullable = true, length = 250)
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 250)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "other_author", nullable = true, length = 250)
    public String getOtherAuthor() {
        return otherAuthor;
    }

    public void setOtherAuthor(String otherAuthor) {
        this.otherAuthor = otherAuthor;
    }

    @Basic
    @Column(name = "booksize", nullable = true, length = 250)
    public String getBooksize() {
        return booksize;
    }

    public void setBooksize(String booksize) {
        this.booksize = booksize;
    }

    @Basic
    @Column(name = "classno", nullable = true, length = 250)
    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    @Basic
    @Column(name = "doctype", nullable = true, length = 100)
    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    @Basic
    @Column(name = "product_barcode", nullable = true, length = 100)
    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
    }

    @Basic
    @Column(name = "isbn", nullable = true, length = 250)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "issn", nullable = true, length = 250)
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "language", nullable = true, length = 250)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "orderno", nullable = true, length = 250)
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Basic
    @Column(name = "page", nullable = true, length = 250)
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Basic
    @Column(name = "bookbinding", nullable = true, length = 250)
    public String getBookbinding() {
        return bookbinding;
    }

    public void setBookbinding(String bookbinding) {
        this.bookbinding = bookbinding;
    }

    @Basic
    @Column(name = "price", nullable = true, length = 250)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "pubdate", nullable = true, length = 250)
    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    @Basic
    @Column(name = "publisher", nullable = true, length = 250)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "pubplace", nullable = true, length = 250)
    public String getPubplace() {
        return pubplace;
    }

    public void setPubplace(String pubplace) {
        this.pubplace = pubplace;
    }

    @Basic
    @Column(name = "series_title", nullable = true, length = 250)
    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    @Basic
    @Column(name = "series_author", nullable = true, length = 250)
    public String getSeriesAuthor() {
        return seriesAuthor;
    }

    public void setSeriesAuthor(String seriesAuthor) {
        this.seriesAuthor = seriesAuthor;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 250)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "parallel_title", nullable = true, length = 250)
    public String getParallelTitle() {
        return parallelTitle;
    }

    public void setParallelTitle(String parallelTitle) {
        this.parallelTitle = parallelTitle;
    }

    @Basic
    @Column(name = "subtitle", nullable = true, length = 250)
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Basic
    @Column(name = "section_name", nullable = true, length = 250)
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Basic
    @Column(name = "section_no", nullable = true, length = 250)
    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    @Basic
    @Column(name = "upno", nullable = true, length = 250)
    public String getUpno() {
        return upno;
    }

    public void setUpno(String upno) {
        this.upno = upno;
    }

    @Basic
    @Column(name = "edition", nullable = true, length = 250)
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "subject", nullable = true, length = 250)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 2000)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "frequency", nullable = true, length = 250)
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "withnote", nullable = true, length = 250)
    public String getWithnote() {
        return withnote;
    }

    public void setWithnote(String withnote) {
        this.withnote = withnote;
    }

    @Basic
    @Column(name = "recommend", nullable = true, length = -1)
    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = -1)
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
    @Column(name = "update_by", nullable = true, length = -1)
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

        BibEntity bibEntity = (BibEntity) o;

        if (bibId != bibEntity.bibId) return false;
        if (recordId != bibEntity.recordId) return false;
        if (deptId != bibEntity.deptId) return false;
        if (parentId != bibEntity.parentId) return false;
        if (marcTypeId != bibEntity.marcTypeId) return false;
        if (marc != null ? !marc.equals(bibEntity.marc) : bibEntity.marc != null) return false;
        if (bookTypeId != null ? !bookTypeId.equals(bibEntity.bookTypeId) : bibEntity.bookTypeId != null) return false;
        if (attachment != null ? !attachment.equals(bibEntity.attachment) : bibEntity.attachment != null) return false;
        if (author != null ? !author.equals(bibEntity.author) : bibEntity.author != null) return false;
        if (otherAuthor != null ? !otherAuthor.equals(bibEntity.otherAuthor) : bibEntity.otherAuthor != null)
            return false;
        if (booksize != null ? !booksize.equals(bibEntity.booksize) : bibEntity.booksize != null) return false;
        if (classno != null ? !classno.equals(bibEntity.classno) : bibEntity.classno != null) return false;
        if (doctype != null ? !doctype.equals(bibEntity.doctype) : bibEntity.doctype != null) return false;
        if (productBarcode != null ? !productBarcode.equals(bibEntity.productBarcode) : bibEntity.productBarcode != null)
            return false;
        if (isbn != null ? !isbn.equals(bibEntity.isbn) : bibEntity.isbn != null) return false;
        if (issn != null ? !issn.equals(bibEntity.issn) : bibEntity.issn != null) return false;
        if (language != null ? !language.equals(bibEntity.language) : bibEntity.language != null) return false;
        if (orderno != null ? !orderno.equals(bibEntity.orderno) : bibEntity.orderno != null) return false;
        if (page != null ? !page.equals(bibEntity.page) : bibEntity.page != null) return false;
        if (bookbinding != null ? !bookbinding.equals(bibEntity.bookbinding) : bibEntity.bookbinding != null)
            return false;
        if (price != null ? !price.equals(bibEntity.price) : bibEntity.price != null) return false;
        if (pubdate != null ? !pubdate.equals(bibEntity.pubdate) : bibEntity.pubdate != null) return false;
        if (publisher != null ? !publisher.equals(bibEntity.publisher) : bibEntity.publisher != null) return false;
        if (pubplace != null ? !pubplace.equals(bibEntity.pubplace) : bibEntity.pubplace != null) return false;
        if (seriesTitle != null ? !seriesTitle.equals(bibEntity.seriesTitle) : bibEntity.seriesTitle != null)
            return false;
        if (seriesAuthor != null ? !seriesAuthor.equals(bibEntity.seriesAuthor) : bibEntity.seriesAuthor != null)
            return false;
        if (title != null ? !title.equals(bibEntity.title) : bibEntity.title != null) return false;
        if (parallelTitle != null ? !parallelTitle.equals(bibEntity.parallelTitle) : bibEntity.parallelTitle != null)
            return false;
        if (subtitle != null ? !subtitle.equals(bibEntity.subtitle) : bibEntity.subtitle != null) return false;
        if (sectionName != null ? !sectionName.equals(bibEntity.sectionName) : bibEntity.sectionName != null)
            return false;
        if (sectionNo != null ? !sectionNo.equals(bibEntity.sectionNo) : bibEntity.sectionNo != null) return false;
        if (upno != null ? !upno.equals(bibEntity.upno) : bibEntity.upno != null) return false;
        if (edition != null ? !edition.equals(bibEntity.edition) : bibEntity.edition != null) return false;
        if (subject != null ? !subject.equals(bibEntity.subject) : bibEntity.subject != null) return false;
        if (summary != null ? !summary.equals(bibEntity.summary) : bibEntity.summary != null) return false;
        if (frequency != null ? !frequency.equals(bibEntity.frequency) : bibEntity.frequency != null) return false;
        if (withnote != null ? !withnote.equals(bibEntity.withnote) : bibEntity.withnote != null) return false;
        if (recommend != null ? !recommend.equals(bibEntity.recommend) : bibEntity.recommend != null) return false;
        if (createBy != null ? !createBy.equals(bibEntity.createBy) : bibEntity.createBy != null) return false;
        if (createTime != null ? !createTime.equals(bibEntity.createTime) : bibEntity.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(bibEntity.updateBy) : bibEntity.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(bibEntity.updateTime) : bibEntity.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bibId;
        result = 31 * result + recordId;
        result = 31 * result + deptId;
        result = 31 * result + parentId;
        result = 31 * result + (marc != null ? marc.hashCode() : 0);
        result = 31 * result + marcTypeId;
        result = 31 * result + (bookTypeId != null ? bookTypeId.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (otherAuthor != null ? otherAuthor.hashCode() : 0);
        result = 31 * result + (booksize != null ? booksize.hashCode() : 0);
        result = 31 * result + (classno != null ? classno.hashCode() : 0);
        result = 31 * result + (doctype != null ? doctype.hashCode() : 0);
        result = 31 * result + (productBarcode != null ? productBarcode.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (orderno != null ? orderno.hashCode() : 0);
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (bookbinding != null ? bookbinding.hashCode() : 0);
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
        result = 31 * result + (recommend != null ? recommend.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
