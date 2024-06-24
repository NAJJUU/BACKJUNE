package STACK;

import java.util.Scanner;
import java.util.Stack;

public class stack_12605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] text = new String[N+1];
		
		
		for(int i = 0; i < text.length; i++) {
			text[i] = sc.nextLine();
		}
		
		
		for(int i = 1; i < text.length; i++) {
			String[] words = text[i].split(" ");
			Stack<String> stack = new Stack<>();
			
			for(int j = 0; j < words.length; j++) {
				stack.push(words[j]);
			}
			
			System.out.print("Case #" + i + ":");
			for(int k = 0; k < words.length; k++) {
				System.out.print(" " + stack.pop());
			}
			System.out.println();
		}

		sc.close();
	}

}
