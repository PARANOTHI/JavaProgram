package WhileLoop;
import java.util.*;

public class MaxDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=n%10;
		while(n>0) {
			int rem=n%10;
			if(max<rem) {
				max=n%10;
			}
			n/=10;
			
		}
		System.out.println("Maxnumber is :"+max);

	}

}
