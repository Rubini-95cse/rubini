package rubi;

import java.util.Scanner;

public class hcflcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp1,temp2;
		int gcd,t,lcm;
		  temp1 = a;
	        temp2 = b;

	        while (temp2 != 0) {
	            t = temp2;
	            temp2 = temp1 % temp2;
	            temp1 = t;
	        }

	        gcd = temp1;
	        System.out.println("GCD = " + gcd);
	    }
	}
	

