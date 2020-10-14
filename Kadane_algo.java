package algorithm;

import java.util.Scanner;

public class Kadane_algo {
// find the max sum of a subarray in an array
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]= sc.nextInt();
		}
		int c= a[0], m= a[0];
		for(int i=1; i<n; i++)
		{
			c= Math.max(c+a[i], a[i]);
			m= Math.max(c, m);
		}
		System.out.println("The maximum sum possible among the subarray is "+m);
	}

}
//Changes made
//5
//4
//3
//2
//1
//-11
//The maximum sum possible among the subarray is 10