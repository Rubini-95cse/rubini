package rubi;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int sum=0;
		int a,a1;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
    a=sc.nextInt(); 
    a1=a;
    while(a>0){
    int r=a%10;
    sum=sum+(r*r*r);
   a=a/10;
    }
	if(sum==a1)
	System.out.println("Armstrong");
}
}
