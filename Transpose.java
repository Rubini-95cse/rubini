package rubi;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a=sc.nextInt();
		System.out.println("Enter the number of columns");
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr[i][j]=sc.nextInt();
				System.out.print(" ");
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr[i][j]+" ");
			}
				System.out.println(" ");
		}
		System.out.println();
		for(int i=0;i<b;i++){
			for(int j=0;j<a;j++){
				System.out.print(arr[j][i]+" ");
			}
				System.out.println(" ");
		}
	}

}
