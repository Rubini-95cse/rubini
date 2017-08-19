package rubi1;
import java.util.*;
public class WorkingDay {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String str1[] = new String[str.length()];
		//for(int i = 0 ; i < str.length() ; i++) {
			if(str.equals("Monday") || str.equals("Tuesday") || str.equals("Wednesday") || str.equals("Thursday") || str.equals("Friday")){
				System.out.println("true");
		}
			else{
				System.out.println("false");
			}
		
	}

}
