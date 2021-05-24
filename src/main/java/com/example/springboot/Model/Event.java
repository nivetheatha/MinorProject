package com.example.springboot.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Event {
@Id
private int eid;
private String ename;
private Date edate;
private float etime;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Date getEdate() {
	return edate;
}
public void setEdate(Date edate) {
	this.edate = edate;
}
public float getEtime() {
	return etime;
}
public void setEtime(float etime) {
	this.etime = etime;
}


}
