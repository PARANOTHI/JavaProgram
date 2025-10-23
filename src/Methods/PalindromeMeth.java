package Methods;
import java.util.*;

public class PalindromeMeth {
	boolean isPalindrome(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		n=temp;
		if(rev==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PalindromeMeth pm=new PalindromeMeth();
		int a=sc.nextInt();
		System.out.println((pm.isPalindrome(a))?a+" is Palindrome":a+" is Not Palindrome");
		int b=sc.nextInt();
		System.out.println((pm.isPalindrome(b))?b+" is Palindrome":b+" is Not Palindrome");
		int c=sc.nextInt();
		System.out.println((pm.isPalindrome(c))?c+" is Palindrome":c+" is Not Palindrome");
		// TODO Auto-generated method stub

	}

}
