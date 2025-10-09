package Basics;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		System.out.print("Enter a float:");
		float fl=sc.nextFloat();
		System.out.print("Enter a char:");
		char ch=sc.next().charAt(0);
		System.out.print("Enter a byte:");
		byte by=sc.nextByte();
		System.out.print("Enter a long:");
		long lo=sc.nextLong();
		System.out.print("Enter a double:");
		double dou=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter a string:");
		String st=sc.nextLine();
		System.out.println("Number :"+num);
		System.out.println("FLoat :"+fl);
		System.out.println("character :"+ch);
		System.out.println("Byte :"+by);
		System.out.println("Long :"+lo);
		System.out.println("Double :"+dou);
		System.out.println("String :"+st);
	}

}
