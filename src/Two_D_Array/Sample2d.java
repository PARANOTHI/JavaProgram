package Two_D_Array;
import java.util.*;

public class Sample2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
//		System.out.println("Row Size:"+arr.length);
//		System.out.println("Column Size:"+arr[0].length);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println((i+1)+" Row sum= "+sum);
		}
		System.out.println();
		

	

	}

}
