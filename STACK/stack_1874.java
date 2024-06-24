package STACK;

// 다시 해야함 ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stack_1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Integer> array = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			array.add(i);
		}
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			if(!stack.isEmpty()) {
				if(stack.peek()<num) {
					for(int j=stack.peek(); j <num; j++) {
						stack.push(array.get(0));
						sb.append("+").append("\n");
					}
					
				} else if(stack.peek()>num) {
					for(int j = stack.peek(); j >=num; j++) {
						stack.pop();
						sb.append("-").append("\n");
						array.remove(0);
					}					
				} else if(stack.peek() == num) {
					stack.pop();
					sb.append("-").append("\n");
				}
			}else {
				for(int j=1; j<=num; j++) {
					stack.push(array.get(0));
					sb.append("+").append("\n");
				}
				
			}
			
			System.out.println(sb);
		}
		
		

	}

}
