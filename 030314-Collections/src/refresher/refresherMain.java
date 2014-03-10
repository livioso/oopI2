package refresher;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class refresherMain {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
			stack.push(i);
			priorityQueue.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer i : list) {
			System.out.println(i);
		}
	
		for(Integer i : stack) {
			System.out.println(i);
		}
		
		for(Integer i : priorityQueue) {
			System.out.println(i);
		}
		
		list.remove(2);
		stack.pop();
		
		priorityQueue.peek(); // retrieves but doesn't remove
		priorityQueue.poll(); // retrieves and removes
	}
}
