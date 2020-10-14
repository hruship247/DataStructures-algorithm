package algorithm;

import java.util.Scanner;

public class Merge_sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("New change in alpha");
		System.out.println("Before sorting");
		print(a);
		a= merge(a);
		System.out.println("After sorting");
		print(a);
		sc.close();
		
	}
	
	static void print(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	static int[] merge(int[] a)
	{
		if(a.length<=1)
		{
			return a;
		}
		int mid= a.length/2;
		
		int[] left= new int[mid];
		int[] right;
		if(a.length%2==0)
		{
			
			right= new int[mid];
			
		}
		else
		{
			
			right= new int[mid+1];
			
		}
		for(int i=0; i<mid; i++)
		{
			left[i]= a[i];
		}
		for(int j=0; j<right.length; j++)
		{
			right[j]= a[mid+j];
		}

		int[] result= new int[a.length];
		
		left= merge(left);
		right= merge(right);
		result= mergeSort(left,right);
		return result;
	}
	
	static int[] mergeSort(int[] left, int[] right)
	{
		int[] res= new int[left.length+ right.length];
		int i=0, j=0, k=0;
		while(i<left.length || j<right.length)
		{
			if(i<left.length && j<right.length)
			{
				if(left[i]<right[j])
				{
					res[k++]= left[i++];
				}
				else
				{
					res[k++]= right[j++];
				}
			}
			else if(i<left.length)
			{
				res[k++]= left[i++];
			}
			else if(j<right.length)
			{
				res[k++]= right[j++];
			}
		}
		return res;
	}
	
}
