package banaple.quick.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Member implements Serializable {
	@Id
	@GeneratedValue
	Long id;
	String name;
	String username;
	String remark;
	public Member(){}
	public Member(String name,String username,String remark) {
		this.name = name;
		this.username = username;
		this.remark = remark;
	}
}
