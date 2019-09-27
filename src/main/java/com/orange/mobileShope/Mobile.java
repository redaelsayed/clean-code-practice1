package com.orange.mobileShope;

import java.util.List;

public class Mobile {
	
	int iD;
	String company;
	String m;
	int S_Size;
	int r_Size;
	int CPU_C;
	
	public Mobile(int iD,String company,String m,int S_Size,int r_Size,int CPU_C) {
		this.iD=iD;
		this.company=company;
		this.m=m;
		this.S_Size=S_Size;
		this.r_Size=r_Size;
		this.CPU_C=CPU_C;
	}
	
	
	public void save() {
		
		DBSimulator.addMobile(this);
	}
	
	public static List Mobiles() {
		return DBSimulator.getMobiles();
	}

}
