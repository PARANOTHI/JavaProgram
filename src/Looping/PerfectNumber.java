package Looping;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int i=1;
		for( i=1;i<=a/2;i++) {
			if(a%i==0) {
				System.out.println(i+" ");
				sum+=i;
			}
			
		}
		System.out.println("Sum of Factors: "+a+"\n");
		System.out.println((a==sum)?a+" is perfect number":a+" is not a perfect number");
	

	}

}
