package WhileLoop;

import java.util.Scanner;

public class NumRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int rev=0; 
		int temp=n; //for reverse
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem; // for reverse
			n/=10;
		}
		System.out.println(rev);

	}

}
