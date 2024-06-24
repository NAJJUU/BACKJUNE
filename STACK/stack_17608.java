package STACK;

import java.util.Scanner;

public class stack_17608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numbers = new int[N];
		
		for(int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int max_num = numbers[N-1];
		int count = 1;
		
		for(int i = N-1; i >= 0; i--) {
			if(numbers[i] > max_num) {
				count++;
				max_num = numbers[i];
			}
		}
		
		System.out.println(count);
		sc.close();
	}
		
}
