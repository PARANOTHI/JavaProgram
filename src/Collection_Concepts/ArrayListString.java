package Collection_Concepts;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> st=new ArrayList<>();
		int n=sc.nextInt();
		sc.nextLine();
		st.add("Sobi");
		st.add("Jothi");
		st.add("DhanuSri");
		st.add("Dhivya");
		st.add("Karthi");
		//System.out.print(st);
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			st.add(str);
		}
		st.set(3,"Aadvik");
		st.add(4,"Aarav");
		st.add(5,"Dhivya");
		for(String num:st) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("After Sorting:");
		Collections.sort(st);
		for(String num:st) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println(st.contains("jothi"));
		st.clear(); // it is clear the entire array list
		System.out.println(st.isEmpty()); // check whether the array list empty or not'

	}

}
