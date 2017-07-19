package rubi;

import java.util.Scanner;

public class RepeatedNo {

	public static void main(String[] args) {
	    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if(a[i]==a[j]){
        			count[i]='r';
        		}
        	}
        }
        for(int i=0;i<n;i++){
        if(count[i]=='r'){
        	System.out.println("Repeated numbers are : "+a[i]);
        }
	}
	}
}
