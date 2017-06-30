package rubi;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int temp=0;
	 int a=0;
	 int b=1;
	 for(int i=2;i<=c;i++){
		temp=b;
		b=a+b;
		a=temp;
	 System.out.println(a);
	 }
	}

}
