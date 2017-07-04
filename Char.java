package rubi;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		String a=sc.nextLine();
		for(i=0;i<a.length();i++){
		   if(Character.isAlphabetic(a.charAt(i))){
			   count++;
		   }
		}
		System.out.println(count);
	}

}
