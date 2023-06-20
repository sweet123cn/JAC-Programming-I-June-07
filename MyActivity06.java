package package_June07;

public class MyActivity06 {
	
	static void starMethod1() {
		for (int i = 1; i <= 6 ; i++) 
		{
			System.out.print("* ");
		}
	  }
	
	static void starMethod2() {
		for (int i = 1; i <= 5 ; i++) 
		{
			System.out.print(" *");
		}
		System.out.print("  ");
	  }
	
	static void equalMethod1() {
		for (int i = 1; i <= 34 ; i++) 
		{
			System.out.print("=");
		}
	  }
	
	static void equalMethod2() {
		for (int i = 1; i <= 46 ; i++) 
		{
			System.out.print("=");
		}
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4 ; i++) 
		{
			starMethod1();
			equalMethod1();
			System.out.println();
			starMethod2();
			equalMethod1();
			System.out.println();
			
		}
		
		starMethod1();
		equalMethod1();
		System.out.println();
		
		for (int i = 1; i <= 6 ; i++) 
		{
			equalMethod2();
			System.out.println();		
		}
		
		
	}

}
