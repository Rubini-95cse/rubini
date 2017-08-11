package rubi1;
import java.util.*;
public class Currency {
 public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int rupees=sc.nextInt();
int arr[]=new int[10];
	arr[0]=rupees/500;
	rupees%=500;
	arr[1]=rupees/100;
	rupees%=100;
	arr[2]=rupees/50;
	rupees%=50;
	arr[3]=rupees/10;
	rupees%=10;
	arr[4]=rupees/1;
	rupees%=1;
	System.out.print("count : ");
	System.out.print(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
}
 }

