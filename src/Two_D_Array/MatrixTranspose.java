package Two_D_Array;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		//int temp[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				temp[i][j]=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp[i][j];
//				
//			}
//		}
		System.out.println("Transpose Matrix:");
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i][j]+" ");
		// TODO Auto-generated method stub
			}
			System.out.println();
			}
	}

}
