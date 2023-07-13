/*Pratham Asaigoli*/
/*Selection Sorting*/
package daaLab;
import java.util.Random;
import java.util.Scanner;



public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size of the array");
		size = user.nextInt();
		int  array [] = new int[size];
		Random random = new Random();
		System.out.println("Populating array with random numbers");
		for(i=0;i<size;i++)
		{
			array[i] = random.nextInt();
		}
		System.out.println("Original array is ");
		for(i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		long startTime= System.currentTimeMillis();
		selectionsort(array);
		long endTime=System.currentTimeMillis();
		long executionTime = endTime-startTime;
		System.out.println("Sorted array is ");
		for(i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Execution time is " + executionTime);
	}
	
	private static void selectionsort(int arra[]) {
		int n=arra.length;
		for(int i=0;i<n;i++)
		{
			int minIndex = i;
			for(int j=i+1;j<n;j++)
			{
				if(j<i)
				{
					i=j;
				}
				int  temp = arra[minIndex];
				arra[minIndex]=arra[i];
				arra[i]=temp;
				
			}
		}
	}

}
