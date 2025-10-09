package ConditionalStatements;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%3==0 && a%5==0) {
			System.out.println("Fizz Buzz");
		}
		else if(a%5==0) {
			System.out.println("Buzz");
		}
		else if(a%3==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
