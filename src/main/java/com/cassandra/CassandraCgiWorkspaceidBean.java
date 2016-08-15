package com.cassandra;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class CassandraCgiWorkspaceidBean implements Serializable {

	private String cgiid;
	private String workspaceid;
	private String time;

	public CassandraCgiWorkspaceidBean(String cgiid, String workspaceid) {
		super();
		this.cgiid = cgiid;
		this.workspaceid = workspaceid;
		this.time = new Timestamp(new Date().getTime()).toString();

	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCgiid() {
		return this.cgiid;
	}

	public void setCgiid(String cgiid) {
		this.cgiid = cgiid;
	}

	public String getWorkspaceid() {
		return this.workspaceid;
	}

	public void setWorkspaceid(String workspaceid) {
		this.workspaceid = workspaceid;
	}

}
