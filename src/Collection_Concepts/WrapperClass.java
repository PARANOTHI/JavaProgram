package Collection_Concepts;

public class WrapperClass {

	public static void main(String[] args) {
		//AutoBoxing 
		int num=10225;
		Integer nu=Integer.valueOf(num);
		Integer n=num;
		
		//Unboxing
		Integer no=2564;
		int op=no.intValue();
		int o=no;
		
		//Non Premitive to Non Premitive
		
		//Integer to String
		int num1=10225;
		String nu1=String.valueOf(num1);
		
		//String to Integer
		String st="10225";
		Integer res=Integer.parseInt(st);
	}

}
