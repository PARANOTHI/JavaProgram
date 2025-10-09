package Basics;

/*Variables are used to refer a memory address 
 * there are two types in java,
 
 * 1)Local Variables -> it is created inside a method and it will scope inside that method only
 * 2)Global Variables or Instance Variables -> it's created inside a class but outside a methods its used anywhere in the program*/

public class Variables {
	int insvar=25;  // it's instance variables or global variable
	void meth() {
		int locvar=62;  // it's local variables
		System.out.println(locvar);
		System.out.println(insvar);
	}
	void disp() {
		System.out.println(insvar);
		//System.out.println(locvar); here it shown an error because locvar only accessed by meth method only 
	}
	public static void main(String[] args) {
		Variables ob1=new Variables();
		System.out.println(ob1);
		Variables ob2=new Variables();
		System.out.println(ob2);
		ob1.meth();
		ob2.disp();
	}

}
