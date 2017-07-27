package rubi;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int b=sc.nextInt();
	int r=sc.nextInt();
	int base=sc.nextInt();
	int h=sc.nextInt();
	area(l,b,r,base,h);
	}
	static void area(int l,int b,int r,int base,int h){
	int rect=l*b;
	System.out.println("Area of rectangle is : "+rect);
	float triangle=0.5f*base*h;
	System.out.println("Area of triangle is : "+triangle);
	float circle=3.14f*r*r;
	System.out.println("Area of circle is : "+circle);
		
	}

}
