package rubi1;
import java.util.*;
public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to delete");
		int num = sc.nextInt();
		for(int i=0;i<n-1;i++){
		if(a[i] != num){
		System.out.print(a[i]+",");	
		}
		}
		System.out.print(a[n-1]);
	}

}
