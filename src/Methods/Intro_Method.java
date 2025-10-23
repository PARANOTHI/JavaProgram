package Methods;
import java.util.Scanner;

public class Intro_Method {
	//Method declaration or definition part
	void kavin() {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println("Result= "+res);System.out.println();
	
	}
	public static void main(String[] args) {
		Intro_Method ob1=new Intro_Method();
		//Method Calling Part
		System.out.println("Meth Calling 1");
		ob1.kavin();
		System.out.println("Method Return 1");
		System.out.println("Meth Calling 2");
		ob1.kavin();
		System.out.println("Method Return 2");
		System.out.println("Meth Calling 3");
		ob1.kavin();
		System.out.println("Method Return 3");
		
	}

}
