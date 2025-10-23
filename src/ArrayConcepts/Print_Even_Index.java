package ArrayConcepts;
import java.util.*;

public class Print_Even_Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
//			if(i%2!=0) {
//				System.out.println("Odd index Elements: "+arr[i]);
//			}
			if(i%2==0) {
				System.out.println("Even index Elements: "+arr[i]);
			}
		}

	}

}
