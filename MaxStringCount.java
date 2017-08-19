package rubi1;
import java.util.*;
public class MaxStringCount {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		String str1[]=new String[n];
		for(int i=0;i<str1.length;i++){
			str1[i] = sc.next();
		}
		int num = sc.nextInt();
		for(int i=0;i<str1.length;i++){
			if(str1[i].length()==num){
			count++;
			}
		}
	System.out.println(count);
	}

}
