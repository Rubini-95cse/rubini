package rubi1;

import java.util.*;

public class StringNumeric {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int count = 0;
		for(int i = 0 ;i < name.length() ; i++) {
		//if(name.charAt(i) == '1'  ||name.charAt(i) == '2'  ||name.charAt(i) == '3'  ||name.charAt(i) == '4'  ||name.charAt(i) == '5'  ||name.charAt(i) == '6'  ||name.charAt(i) == '7'  ||name.charAt(i) == '8'  ||name.charAt(i) == '9'  ||name.charAt(i) == 'e'||name.charAt(i) =='.' ){
				if(Character.isDigit(name.charAt(i))) {
				count++;
			}
			else{
				count = 0;
				
			}
			
		}
			if(count > 0){
           System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
	}
