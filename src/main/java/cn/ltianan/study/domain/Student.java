package cn.ltianan.study.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name="id",columnDefinition="serial",nullable=false,insertable=false,updatable=false)
    private Integer id;
    
    @Column(name="name",columnDefinition="character varying")
    private String name;
    
//    @Column(name="nick_name",columnDefinition="character varying")
//    private String nickName;
//    
    public Student(String name) {
        this.setName(name);
    }
    
    public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getNickName() {
//		return nickName;
//	}
//
//	public void setNickName(String nickName) {
//		this.nickName = nickName;
//	}
}
