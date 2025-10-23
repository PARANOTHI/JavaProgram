package Two_D_Array;
import java.util.Scanner;
public class SumOfRows {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[i][j];
			}
			System.out.println((i+1)+" Row sum ="+sum);
		}
		// TODO Auto-generated method stub

	}

}
