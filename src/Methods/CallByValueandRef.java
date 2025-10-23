package Methods;

public class CallByValueandRef {
	//call by value

		void meth(int num) {

			num=10;

		}

		//call by reference

		void refer(int ar[]) {

			ar[0]=25;

			System.out.println(ar);

		}




		public static void main(String [] vcet) {

			CallByValueandRef  v=new CallByValueandRef ();

			//method passing value

			System.out.println("method passing Value");

			int num=5;

			System.out.println("Before call: "+num);

			v.meth(num);

			System.out.println("After call: "+num);

			//method passing reference

			System.out.println("\n\nmethod passing reference");

			int arr[]= {1,2};

			System.out.println("Before call: "+arr[0]);

			v.refer(arr);

			System.out.println("After call: "+arr[0]);

			System.out.println(arr);

		}

}
