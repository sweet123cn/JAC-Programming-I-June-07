package package_June07;

import java.util.Scanner;

public class MyActivity05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbInput = new Scanner(System.in);
		
		System.out.println("Please input the integer a:");
		int a = kbInput.nextInt();
		
		System.out.println("Please input the integer b:");
		int b = kbInput.nextInt();
		
		System.out.println("Please input the integer c:");
		int c = kbInput.nextInt();
		
		System.out.println("the sum of a,b,c is " + (a+b+c));
		
		kbInput.close();
	}

}
