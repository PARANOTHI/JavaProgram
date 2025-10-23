package ArrayConcepts;
import java.util.*;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
			if(arr[i]<arr[min]) {
				min=i;
			}
		}
		System.out.println("Max Element: "+arr[max]);
		System.out.println("Min Element: "+arr[min]);
		// TODO Auto-generated method stub

	}

}
