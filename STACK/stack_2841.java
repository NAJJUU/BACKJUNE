package STACK;

import java.util.*;

public class stack_2841 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nums = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(nums[0]);
		int P = Integer.parseInt(nums[1]);
		
		
		Stack<Integer>[] stack = new Stack[6];
		
		for(int i=0; i<stack.length; i++) {
			stack[i] = new Stack<Integer>();
		}
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			nums = sc.nextLine().split(" ");
			
			int line = Integer.parseInt(nums[0])-1;
			int fret = Integer.parseInt(nums[1]);

			
			if (stack[line].isEmpty()||stack[line].peek() < fret) {
			    stack[line].push(fret);
			    count++;
			} else if (stack[line].peek() > fret) {
				while(!stack[line].isEmpty() && stack[line].peek() > fret) {
					stack[line].pop();
					count++;
				}
				if (!stack[line].isEmpty() && stack[line].peek() != fret) {
					stack[line].push(fret);
					count++;
				} else if(stack[line].isEmpty()) {
					stack[line].push(fret);
					count++;
				}
			} 
		}
		
		System.out.print(count);
				
		sc.close();

	}

}
