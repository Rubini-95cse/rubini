package rubi1;
import java.util.*;
public class Nextlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=sc.nextInt();
     }
     for(int i=1;i<n;i++){
    	 for(int j=i+1;j<n;j++){
    		 if(a[i]<a[j]){
    			 a[i]=a[j];
    		 }
    	 }
    	 System.out.print(a[i]+",");
     }
     System.out.print("0");
	}

}
