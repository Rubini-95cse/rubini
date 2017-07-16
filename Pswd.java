package rubi;

import java.util.Scanner;

public class Pswd {
	public static void main(String[] args) {
		int sum=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username");
		String a=sc.next();
		int len=a.length();
		for(int i=0;i<len;i++){
			b=(int)a.charAt(i);
			sum+=b;
		}
	
		sum=sum/len;
		System.out.println((char)sum);
	}

}
