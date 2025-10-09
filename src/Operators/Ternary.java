package Operators;
import java.util.Scanner;
public class Ternary {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		String res=(mark>=0 && mark<=100)?((mark>49)?"pass":"fail"):"Invalid Mark";
		//System.out.println((mark>49)?"pass":"fail");
		System.out.println(res);
	}

}
