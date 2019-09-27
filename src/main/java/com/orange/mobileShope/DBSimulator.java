package com.orange.mobileShope;

import java.util.ArrayList;
import java.util.List;

public class DBSimulator {
	
	public static List<Mobile> mobiles=new ArrayList<Mobile>();
	public static List<Tablet> tablets=new ArrayList<Tablet>();
	public static int size=0;
	public static void addMobile(Mobile m) {
		mobiles.add(m);
		size++;
	}
	
	public static void addTablet(Tablet m) {
		tablets.add(m);
		size++;
	}
	
	public static List<Mobile> getMobiles(){
		
		return mobiles;
	}
	
public static List<Tablet> getTablets(){
		
		return tablets;
	}

public static int getSize() {
	return size;
}




}
