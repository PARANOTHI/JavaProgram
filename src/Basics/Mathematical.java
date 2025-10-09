package Basics;
public class Mathematical {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 7)); //byte (2^7)
		System.out.println(Math.pow(2, 15));  // short
		System.out.println((int)Math.pow(2, 31)); //int,float
		System.out.println((long)Math.pow(2, 61)); //long,double
		System.out.println(Math.ceil(2.3)); //it will roundoff the value even if its less than 2.5
		System.out.println(Math.floor(2.3)); //it will does not consider the after points number 2.3 
		System.out.println(Math.round(2.33)); //it will roundoff the value
		System.out.println(Math.sqrt(20)); //it is used to find out the square root of the value
		System.out.println((int)Math.abs(-258)); //it will gives the absolute value
		System.out.println(Math.min(2 ,5)); // it will gives the min value
		System.out.println(Math.max(2 ,5)); // it will gives the max value
	}

}
