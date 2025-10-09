package Operators;

public class Bitwise {
	//there are 3 operators
	
	/*
	 *  and - &
	 *  or - |
	 *  xor - ^
	 *  shift -> there are two shifts signed and unsigned
	 *  Signed has two types
	 *  1)Left - <<
	 *  2)Right - >>
	 *  Unsigned
	 *  
	 *  1)Unsigned right - >>>     */

	public static void main(String[] args) { //1100
		System.out.println(12&10); 			 //1010
		
		System.out.println(12|10); //128 64 32 16 8 4 2 1
		System.out.println(12^10);
		System.out.println(12^10^12);
		System.out.println(~10); // add +1 and change the sign of the number
		System.out.println(~-10); // -10+1=-9=9
		System.out.println(5<<3); //5*2^3 ->left shift will be perform multiply
		System.out.println(-5<<3);
		System.out.println(15<<3);
		System.out.println(45>>3);
		System.out.println(-165>>3);
		
		//if even same digits ex-or value op will be 0.
		//odd same digits output will be same that digit.
		

	}

}
