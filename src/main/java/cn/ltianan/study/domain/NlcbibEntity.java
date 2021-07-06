package cn.ltianan.study.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "nlcbib", schema = "public", catalog = "libresources")
public class NlcbibEntity {
    private String id;
    private String sysid;
    private String localBase;
    private String html;
    private String marctype;
    private String cnmarc;
    private String marc21;
    private String rdf;
    private String xml;
    private String docRcno;
    private String docFmt;
    private String docProductBarcode;
    private String docTitleProper;
    private String docAuthor;
    private String docTranslator;
    private String docSubtitle;
    private String docPublisher;
    private String docSeriesTitle;
    private String docSeriesAuthor;
    private String docPubplace;
    private String docAttachment;
    private String docClassno;
    private String docPubdate;
    private String docLanguage;
    private String docPages;
    private String docPrice;
    private String docIsbn;
    private String docIssn;
    private String docIsrc;
    private String docOrderno;
    private String docSize;
    private String docUpno;
    private String docEdition;
    private String docCycle;
    private String docWithnote;
    private String docDescriptor;
    private String docSummaries;
    private String docTitleProperPinyin;
    private String docAuthorPinyin;
    private String docSectionName;
    private Boolean isfinish;
    private Timestamp addedtime;
    private Boolean isskip;
    private Boolean isdel;

