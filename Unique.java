package rubi;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     int flag=0,count=0;
    for(int i=0;i<n;i++){
    	 a[i]=sc.nextInt();
     }
        System.out.print("Result : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        count = 1;
                    }
                    else
                    {
                        count = 0;
                        break;
                    }
                }
            }
            if(count == 1)
            {
                System.out.print(a[i]+" ");
            }
        }
       
	}
}

