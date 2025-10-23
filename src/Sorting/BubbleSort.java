package Sorting;
import java.util.Arrays;

 
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {25,99,15,46,78,93};
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
