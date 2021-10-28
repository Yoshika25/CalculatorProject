package functiontest;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//calculator
		//add
		//subtract
		//multiply
		//divide
		//two variable
		//user interaction		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no");
		double a=sc.nextDouble();
		System.out.println("Enter the second2 no");
		double b=sc.nextDouble();
		
		//access startfunction class
		Startfunction sf=new Startfunction();
		System.out.println("Sum is:" +sf.add(a, b));		
		System.out.println("substraction is:" +sf.sub(a, b));
		System.out.println("Multiply is:" +sf.mul(a, b));
		System.out.println("Divide is:" +sf.div(a, b));
		
		
		
	}

}
