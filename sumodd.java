package rubi;

public class sumodd {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=1;i<=15;i++){
		sum+=i;
		}
        System.out.println("The sum of 1 to 15 is:"+sum);
	for(int j=15;j<=45;j++){
		if(j%2!=0){
			sum+=j;
		}
	}
		System.out.println("The sum of odd numbers in limit is: "+sum);
	}

	}

