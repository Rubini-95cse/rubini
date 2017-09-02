package guvi;
import java.util.*;
public class Recurssion {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	for(int i = 0 ; i < str.length()-1 ; i++  ) {
		if((str.charAt(i))==(str.charAt(i+1))) { 
			String start = str.substring(0,(i+1));
			String back = str.substring(i+1);
			str = start+"*"+back;
		}
	}
	System.out.println(str);
}
}
