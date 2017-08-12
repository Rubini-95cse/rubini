package rubi1;
import java.util.*;
public class Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a[] = new int[5];
      int b[] = new int[5];
      for(int i = 0 ; i < a.length ; i++){
    	  a[i] = sc.nextInt();
      }
      for(int i = 0 ; i < a.length-1 ; i++){
    	  b[i] = Math.abs(a[i+1]-a[i]);
    	
    	  }
      Arrays.sort(b);
      System.out.println(b[a.length-1]);
    	  }
	}

