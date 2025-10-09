package NestedLoops;
import java.util.*;

public class Prime_Between_Range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++) {
			int count=0;
			for( int j=2;j<i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
			}
	}}

}
