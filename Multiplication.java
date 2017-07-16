package rubi;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			int a=i*n;
			System.out.println(i+" * "+n+" = "+a);
		}
	}

}