    @Id
    @Column(name = "id", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sysid", nullable = false, length = 32)
    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    @Basic
    @Column(name = "local_base", nullable = true, length = 32)
    public String getLocalBase() {
        return localBase;
    }

    public void setLocalBase(String localBase) {
        this.localBase = localBase;
    }

    @Basic
    @Column(name = "html", nullable = true, length = -1)
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Basic
    @Column(name = "marctype", nullable = true, length = 10)
    public String getMarctype() {
        return marctype;
    }

    public void setMarctype(String marctype) {
        this.marctype = marctype;
    }

    @Basic
    @Column(name = "cnmarc", nullable = true, length = -1)
    public String getCnmarc() {
        return cnmarc;
    }

    public void setCnmarc(String cnmarc) {
        this.cnmarc = cnmarc;
    }

    @Basic
    @Column(name = "marc21", nullable = true, length = -1)
    public String getMarc21() {
        return marc21;
    }

    public void setMarc21(String marc21) {
        this.marc21 = marc21;
    }

    @Basic
    @Column(name = "rdf", nullable = true, length = -1)
    public String getRdf() {
        return rdf;
    }

    public void setRdf(String rdf) {
        this.rdf = rdf;
    }

    @Basic
    @Column(name = "xml", nullable = true)
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    @Basic
    @Column(name = "doc_rcno", nullable = true, length = 50)
    public String getDocRcno() {
        return docRcno;
    }

    public void setDocRcno(String docRcno) {
        this.docRcno = docRcno;
    }

    @Basic
    @Column(name = "doc_fmt", nullable = true, length = 10)
    public String getDocFmt() {
        return docFmt;
    }

    public void setDocFmt(String docFmt) {
        this.docFmt = docFmt;
    }

    @Basic
    @Column(name = "doc_product_barcode", nullable = true, length = 250)
    public String getDocProductBarcode() {
        return docProductBarcode;
    }

    public void setDocProductBarcode(String docProductBarcode) {
        this.docProductBarcode = docProductBarcode;
    }

    @Basic
    @Column(name = "doc_title_proper", nullable = true, length = 1024)
    public String getDocTitleProper() {
        return docTitleProper;
    }

    public void setDocTitleProper(String docTitleProper) {
        this.docTitleProper = docTitleProper;
    }

    @Basic
    @Column(name = "doc_author", nullable = true, length = 1000)
    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    @Basic
    @Column(name = "doc_translator", nullable = true, length = 250)
    public String getDocTranslator() {
        return docTranslator;
    }

    public void setDocTranslator(String docTranslator) {
        this.docTranslator = docTranslator;
    }

    @Basic
    @Column(name = "doc_subtitle", nullable = true, length = 1000)
    public String getDocSubtitle() {
        return docSubtitle;
    }

    public void setDocSubtitle(String docSubtitle) {
        this.docSubtitle = docSubtitle;
    }

    @Basic
    @Column(name = "doc_publisher", nullable = true, length = 250)
    public String getDocPublisher() {
        return docPublisher;
    }

    public void setDocPublisher(String docPublisher) {
        this.docPublisher = docPublisher;
    }

    @Basic
    @Column(name = "doc_series_title", nullable = true, length = 250)
    public String getDocSeriesTitle() {
        return docSeriesTitle;
    }

    public void setDocSeriesTitle(String docSeriesTitle) {
        this.docSeriesTitle = docSeriesTitle;
    }

    @Basic
    @Column(name = "doc_series_author", nullable = true, length = 250)
    public String getDocSeriesAuthor() {
        return docSeriesAuthor;
    }

    public void setDocSeriesAuthor(String docSeriesAuthor) {
        this.docSeriesAuthor = docSeriesAuthor;
    }

    @Basic
    @Column(name = "doc_pubplace", nullable = true, length = 250)
    public String getDocPubplace() {
        return docPubplace;
    }

    public void setDocPubplace(String docPubplace) {
        this.docPubplace = docPubplace;
    }

    @Basic
    @Column(name = "doc_attachment", nullable = true, length = 250)
    public String getDocAttachment() {
        return docAttachment;
    }

    public void setDocAttachment(String docAttachment) {
        this.docAttachment = docAttachment;
    }

    @Basic
    @Column(name = "doc_classno", nullable = true, length = 250)
    public String getDocClassno() {
        return docClassno;
    }

    public void setDocClassno(String docClassno) {
        this.docClassno = docClassno;
    }

    @Basic
    @Column(name = "doc_pubdate", nullable = true, length = 250)
    public String getDocPubdate() {
        return docPubdate;
    }

    public void setDocPubdate(String docPubdate) {
        this.docPubdate = docPubdate;
    }

    @Basic
    @Column(name = "doc_language", nullable = true, length = 250)
    public String getDocLanguage() {
        return docLanguage;
    }

    public void setDocLanguage(String docLanguage) {
        this.docLanguage = docLanguage;
    }

    @Basic
    @Column(name = "doc_pages", nullable = true, length = 250)
    public String getDocPages() {
        return docPages;
    }

    public void setDocPages(String docPages) {
        this.docPages = docPages;
    }

    @Basic
    @Column(name = "doc_price", nullable = true, length = 250)
    public String getDocPrice() {
        return docPrice;
    }

    public void setDocPrice(String docPrice) {
        this.docPrice = docPrice;
    }

    @Basic
    @Column(name = "doc_isbn", nullable = true, length = 1000)
    public String getDocIsbn() {
        return docIsbn;
    }

    public void setDocIsbn(String docIsbn) {
        this.docIsbn = docIsbn;
    }

    @Basic
    @Column(name = "doc_issn", nullable = true, length = 250)
    public String getDocIssn() {
        return docIssn;
    }

    public void setDocIssn(String docIssn) {
        this.docIssn = docIssn;
    }

    @Basic
    @Column(name = "doc_isrc", nullable = true, length = 250)
    public String getDocIsrc() {
        return docIsrc;
    }

    public void setDocIsrc(String docIsrc) {
        this.docIsrc = docIsrc;
    }

    @Basic
    @Column(name = "doc_orderno", nullable = true, length = 250)
    public String getDocOrderno() {
        return docOrderno;
    }

    public void setDocOrderno(String docOrderno) {
        this.docOrderno = docOrderno;
    }

    @Basic
    @Column(name = "doc_size", nullable = true, length = 250)
    public String getDocSize() {
        return docSize;
    }

    public void setDocSize(String docSize) {
        this.docSize = docSize;
    }

    @Basic
    @Column(name = "doc_upno", nullable = true, length = 250)
    public String getDocUpno() {
        return docUpno;
    }

    public void setDocUpno(String docUpno) {
        this.docUpno = docUpno;
    }

    @Basic
    @Column(name = "doc_edition", nullable = true, length = 250)
    public String getDocEdition() {
        return docEdition;
    }

    public void setDocEdition(String docEdition) {
        this.docEdition = docEdition;
    }

    @Basic
    @Column(name = "doc_cycle", nullable = true, length = 250)
    public String getDocCycle() {
        return docCycle;
    }

    public void setDocCycle(String docCycle) {
        this.docCycle = docCycle;
    }

    @Basic
    @Column(name = "doc_withnote", nullable = true, length = 1000)
    public String getDocWithnote() {
        return docWithnote;
    }

    public void setDocWithnote(String docWithnote) {
        this.docWithnote = docWithnote;
    }

    @Basic
    @Column(name = "doc_descriptor", nullable = true, length = 1000)
    public String getDocDescriptor() {
        return docDescriptor;
    }

    public void setDocDescriptor(String docDescriptor) {
        this.docDescriptor = docDescriptor;
    }

    @Basic
    @Column(name = "doc_summaries", nullable = true, length = -1)
    public String getDocSummaries() {
        return docSummaries;
    }

    public void setDocSummaries(String docSummaries) {
        this.docSummaries = docSummaries;
    }

    @Basic
    @Column(name = "doc_title_proper_pinyin", nullable = true, length = 1024)
    public String getDocTitleProperPinyin() {
        return docTitleProperPinyin;
    }

    public void setDocTitleProperPinyin(String docTitleProperPinyin) {
        this.docTitleProperPinyin = docTitleProperPinyin;
    }

    @Basic
    @Column(name = "doc_author_pinyin", nullable = true, length = 1024)
    public String getDocAuthorPinyin() {
        return docAuthorPinyin;
    }

    public void setDocAuthorPinyin(String docAuthorPinyin) {
        this.docAuthorPinyin = docAuthorPinyin;
    }

    @Basic
    @Column(name = "doc_section_name", nullable = true, length = 1000)
    public String getDocSectionName() {
        return docSectionName;
    }

    public void setDocSectionName(String docSectionName) {
        this.docSectionName = docSectionName;
    }

    @Basic
    @Column(name = "isfinish", nullable = true)
    public Boolean getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(Boolean isfinish) {
        this.isfinish = isfinish;
    }

    @Basic
    @Column(name = "addedtime", nullable = true)
    public Timestamp getAddedtime() {
        return addedtime;
    }

    public void setAddedtime(Timestamp addedtime) {
        this.addedtime = addedtime;
    }

    @Basic
    @Column(name = "isskip", nullable = true)
    public Boolean getIsskip() {
        return isskip;
    }

    public void setIsskip(Boolean isskip) {
        this.isskip = isskip;
    }

    @Basic
    @Column(name = "isdel", nullable = true)
    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NlcbibEntity that = (NlcbibEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sysid != null ? !sysid.equals(that.sysid) : that.sysid != null) return false;
        if (localBase != null ? !localBase.equals(that.localBase) : that.localBase != null) return false;
        if (html != null ? !html.equals(that.html) : that.html != null) return false;
        if (marctype != null ? !marctype.equals(that.marctype) : that.marctype != null) return false;
        if (cnmarc != null ? !cnmarc.equals(that.cnmarc) : that.cnmarc != null) return false;
        if (marc21 != null ? !marc21.equals(that.marc21) : that.marc21 != null) return false;
        if (rdf != null ? !rdf.equals(that.rdf) : that.rdf != null) return false;
        if (xml != null ? !xml.equals(that.xml) : that.xml != null) return false;
        if (docRcno != null ? !docRcno.equals(that.docRcno) : that.docRcno != null) return false;
        if (docFmt != null ? !docFmt.equals(that.docFmt) : that.docFmt != null) return false;
        if (docProductBarcode != null ? !docProductBarcode.equals(that.docProductBarcode) : that.docProductBarcode != null)
            return false;
        if (docTitleProper != null ? !docTitleProper.equals(that.docTitleProper) : that.docTitleProper != null)
            return false;
        if (docAuthor != null ? !docAuthor.equals(that.docAuthor) : that.docAuthor != null) return false;
        if (docTranslator != null ? !docTranslator.equals(that.docTranslator) : that.docTranslator != null)
            return false;
        if (docSubtitle != null ? !docSubtitle.equals(that.docSubtitle) : that.docSubtitle != null) return false;
        if (docPublisher != null ? !docPublisher.equals(that.docPublisher) : that.docPublisher != null) return false;
        if (docSeriesTitle != null ? !docSeriesTitle.equals(that.docSeriesTitle) : that.docSeriesTitle != null)
            return false;
        if (docSeriesAuthor != null ? !docSeriesAuthor.equals(that.docSeriesAuthor) : that.docSeriesAuthor != null)
            return false;
        if (docPubplace != null ? !docPubplace.equals(that.docPubplace) : that.docPubplace != null) return false;
        if (docAttachment != null ? !docAttachment.equals(that.docAttachment) : that.docAttachment != null)
            return false;
        if (docClassno != null ? !docClassno.equals(that.docClassno) : that.docClassno != null) return false;
        if (docPubdate != null ? !docPubdate.equals(that.docPubdate) : that.docPubdate != null) return false;
        if (docLanguage != null ? !docLanguage.equals(that.docLanguage) : that.docLanguage != null) return false;
        if (docPages != null ? !docPages.equals(that.docPages) : that.docPages != null) return false;
        if (docPrice != null ? !docPrice.equals(that.docPrice) : that.docPrice != null) return false;
        if (docIsbn != null ? !docIsbn.equals(that.docIsbn) : that.docIsbn != null) return false;
        if (docIssn != null ? !docIssn.equals(that.docIssn) : that.docIssn != null) return false;
        if (docIsrc != null ? !docIsrc.equals(that.docIsrc) : that.docIsrc != null) return false;
        if (docOrderno != null ? !docOrderno.equals(that.docOrderno) : that.docOrderno != null) return false;
        if (docSize != null ? !docSize.equals(that.docSize) : that.docSize != null) return false;
        if (docUpno != null ? !docUpno.equals(that.docUpno) : that.docUpno != null) return false;
        if (docEdition != null ? !docEdition.equals(that.docEdition) : that.docEdition != null) return false;
        if (docCycle != null ? !docCycle.equals(that.docCycle) : that.docCycle != null) return false;
        if (docWithnote != null ? !docWithnote.equals(that.docWithnote) : that.docWithnote != null) return false;
        if (docDescriptor != null ? !docDescriptor.equals(that.docDescriptor) : that.docDescriptor != null)
            return false;
        if (docSummaries != null ? !docSummaries.equals(that.docSummaries) : that.docSummaries != null) return false;
        if (docTitleProperPinyin != null ? !docTitleProperPinyin.equals(that.docTitleProperPinyin) : that.docTitleProperPinyin != null)
            return false;
        if (docAuthorPinyin != null ? !docAuthorPinyin.equals(that.docAuthorPinyin) : that.docAuthorPinyin != null)
            return false;
        if (docSectionName != null ? !docSectionName.equals(that.docSectionName) : that.docSectionName != null)
            return false;
        if (isfinish != null ? !isfinish.equals(that.isfinish) : that.isfinish != null) return false;
        if (addedtime != null ? !addedtime.equals(that.addedtime) : that.addedtime != null) return false;
        if (isskip != null ? !isskip.equals(that.isskip) : that.isskip != null) return false;
        if (isdel != null ? !isdel.equals(that.isdel) : that.isdel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sysid != null ? sysid.hashCode() : 0);
        result = 31 * result + (localBase != null ? localBase.hashCode() : 0);
        result = 31 * result + (html != null ? html.hashCode() : 0);
        result = 31 * result + (marctype != null ? marctype.hashCode() : 0);
        result = 31 * result + (cnmarc != null ? cnmarc.hashCode() : 0);
        result = 31 * result + (marc21 != null ? marc21.hashCode() : 0);
        result = 31 * result + (rdf != null ? rdf.hashCode() : 0);
        result = 31 * result + (xml != null ? xml.hashCode() : 0);
        result = 31 * result + (docRcno != null ? docRcno.hashCode() : 0);
        result = 31 * result + (docFmt != null ? docFmt.hashCode() : 0);
        result = 31 * result + (docProductBarcode != null ? docProductBarcode.hashCode() : 0);
        result = 31 * result + (docTitleProper != null ? docTitleProper.hashCode() : 0);
        result = 31 * result + (docAuthor != null ? docAuthor.hashCode() : 0);
        result = 31 * result + (docTranslator != null ? docTranslator.hashCode() : 0);
        result = 31 * result + (docSubtitle != null ? docSubtitle.hashCode() : 0);
        result = 31 * result + (docPublisher != null ? docPublisher.hashCode() : 0);
        result = 31 * result + (docSeriesTitle != null ? docSeriesTitle.hashCode() : 0);
        result = 31 * result + (docSeriesAuthor != null ? docSeriesAuthor.hashCode() : 0);
        result = 31 * result + (docPubplace != null ? docPubplace.hashCode() : 0);
        result = 31 * result + (docAttachment != null ? docAttachment.hashCode() : 0);
        result = 31 * result + (docClassno != null ? docClassno.hashCode() : 0);
        result = 31 * result + (docPubdate != null ? docPubdate.hashCode() : 0);
        result = 31 * result + (docLanguage != null ? docLanguage.hashCode() : 0);
        result = 31 * result + (docPages != null ? docPages.hashCode() : 0);
        result = 31 * result + (docPrice != null ? docPrice.hashCode() : 0);
        result = 31 * result + (docIsbn != null ? docIsbn.hashCode() : 0);
        result = 31 * result + (docIssn != null ? docIssn.hashCode() : 0);
        result = 31 * result + (docIsrc != null ? docIsrc.hashCode() : 0);
        result = 31 * result + (docOrderno != null ? docOrderno.hashCode() : 0);
        result = 31 * result + (docSize != null ? docSize.hashCode() : 0);
        result = 31 * result + (docUpno != null ? docUpno.hashCode() : 0);
        result = 31 * result + (docEdition != null ? docEdition.hashCode() : 0);
        result = 31 * result + (docCycle != null ? docCycle.hashCode() : 0);
        result = 31 * result + (docWithnote != null ? docWithnote.hashCode() : 0);
        result = 31 * result + (docDescriptor != null ? docDescriptor.hashCode() : 0);
        result = 31 * result + (docSummaries != null ? docSummaries.hashCode() : 0);
        result = 31 * result + (docTitleProperPinyin != null ? docTitleProperPinyin.hashCode() : 0);
        result = 31 * result + (docAuthorPinyin != null ? docAuthorPinyin.hashCode() : 0);
        result = 31 * result + (docSectionName != null ? docSectionName.hashCode() : 0);
        result = 31 * result + (isfinish != null ? isfinish.hashCode() : 0);
        result = 31 * result + (addedtime != null ? addedtime.hashCode() : 0);
        result = 31 * result + (isskip != null ? isskip.hashCode() : 0);
        result = 31 * result + (isdel != null ? isdel.hashCode() : 0);
        return result;
    }
}
