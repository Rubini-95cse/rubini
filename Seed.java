package rubi;

import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		int mul=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int y=sc.nextInt();
		int x=a;
		
       while(x>0){
    	   int a1=x%10;
    	   mul+=a1;
    	   x=x/10;
       }
       int b=a*mul;
       if(b==y){
    	   System.out.println(b+" is a seed of "+a);
       }
       else{
    	   System.out.println(b+" is not a seed of "+a);
       }
	}

}
