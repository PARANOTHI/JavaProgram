package ArrayConcepts;
import java.util.*;
public class NumDiv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		System.out.print("Enter the div number you check: ");
		int a=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Array Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%a==0) {
				count++;
				System.out.println("Num Div By "+a+" : "+arr[i]);
			}
		}
		System.out.println("Count :"+count);
	}

}
