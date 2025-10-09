package Basics;
public class StaticVariables {
	int num=1;  //instance
	static int num1=1;  //static refers unique memory for entire class
	void disp() {
		num1++;
		num++;
		System.out.println("Ins " +num);
		System.out.println("Static "+num1);
	}
	public static void main(String[] args) {
		StaticVariables s1=new StaticVariables();
		StaticVariables s2=new StaticVariables();
		StaticVariables s3=new StaticVariables();
		s1.disp();
		s2.disp();
		s3.disp();
	}}