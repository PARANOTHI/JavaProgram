package Methods;
import java.util.*;
public class ArmStrongMeth {
	boolean armStrong(int n){
		int sum=0;
		int temp=n;
		int Digit=String.valueOf(n).length();
		while(n!=0) {
			int digits=n%10; 
			sum+=Math.pow(digits,Digit);
			n/=10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmStrongMeth am=new ArmStrongMeth();
		int a=sc.nextInt();
		System.out.println((am.armStrong(a))?a+" is ArmStrong":a+ " is Not Armstrong");
		int b=sc.nextInt();
		System.out.println((am.armStrong(b))?b+" is ArmStrong":b+ " is Not Armstrong");
		int c=sc.nextInt();
		System.out.println((am.armStrong(c))?c+" is ArmStrong":c+ " is Not Armstrong");

	}

}
