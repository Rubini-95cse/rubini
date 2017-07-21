package rubi;

import java.util.Scanner;

public class CelFaren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       float b=9/5f;
       int faren=(int)((a*b)+32);
       System.out.println(faren);
	}

}
