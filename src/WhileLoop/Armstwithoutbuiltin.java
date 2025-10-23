package WhileLoop;
import java.util.*;

public class Armstwithoutbuiltin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter end number: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int i=n;
		//System.out.println("Enter st number");
		for( n=i;n<=m;n++) {
		int temp=n;
		int len=0;
		while(n!=0) {
			len++;
			n/=10;
		}//System.out.println(len);
		n=temp;
		int sum=0;
		while(n!=0) {
			int last=n%10;
			int pow=1;
			for(int j=1;j<=len;j++) {
				pow=pow*last;
			}
			sum+=pow;
			n/=10;
			
		}
	
		if(temp==sum) {
			System.out.println(temp);
		}
		n=temp;

	}

}
}
