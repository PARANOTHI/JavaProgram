package Basics;

public class InstanceVariable {
	 static int insvar=25;
	public static void main(String[] args) {
		Variables ob1=new Variables();
		Variables ob2=new Variables();
		System.out.println(ob1.insvar);
		System.out.println(ob2.insvar);
		ob1.insvar=50;
		System.out.println(ob1.insvar);
		System.out.println(ob2.insvar);

	}

}
