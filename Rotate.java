package rubi1;

import java.util.Scanner;

public class Rotate {
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	int size = sc.nextInt();
	int a[] = new int[size];
	int b[] = new int[size];
	System.out.println("Enter the elements");
	for(int i = 0 ; i < size ; i++) {
	a[i]=sc.nextInt();
	}
	System.out.println("Enter the number of times to rotate");
	int num=sc.nextInt();
	for(int i = size-num ; i < size ; i++) {
		b[i]=a[i];
		System.out.println(b[i]);
	}
	for(int i=0;i<size-num;i++){
		b[i]=a[i];
		System.out.println(b[i]);
	}
	sc.close();
}
}
