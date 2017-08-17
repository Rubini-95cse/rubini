package self;
import java.util.*;
public class OddCube {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++){
			if(i%2==0){
			sum += Math.pow(arr[i],3);
			}
			else{
				sum += Math.pow(arr[i],2);
			}
		}
		System.out.println(sum);
	}
}
