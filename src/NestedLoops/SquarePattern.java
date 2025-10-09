package NestedLoops;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int st=i;
			for(int j=1;j<=i;j++) {
				//System.out.print(st+" ");
				//st=st+n-j;
				System.out.print(st+" ");
				st=st+n-j;
			}System.out.println();
		}
	}

}
//i
//1	i+4
//2 6 i+3
//3 7 10 i+2
//4 8 11 13 i+1
//5 9 12 14 15 

