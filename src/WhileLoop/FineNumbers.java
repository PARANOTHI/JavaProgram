package WhileLoop;

import java.util.Scanner;

public class FineNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int pro=1;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n/=10;
//			System.out.println((sum==pro)?"Fine number":"Not Fine Number");
		}
		System.out.println((sum==pro)?"Fine number":"Not Fine Number");
		// TODO Auto-generated method stub

	}

}
