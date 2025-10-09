package WhileLoop;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(); //153
		int sum=0;
		int temp=n;
		int Digit=String.valueOf(n).length(); //3
		System.out.println(Digit);
		while(n!=0) {// 153 ->15 ->1 ->0
			int digits=n%10; //3 ->
			sum+=Math.pow(digits,Digit); //3^3
			n/=10; //15
		}
		System.out.println(sum);
		System.out.print((temp==sum)?temp+" is Armstrong":temp+" is not a Armstrong");
		
	}

}
