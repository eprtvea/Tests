package com.cassandra;

import java.io.Serializable;

public class EmpBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int empid;
	private int depitd;
	private String first_name;
	private String last_name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getDepitd() {
		return depitd;
	}
	public void setDepitd(int depitd) {
		this.depitd = depitd;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
