package Javaassignment;

public class ImplementingRunnableinterface {
class A
{
	
		public void run() {
			for(int i=1;i<=5;i++) ;
			{
				System.out.println("My Child Thread");
				
			
		}
	}
}
	
class B
{
	public static void main(String[] args) {
		
		
		Thread t=new Thread();
		t.start();
		
		for(int i=1;i<=5;i++) ;
		{
			System.out.println("Main Thread");
		}
	}
}

						
						
						
					
			
		
		
	
	









