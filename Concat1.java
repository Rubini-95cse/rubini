package rubi;

import java.util.Scanner;

public class Concat1 {

	public static void main(String[] args) {
		int temp=0;
		int b=0;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("An input array:");
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    	for(int j=i+1;j<n;j++){
    		if(a[i]<a[j]){
    			temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
    }
    for(int i=0;i<n;i++){
    b=b*10+a[i];
    }
	System.out.println("result: "+b);
	System.out.print("order of #'s: ");
	for(int i=0;i<n-1;i++){	
    System.out.print(a[i]+",");
	}
	 System.out.println(a[n-1]);
	}
}
