package rubi;

import java.util.Scanner;

public class oddinter {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=sc.nextInt(); 
        System.out.println("Enter the number");
        int b=sc.nextInt();
        for(i=a;i<=b;i++){
        	if(i%2!=0){
        	 System.out.println("Odd number: "+i);
        	}
        }
	}

}
