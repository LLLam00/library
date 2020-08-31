package com.model;

public class Reader {
	private String rid;
	private String rname;
	private String rsex;
	private String rtype;
	private String rdept;
	private String rtele;
	private int bnum;
	private String idpassword;
	
	public Reader() {}
	public Reader(String rid, String rname, String rsex,String rtype,String rdept,String rtele,int bnum,String idpassword) {
		super();
		this.setRid(rid);
		this.setRname(rname);
		this.setRsex(rsex);
		this.setRtype(rtype);
		this.setRdept(rdept);
		this.setRtele(rtele);
		this.setBnum(bnum);
		
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getRsex() {
		return rsex;
	}
	public void setRsex(String rsex) {
		this.rsex = rsex;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRdept() {
		return rdept;
	}
	public void setRdept(String rdept) {
		this.rdept = rdept;
	}
	public String getRtele() {
		return rtele;
	}
	public void setRtele(String rtele) {
		this.rtele = rtele;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getIdpassword() {
		return idpassword;
	}
	public void setIdpassword(String idpassword) {
		this.idpassword = idpassword;
	}
}

