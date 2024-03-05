package Javaassignment;



public class Customewithdrawamountexpation {

	public static void main(String args[]) throws  InsufficientAccountExcepation {
		int balance=4500;
		int withdrawAmount=3500;
		if(withdrawAmount> balance) {
		throw  new  ("Sorry, insufficient balance.You need more 1000 rs to perform this transaction");
		}
		else 
		{
			balance = balance- withdrawAmount;
			System.out.println("withdraw sucessful");
		}
		
	}
	
	}


