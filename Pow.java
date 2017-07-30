package rubi;

import java.util.Scanner;

public class Pow {

	public static void main(String[] args) {
		int r=0;
		int a1;
		int r1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=String.valueOf(n).length();
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			a1=n%10;
			r=r*10+a1;
			n=n/10;
		}
	//	System.out.println(r);
		int i=0;
		int sum=0;
		for( i=0;i<len;i++){
			r1=r%10;
			a[i]+=r1;
			r=r/10;
			//System.out.println(a[i]);
		}
		for( i=0;i<len-1;i++){
			int pow=(int) Math.pow(a[i],a[i+1]);
			sum+=pow;
		//	System.out.print(sum+" ");
		}
		sum+=((int)Math.pow(a[len-1],0));
		System.out.print(sum+1);
}
}