package ConditionalStatements;
import java.util.*;

public class FizzBUzzSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(((n%3==0)?1:0) + ((n%5==0)?2:0)) {
		case 3:{
			System.out.println("Fizz Buzz");
			break;
		}
		case 1:{
			System.out.println("Fizz");
			break;
		}
		case 2:{
			System.out.println("Buzz");
			break;
		}
		default:{
			System.out.println("Invalid input");
		}
		
		}
		// TODO Auto-generated method stub

	}

}
