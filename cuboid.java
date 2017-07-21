package rubi;

import java.util.Scanner;

public class cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       int b=sc.nextInt();
       int h=sc.nextInt();
     //  System.out.print(l+"   "+b+"   "+h);
       int tsa=2*((l*b)+(b*h)+(h*l));
       int volume=l*b*h;
       System.out.println();
       System.out.print(tsa+" "+volume);
	}

}
