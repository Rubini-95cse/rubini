package rubi;

import java.util.Scanner;

public class palindromeo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=sc.nextInt();
        int a1=a;
        int rev=0;
        while(a>0){
        	int b=a%10;
        	rev=(rev*10)+b;
        	a=a/10;
        }
        if(rev==a1){
        	System.out.println("Palindrome number");
        }
        else{
        	System.out.println("Not a Palindrome number");
        }
        }
	}

