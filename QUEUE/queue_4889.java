package QUEUE;

import java.util.*;

public class queue_4889 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> q = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String last = "";
		
		for(int i = 0; i < N; i++) {
			String[] word = sc.nextLine().split(" ");
			
			switch(word[0]) {
			case "push":
				q.add(word[1]);
				last = word[1];
				break;
			case "pop":
				if(!q.isEmpty()) {
					sb.append(q.peek()).append("\n");
					q.remove();
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "size":
				sb.append(q.size()).append("\n");
				break;
			case "empty":
				if(q.isEmpty()) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if(!q.isEmpty()) {
					sb.append(q.element()).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
			case "back":
				if(!q.isEmpty()) {
					sb.append(last).append("\n");
				} else {
					sb.append("-1").append("\n");
				}
				break;
				
			}
		}
		
		System.out.print(sb);
		
		
		sc.close();

	}

}
