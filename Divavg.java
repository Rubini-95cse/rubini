package rubi;

import java.util.Scanner;

public class Divavg {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		float avg;
		float avg1;
		int count=0;
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int n1=n/2;

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		if(i>=n1){
		  	sum+=a[i];
		  	count++;
		}
		else{
			sum1+=a[i];
		}
		}
	//	System.out.println(count);
		int n2=n-count;
		//System.out.println(n2);
		avg=sum/count;
		avg1=sum1/n2;
	//	System.out.println(avg);
		if(avg==avg1){
			System.out.println("Possible");
		}
		else{
			System.out.println("Not Possible");
		}
	}

}
