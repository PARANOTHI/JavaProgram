package Two_D_Array;
import java.util.*;
public class Matrix_Addition_Substraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		System.out.println("Enter Matrix A: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Matrix B: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int d[][]=new int[r][c];
		int e[][]=new int[r][c];
	
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				d[i][j]=a[i][j]+b[i][j];
				e[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Final Addition:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Final Substraction:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
