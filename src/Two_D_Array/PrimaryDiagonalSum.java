package Two_D_Array;
import java.util.Scanner;

public class PrimaryDiagonalSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int secdisum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i][i];
			secdisum+=arr[i][n-1-i];
		}
		System.out.println("Primary Diagonal Sum: "+sum);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j)) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Secondary Diagonal Sum: "+secdisum);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("Both Diagonal: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i+j==n-1) {
					System.out.print(arr[i][j]+"  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("Matrix Transpose:");
		for(int i=0;i>n;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(arr[i][j]+" ");
		
	}
			System.out.println();

}
		}}
