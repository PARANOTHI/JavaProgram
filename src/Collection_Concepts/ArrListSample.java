package Collection_Concepts;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrListSample {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2); // .add() used add element is arraylist
		a1.add(3);
		a1.add(4);
		a1.add(3);
		a1.add(5);
		a1.add(1);
		System.out.println(a1);
		System.out.println(a1.size()); // .size() used to check the size of the arraylist
		System.out.println(a1.get(2)); // .get() find out the particular index position value
		a1.set(2,10); // .set() is used to set the value in the particular index
		System.out.println(a1);
		a1.remove(3); // .remove is used to remove the value from the particular index.
		System.out.println(a1);
		
		for(int i:a1) {
			System.out.println(i);
		}
		

	}

}
