package WhileLoop;
import java.util.*;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0; // for sum
		int rem=0;
		int rev=0; // for rev
		int temp=n; //for reverse
		while(n!=0) {
			rem=n%10;
			//rev=rev*10+rem; // for reverse
			sum=sum+rem; //for sum
			n/=10;
		}
		//System.out.println(rev);
		System.out.println(sum);
		

	}

}
