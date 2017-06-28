package rubi;

import java.util.Scanner;

public class primerange {

	public static void main(String[] args) {
		int flag=0;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
         int a=sc.nextInt();
         System.out.println("Enter the number");
         int b=sc.nextInt();
         for(i=a;i<b;i++){
        	 for(int j=a;j<i;j++){
        	 if(i%j==0){
        		 flag=0;
        		 break;
        	 }
        	 else{
        		 flag=1;
        	 }
        	}
        	 if(flag==1){
        		 System.out.println(i);
        	 }
        	}
         }
	}
	


