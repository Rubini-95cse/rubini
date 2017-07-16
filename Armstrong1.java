package rubi;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		int a1;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range");
    int range=sc.nextInt();
  int a=1;
   while(a<=range)
   {
	   a1=a;
	   int sum=0;
    while(a1>0)
    {
    	int r=a1%10;
    	sum=sum+(r*r*r);
       a1=a1/10;
    }
    if(sum==a){
    	System.out.println(a);
    }
    	a++;
   }
	}
}
