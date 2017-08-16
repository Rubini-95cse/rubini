package rubi1;
import java.util.*;
public class ReverseUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       StringBuffer buf = new StringBuffer();
       String[] str1 = str.split("\\s");
       for(int i=0;i<str1.length;i++){
       String sb = new StringBuffer(str1[i]).reverse().toString();
      sb = Character.toUpperCase(sb.charAt(0))+sb.substring(1) ;
      buf.append(sb).append(" ");
   // System.out.println(buf);
	   }
      System.out.println(buf.toString());
	}
}
