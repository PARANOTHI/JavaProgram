package Two_D_Array;
import java.util.Scanner;

public class EvenNumber {

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
			for(int j=0;j<n;j++) {
				if(arr[i][j]%2!=0) {
					System.out.print("  ");
				}
				else{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
