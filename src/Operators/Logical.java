package Operators;

public class Logical {
	// there are three operator
	
/* 
	 

	  *  and - && -> any one of the ip is false op will be false
	  *  or - ||   -> any one of the ip is true op will be true
	  *  not -!		-> ip is true then op will be false
*/
	
	//Boolean values are applicable i.e true or false
	
	//precedence is not,and,or
	public static void main(String[] args) {
		int num=10;
		System.out.println(num++>10 && ++num<10);
		System.out.println(num);
		int num1=11;
		System.out.println(num1++>10 && num1++<10);
		System.out.println(num1);
		int num2=10;
		System.out.println(++num2>10 && ++num2<10);
		System.out.println(num2);
		int num3=10;
		System.out.println(++num3>10 && num3++<10);
		System.out.println(num3);
	}
}
