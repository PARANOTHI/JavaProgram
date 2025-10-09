package Looping;
import java.util.*;
public class SumofFactors {
	
	// find a factor
	// find a count
	// then easy to find prime factor
	
	// check the note :
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1; //i=2
		int count=0;														//every digits sqrt has contains a factor
		for(;i<=a;i++) { //for(;i<a;i++) more reducing -> for(;i<a/2;i++) ->use for(;Math.sqrt(a);i++)
			if(a%i==0) {
				System.out.print(i+ " ");
				count=count+1; //or -> count++
			}
		}	System.out.println();
		System.out.println("count : "+count);
		System.out.println((count==2)?a+" Prime number":a+" Not a prime number");
	
		//here count==0.it will reduce the for loop time complexity 
		
		/*	if(count==2) { 
			System.out.println(a+"  is Prime number");
		}
		else {
			System.out.println(a+" not a prime a number");
		}
		*/// TODO Auto-generated method stub

	}

}
