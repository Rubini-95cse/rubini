package rubi;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
         int a=sc.nextInt();
         int b=a/2;
         for(int i=2;i<b;i++){
        	 if(a%2==0){
        		 flag=1;
        	 }
        	 System.out.println("Not a Prime");
         } 
        	if(flag==0){
        		 System.out.println("Prime");
        	 }
         }
	}


