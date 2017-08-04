package rubi;

import java.util.Scanner;

public class Encode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string1=sc.next();
		String string2=sc.next();
		String res="";
		char[] ch=string1.toCharArray();
		for(int i=0;i<ch.length;i++){
			ch[i]=(char) (ch[i]+10);
			if(ch[i]>122){
				ch[i]=(char)(ch[i]-26);
			}
			System.out.print(ch[i]);
		}
		char[] ch2=string2.toCharArray();
		for(int i=0;i<string2.length();i++){
			if(i!=0&&i!=(string2.length()-1)){
				ch2[i]=(char)(ch2[i]+10);
			}
			if(ch2[i]>122){
				ch2[i]=(char)(ch2[i]-26);
			}
			ch2[1]=ch2[0];
			res+=ch2[i];
		}
		System.out.println(" "+res);

	}

}
