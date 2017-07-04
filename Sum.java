package rubi;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=sc.nextInt(); 
        System.out.println("Enter the number");
        int b=sc.nextInt();
		for(int i=a;i<=b;i++){
		sum+=i;
		}
        System.out.println("The sum is:"+sum);

	}

}
