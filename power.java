package rubi;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 System.out.println("Enter the number");
	 int b=sc.nextInt();
	 int c=(int) Math.pow(a,b);
	 System.out.println(c);
	}

}
