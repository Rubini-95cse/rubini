package rubi1;
import java.util.*;
public class ReverseremoveVowels {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str).reverse();
		String ss =  sb.toString();
		//System.out.println(ss);
		String vowels=ss.replaceAll("[aeiouAeiou]","");
		System.out.println(vowels);
	}

}
