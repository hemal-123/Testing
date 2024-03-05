package Junit;


import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test; 
	


public class Assert {
         
	@Test
	public void run() {
		int a=12,b=13 ;
		assertEquals(a,b);
		int a1[]= {1,2,3};
		int b1[]= {1,2,3,4};
		assertArrayEquals(a1,b1);
		
	
	}

}
