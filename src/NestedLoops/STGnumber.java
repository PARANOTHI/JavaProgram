package NestedLoops;

public class STGnumber {

	public static void main(String[] args) {
		for(int n=145;n<=10000;n++) {
		int temp=n;
		int sum=0;
		while(temp!=0) {
			int last=temp%10;
			int fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(n==sum) {
			System.out.println(n);
		}
		n=temp;
	}
		

}}
