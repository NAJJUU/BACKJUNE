package QUEUE;

import java.util.*;
public class queue_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		String[] word = sc.nextLine().split(" ");
		
		for(int i = 1; i <= Integer.parseInt(word[0]); i++) {
			q.offer(i);
		}
		
		sb.append("<");
		while(!q.isEmpty()) {
			for(int i=0; i<Integer.parseInt(word[1])-1; i++) {
				q.offer(q.poll());
				
			}
			if(q.size() > 1) {
				sb.append(q.peek()).append(", ");
			} else {
				sb.append(q.peek());
			}
			
			q.poll();
		}
		sb.append(">");
		
		System.out.print(sb);
	}

}
