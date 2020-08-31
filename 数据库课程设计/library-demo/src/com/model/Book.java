package com.model;

public class Book {
	private String bid;
	private String bname;
	private String bwriter;
	private String bpublish;
	private String bclass;
	private String bdate;
	private float bprice;
	private int bcopy;
	private String bcaseid;
	private String bstate;
	
	public Book() {}
	public Book(String bid, String bname, String bwriter,String bpublish,String bclass,String bdate,float bprice,int bcopy,String bcaseid,String bstate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bwriter = bwriter;
		this.bpublish = bpublish;
		this.bclass = bclass;
		this.bdate = bdate;
		this.bprice = bprice;
		this.bcopy = bcopy;
		this.bcaseid = bcaseid;
		this.bstate = bstate;
		
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public String getBpublish() {
		return bpublish;
	}
	public void setBpublish(String bpublish) {
		this.bpublish = bpublish;
	}
	public String getBclass() {
		return bclass;
	}
	public void setBclass(String bclass) {
		this.bclass = bclass;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	public int getBcopy() {
		return bcopy;
	}
	public void setBcopy(int bcopy) {
		this.bcopy = bcopy;
	}
	public String getBcaseid() {
		return bcaseid;
	}
	public void setBcaseid(String bcaseid) {
		this.bcaseid = bcaseid;
	}
	public String getBstate() {
		return bstate;
	}
	public void setBstate(String bstate) {
		this.bstate = bstate;
	}


}

