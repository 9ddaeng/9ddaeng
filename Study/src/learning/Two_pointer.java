package learning;

import java.util.Scanner;

public class Two_pointer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// n이 자기 자신일 때의 카운트를 1로 초기화해놓는다.
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		long[] a = new long[n];
		
		// 원본 배열을 초기화한다.
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}
		
		while(end_index != n) {
			if(sum == n) {
				count++;
				end_index++;
				sum = sum+end_index;
			} else if(sum > n) {
				sum = sum-start_index;
				start_index++;
			} else if(sum < n) {
				sum = sum+end_index;
				end_index++;
			}
		}
		
		System.out.println(count);

	}

}
