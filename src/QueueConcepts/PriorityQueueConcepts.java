package QueueConcepts;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueConcepts {

	public static void main(String[] args) {
		//PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> a-b); // this is called manual comparator
		// PriorityQueue<Character> pq=new PriorityQueue<>(Comparator.comparingInt((Character x)->x).reversed());
		// .reversed gives in decendingOrder if nothing it will return ascending order
		// There are 3 method 
		// Comparing -> to compare the two values
		// comparingInt -> compare int ,byte , Character
		// comparingFloat -> to compare float ,double.
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);
		Queue<Character> q=new PriorityQueue<>();
			q.add('x');
			q.add('1');
			q.offer('c');
			q.add('8');
			q.add('h');
			q.add('q');
			pq.addAll(q);
			System.out.println(q);
			System.out.println(q.poll());
			System.out.println(q.poll());
			System.out.println(pq);
			System.out.println(pq.poll());
			System.out.println(pq.poll());
		}
	}

