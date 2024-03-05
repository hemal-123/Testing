package Grouptext;

import org.testng.annotations.Test;

public class Payment {

	
		@Test
		public void upi() {
			System.out.println("upi");
			
		}
		@Test
		public void cod() {
			System.out.println("cod");
			
		}
		@Test(groups="purchase")
		public void creditCard() {
			System.out.println("credit card");
	}

}
