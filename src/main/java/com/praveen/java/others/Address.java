package com.praveen.java.others;

// This is an mutable class
public class Address  implements Cloneable{
	
	Long id;
	String desc;
	String location;
	public Address(Long id, String desc, String location) {
		super();
		this.id = id;
		this.desc = desc;
		this.location = location;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", desc=" + desc + ", location=" + location + "]";
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
    }  	
	
}
