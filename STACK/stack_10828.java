package STACK;

import java.util.Scanner;
import java.util.Stack;

/*
 * public class stack_10828 {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * Stack<String> stack = new Stack<>();
 * 
 * int N = sc.nextInt(); sc.nextLine();
 * 
 * String[] command = new String[N];
 * 
 * for (int i = 0; i < N; i++) { command[i] = sc.nextLine(); }
 * 
 * for (int i = 0; i < N; i++) { String[] words = command[i].split(" ");
 * 
 * switch (words[0]) { case "push": stack.push(words[1]); break; case "pop": if
 * (stack.isEmpty()) { System.out.println("-1"); } else {
 * System.out.println(stack.pop()); } break; case "size":
 * System.out.println(stack.size()); break; case "empty":
 * System.out.println(stack.isEmpty() ? "1" : "0"); break; case "top": if
 * (stack.isEmpty()) { System.out.println("-1"); } else {
 * System.out.println(stack.peek()); } break; } }
 * 
 * sc.close(); } }
 * 
 */


public class stack_10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        
        int N = sc.nextInt();
        sc.nextLine(); 
        
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 0; i < N; i++) {
            String[] words = sc.nextLine().split(" ");
            
            switch (words[0]) {
                case "push":
                    stack.push(words[1]);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                	sb.append(stack.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
