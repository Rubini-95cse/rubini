package rubi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     for(int i=n;i>0;i--){
    	 fact=fact*i;
     }
     System.out.println(fact);
	}

}
