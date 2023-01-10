package com.example.prakash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class EmpClass {
	@Id
	@Column(name="eid")
	private Integer empid;
	@Column(name="ename")
	private String empname;
	@Column(name="esal")
	private Double empsal;

}
