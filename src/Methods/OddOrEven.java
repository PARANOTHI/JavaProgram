package Methods;

public class OddOrEven {
	boolean oddEven(int a){
		if(a%2==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		int a=15;
		int b=20;
		int c=200;
		int d=223;
		OddOrEven o=new OddOrEven();
		System.out.println((o.oddEven(a))?"Even Number":"Odd Number");
		System.out.println((o.oddEven(b))?"Even Number":"Odd Number");
		System.out.println((o.oddEven(c))?"Even Number":"Odd Number");
		System.out.println((o.oddEven(d))?"Even Number":"Odd Number");
		

	}

}
