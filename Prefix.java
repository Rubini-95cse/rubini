package rubi1;
import java.util.*;
public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    String a[] = new String[n];
    for(int i = 0 ; i < n ; i++){
    	a[i]=sc.next();
    }
    for(int i = 0 ; i < n ; i++){
    	if(a[i].length() > 2){
    	if((a[i].charAt(0)== '0' && a[i].charAt(1)== '1') || (a[i].charAt(0)== '1' && a[i].charAt(1)== '0')){
    		count++;
    	}
    }
    }
    if(count > 0){
    	System.out.println(count);
    }
    sc.close();
    }
	}

