package rubi;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
          if(a[i]==i){
        	  System.out.println("The number "+a[i]+" is equal to its index "+i);
          }
          
	   }
	}
}
