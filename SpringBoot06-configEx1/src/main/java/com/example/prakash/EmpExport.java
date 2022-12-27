package com.example.prakash;

public class EmpExport {
	
	private Integer code;
	private String name;
	
	public final Integer getCode() {
		return code;
	}
	public final void setCode(Integer code) {
		this.code = code;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpExport [code=" + code + ", name=" + name + "]";
	}
	

}
