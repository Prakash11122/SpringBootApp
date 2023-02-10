package com.example.prakash.time;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TimeStamp {
	@Id
	private Integer id;
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date dteA;
	@Temporal(TemporalType.TIME)
	private Date dteB;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dteC;

	
	
	
	
	
	
	
	
}
