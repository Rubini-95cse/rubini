package rubi1;

import java.util.Scanner;

public class ReduceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     String sentence = sc.nextLine();
	     String result = sentence.replaceAll("\\s+", " ");
	     System.out.println(result);
	}

}
