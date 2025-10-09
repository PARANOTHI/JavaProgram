package Basics;
public class Variables2 {

	String name;

	static String clg;

	void disp() {

		System.out.println(name+" "+clg);

	}

	public static void main(String[] args) {

		Variables2 s1=new Variables2();

		Variables2 s2=new Variables2();

		s1.name="Kabilan";

		clg="Vcet";

		s2.name="Harish";

		s1.disp();

		s2.disp();

	}

}