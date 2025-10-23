package Sorting;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {22,45,11,66,22,7,3,6,99};
		int n=arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("\nStep by Step Swap:");
		// here we i start from 0 and j start from i+1 
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("\nFinal Sorted Array:");
		System.out.print(Arrays.toString(arr));
		

	}

}
