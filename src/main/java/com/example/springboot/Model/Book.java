package com.example.springboot.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Book {
@Id
private int bid;
private String bname;
private String bauthor;


  @ManyToOne  
 @JoinColumn(name="uid")
  private User user;


public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBauthor() {
	return bauthor;
}
public void setBauthor(String bauthor) {
	this.bauthor = bauthor;
}




}
