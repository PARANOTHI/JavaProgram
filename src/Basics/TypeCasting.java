package Basics;
public class TypeCasting {
	public static void main(String []args) {
		// implicit type casting -> low to high datatype
		char ch='A';
		char ch1='a';
		System.out.println("Convert cap-> "+ch+" -> small :"+(char)(ch+32));
		System.out.println("Convert small-> "+ch1+" ->to cap :"+(char)(ch1-32));
		int val=(int)'0';
		int op=ch;
		System.out.println("ASCII VALUES");
		System.out.println("Zero : "+val);
		System.out.println("caps A : "+op);
		System.out.println("Space : "+(int)' ');
		System.out.println("Small a :"+(int)'a');
		
		System.out.println();
		
		//Explicit type casting -> high to low
		
		float fl=23.44f;
		int f2=(int)fl;
		System.out.println(f2);
		System.out.println((int)fl);
		
		System.out.println();
		
		byte num1=25;
		byte num2=50;
		byte res=(byte)(num1+num2); 
//if we normally do the addition it will be a integer value so here we can typecaste that addition value as a byte value 
		System.out.println(res);
		
	}
}
