package QueueConcepts;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

// Insert and Delete Processed in Different End
// FIFO concept
// Add , Poll 
// it is an Interface it doesnot have an constructor
// LinkedList , ArrayDequeue.
// Deque mean double ended Queue we can insert or delete from both side that is front and last.

public class QueueSamples {
	public static void main(String[] args) {
		Queue<String> qu=new LinkedList<>();
		Deque<String> q=new ArrayDeque<>();
		qu.offer("Palani");
		qu.add("Paranjothi");
		qu.add("Sobika");
		qu.add("DhanuSri");
		qu.add("Dhivya");
		qu.add("Poorni");
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.isEmpty());
		qu.clear();
		System.out.println(qu);
		System.out.println("ArrayDeque");
		q.offer("Palani");
		q.add("Paranjothi");
		q.add("Sobika");
		q.add("DhanuSri");
		q.add("Dhivya");
		q.add("Poorni");
		System.out.println(q);
		q.offerFirst("Bala");
		System.out.println(q);
		
	}

}
