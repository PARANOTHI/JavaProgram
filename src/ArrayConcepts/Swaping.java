package ArrayConcepts;
import java.util.Arrays;

public class Swaping {

	public static void main(String[] args) {
		int arr[]= {25,99,15,46,78,93};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" : "+arr[i]);
		}
		//use for each loop 
		System.out.println("For Each Loop :");
		for(int n:arr) {
			System.out.println(n);
		}
		//Using Arrays.toString
		System.out.println(Arrays.toString(arr));

	}

}
