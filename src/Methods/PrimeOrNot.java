package Methods;
import java.util.*;
public class PrimeOrNot {
	boolean primeNot(int n){
		int count=0;
		if(n<=1) {
			return false;
		}
			for(int i=1;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					count++;
				}
			}
		if(count==1) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrimeOrNot p=new PrimeOrNot();
		int a=sc.nextInt();
		System.out.println((p.primeNot(a))?a+" Prime Number":a+" Not Prime");
		int b=sc.nextInt();
		System.out.println((p.primeNot(b))?b+" Prime Number":b+" Not Prime");
		int c=sc.nextInt();
		System.out.println((p.primeNot(c))?c+" Prime Number":c+" Not Prime");
		

	}

}
