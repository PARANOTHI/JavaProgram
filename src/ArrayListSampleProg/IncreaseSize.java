package ArrayListSampleProg;
import java.util.*;

public class IncreaseSize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		int size=al.size();
		if(al.isEmpty()) {
			System.out.println("ArrayList pis Empty So add 4 elements");
			for(int i=0;i<4;i++) {
				int a=sc.nextInt();
				al.add(a);
		}
		}
		else if(size%2==0) {
			System.out.println("enter "+al.size()*2+" Elements: ");
			for(int i=0;i<size*2;i++) {
				//int a=sc.nextInt();
				al.add(sc.nextInt());
			}
		}
		for(int res:al) {
			System.out.print(res+" ");
		}
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
