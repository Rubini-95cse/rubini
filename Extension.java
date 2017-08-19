package rubi1;
import java.util.*;
public class Extension {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
		if(ch == '.'){
			System.out.println(input.substring(i+1));
		}
		}
	}

}
