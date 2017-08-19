package rubi1;
import java.util.*;
public class Encrypt {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char []ch = str.toCharArray();
		for(int i = 0 ; i < str.length()-1; i++ ) {
			if(ch[i]=='a'){
				System.out.print('z');
			}
			if(ch[i] > 'a'&& ch[i] <='z'){	
             System.out.print((char)(ch[i]-1));
			}
		}
		System.out.print(ch[str.length()-1]);
	}

}
