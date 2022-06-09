package may14;

import java.util.Scanner;

public class Blockswap {
		public static void swap(int arr[], int a , int b , int r)
		{
			for(int i=0; i<r;i++)
			{ 
				int temp=arr[a+1];
				arr[a+1]=arr[b+i];
				arr[b+i]=temp;
			   }			
			}
	
		
		public static void swapRotate(int arr[], int r )
		{ 
			int n= arr.length;
			
			
			if(r==0 ||r==n)
			return;
			 
			int i =r;
			int j =n-r;
			while(i!=j);
			{
				if (i<j)
				{
					swap(arr, r=1,r+j-i, i);
					j=j-i;
				}
				
				else
				{
					swap(arr,r-i,r,i);
					i=i-j;
					
				}
			}
			swap(arr, r-1,r,i);
		}

		public static void main(String[] args) {
			Scanner in =new Scanner(System.in);
	        System.out.println("enter the size of array:");
	        int n = in.nextInt();
	        int [] arr = new int[n];
	        System.out.println("enter elements of array");
	        for(int i =0;i<n; i++)
	        arr[i]=in.nextInt();
	        System.out.println("enter number of rotations");
	        int no_of_R = in.nextInt();
	        swapRotate(arr,no_of_R);
	        System.out.println("array elements after rotation");
	        for(int i =0; i<n; i++)
	        
	        {
	        	System.out.println(arr[i]+ "");
	        	
	        	
	        }

		}

	}
