package rubi;

import java.util.Scanner;

public class Alphano {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,ch=0,num=0,alpha=0;
	String a=sc.nextLine();
    for(i=0;i<a.length();i++){
    	if(Character.isDigit(a.charAt(i))){
    		num++;
    		
    	}
    	else if(Character.isAlphabetic(a.charAt(i))){
    		ch++;
    		
    	}
    	else{
    		alpha++;
    	}
    	}
    	System.out.println(num);
    	System.out.println(ch);
    	System.out.println(alpha);
	}
}
