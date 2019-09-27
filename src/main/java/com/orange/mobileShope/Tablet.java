package com.orange.mobileShope;

import java.util.List;

public class Tablet {
	int iD;
	String company;
	String m;
	int S_Size;
	int r_Size;
	int CPU_C;
	
	public Tablet(int iD,String company,String m,int S_Size,int r_Size,int CPU_C) {
		this.iD=iD;
		this.company=company;
		this.m=m;
		this.S_Size=S_Size;
		this.r_Size=r_Size;
		this.CPU_C=CPU_C;
	}
	
	
	public void save() {
		
		DBSimulator.addTablet(this);
	}
	
	public static List tables() {
		return DBSimulator.getTablets();
	}

}
