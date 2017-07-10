package rubi;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i,count=1;
		for(i=0;i<a.length();i++){
			if(Character.isSpaceChar(a.charAt(i))){
				count++;
			}
		}
       System.out.println(count);
	}
}