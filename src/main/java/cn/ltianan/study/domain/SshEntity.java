package cn.ltianan.study.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ssh", schema = "dbo", catalog = "dbdgbx")
public class SshEntity {
    private int sshid;
    private String ssh;

    @Basic
    @Column(name = "sshid", nullable = false)
    public int getSshid() {
        return sshid;
    }

    public void setSshid(int sshid) {
        this.sshid = sshid;
    }

    @Id
    @Column(name = "ssh", nullable = false, length = 50)
    public String getSsh() {
        return ssh;
    }

    public void setSsh(String ssh) {
        this.ssh = ssh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SshEntity sshEntity = (SshEntity) o;
        return sshid == sshEntity.sshid &&
                Objects.equals(ssh, sshEntity.ssh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sshid, ssh);
    }
}
