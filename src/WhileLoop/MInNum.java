package WhileLoop;

import java.util.Scanner;

public class MInNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=n%10; //256 ->6
		while(n>0) {
			int rem=n%10;
			if(min>rem) {
				min=n%10;
			}
			n/=10;
			
		}
		System.out.println("Minnumber is :"+min);

	}

}
