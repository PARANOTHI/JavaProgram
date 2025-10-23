package ArrayConcepts;

import java.util.Scanner;

public class RuntimeInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int len=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			len++;
		}
		System.out.println("Length of array: "+len);
		System.out.println("ARRAY:");
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		System.out.println((float)sum/n);

	}

}
