package com.orange.mobileShope;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ShopeTest {
	
    @Test
	public void testReport() {
		Shope shope = new Shope(1,"Dearm2000","gisr elswise","cairo","0220","0122333","03333");
		shope.new_item(1, 1, "LG", "Nexus5", 5, 2, 4);
		shope.new_item(2, 2, "OPPO", "F11", 10, 4, 8);
		
		String report = shope.report();
		
		String result = "Total=2,Mobiles List:1,LG,Nexus5,Tablets List:2,OPPO,F11..Thank you Dearm2000 Store";
		
		Assert.assertEquals(result, report);
		
		
		
	}
}
