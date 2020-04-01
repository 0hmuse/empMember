package com.example.demo.vo;

public class EmpVo {
	private String dname;
	private int cnt;
	
	public EmpVo(String dname, int cnt) {
		super();
		this.dname = dname;
		this.cnt = cnt;
	}

	public EmpVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}	
}
