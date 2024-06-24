package STACK;

import java.util.*;

public class stack_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			String text = sc.nextLine();
			boolean flag = true;
			int count = 0;
			
			for(int j=0; j<text.length(); j++) {
				count += (text.charAt(j) == '(' ? 1 : -1);
				if(count < 0) {
					sb.append("NO").append("\n");
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(count == 0) sb.append("YES").append("\n");
				else sb.append("NO").append("\n");
			}
			
		}
		System.out.println(sb);
		sc.close();
	}

}
