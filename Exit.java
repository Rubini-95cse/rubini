package rubi;

import java.util.Scanner;

public class Exit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='Q'){
			System.exit(0);
		}
		else{
			System.out.println("Program does not exit");
		}

	}

}
