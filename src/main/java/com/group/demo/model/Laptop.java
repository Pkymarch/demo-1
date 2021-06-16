package com.group.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
   int lid;
   String  lname;
   
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
   
   public void laptop() {
	   System.out.println("laptop");
   }
}
