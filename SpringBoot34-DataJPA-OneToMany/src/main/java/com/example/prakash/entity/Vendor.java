package com.example.prakash.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vendor {
	
	@Id
	private Integer vid;
	private String vname;
	private String vaddr;
	
	 
	@OneToMany
	@JoinColumn(name="id-FK")
	private List<Contract> cobs;

}
