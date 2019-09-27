package com.orange.mobileShope;

import java.util.List;

public class Shope {
	
	int _id;
	String _n; // the name
	String _Str;
	String _c; // city name
	String _zcode;
	String _phone1;
	String _phone2;
	
	public Shope(int i, String n,String str,String c,String zc,String p1,String p2) {
		_id=i;
		_n =n;
		_Str=str;
		_zcode=zc;
		_c = c;
		_phone1=p1;
		_phone2=p2;
	}
	
	public Shope(int i,String n) {
		_id=i;
		_n=n;
	}
	
	public Shope(int i,String n,String s,String c) {
		_id=i;
		_n=n;
		_c=c;
	}
	
	public Shope(int i,String n,String s,String p1,String p2) {
		_id=i;
		_n=n;
		_phone1=p1;
		_phone2=p2;
	}
	
	
	public void new_item(int iD,int type,String company/*Vendor*/,String m/*Model*/,int S_Size/*screen Size*/,int r_Size/*Ram capacity*/,int CPU_C/*CPU Cores*/) {
		
		
		switch (type) {
		case 1:
			  Mobile mob = new Mobile(iD,company,m,S_Size,r_Size,CPU_C);
			  mob.save();
			  break;
		case 2:
			  Tablet mob2 = new Tablet(iD,company,m,S_Size,r_Size,CPU_C);
			  mob2.save();
			  break;
		
		}
		
		
	}
	
	// report structure 
	/*
	 * 1- header contains size
	 * 2- List of mobiles
	 * 3-List of tablets
	 * 4-Footer
	 * */
	
	public String report() {
		String r="";
		int s = DBSimulator.getSize();
		r= r+"Total="+s;
		List ms = Mobile.Mobiles();
		if(ms.size()>0) {
			r=r+",Mobiles List:";
			for(int i=0;i<ms.size();i++) {
				Mobile m =(Mobile)ms.get(i);
				r=r+m.iD+","+m.company+","+m.m;
			}
			
		}
		List ts= Tablet.tables();
		if(ts.size()>0) {
			r=r+",Tablets List:";
			for(int i=0;i<ts.size();i++) {
				Tablet t =(Tablet)ts.get(i);
				r=r+t.iD+","+t.company+","+t.m;
			}
		}
		
		r=r+"..Thank you "+_n+" Store";
		return r;
		
		
	}
	
	
	
	

}
