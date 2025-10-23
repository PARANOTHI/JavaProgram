package Two_D_Array;
import java.util.*;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter r X c mat 1:");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.print("Enter r X c mat 1:");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		if(c1!=r2) {
			System.out.println("Matrix Multiplication is not posibile");
		}
		System.out.println("Enter Elements for A");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements for B");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Final Matrix Multiplication:");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		
		// TODO Auto-generated method stub

	}
	}
}
