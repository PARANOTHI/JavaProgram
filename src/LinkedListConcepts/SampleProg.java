package LinkedListConcepts;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
// LinkedList is a Collection of Nodes
// LinkedList is Dynamic in Size
// Collection follows DoublyLinkedList.
// Insert and Delete is Fast
// It allows Duplicates
public class SampleProg {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.removeFirst();		
		System.out.println(ll);
		ll.removeLast();		
		System.out.println(ll);
		ll.addAll(ll);
		ll.add(1,22);
		System.out.println(ll);
		ll.addLast(20);
		System.out.println(ll);
		ll.removeFirstOccurrence(22);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.indexOf(20));
		System.out.println(ll.isEmpty());
		ll.clear();
		System.out.println(ll.isEmpty());
	}
	
}
