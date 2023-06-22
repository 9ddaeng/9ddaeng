package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Interval_hap_maximum {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 길이 N의 수열 K1, K2, .... Kn과 상수 U, V가 주어진다.
		 * Q개의 쿼리가 주어지며, 그 종류는 두 가지가 있다.
		 * 첫 번째 쿼리 : A, B가 주어지면, max(U x(Kn...kn+n)+ V x (j-1))(A<=i<=j<=B)의 값을 구한다.
		 * 두 번째 쿼리 : A, B가 주어지면, Kn의 값을 B로 바꾼다.
		 * */
		// 첫 번째 줄에 정수 N과 Q, U, V가 입력된다
		// 1 <= N, Q <= 1000, -5 <= U, V <= 5
		// 두 번째 줄에 n개의 정수가 주어진다.
		// -100 <= K <= 100
		// 세 번째 줄부터 세 수 C, A, B의 쿼리가 주어진다.
		// 1<= A, B <= N, 0 <= C <= 1)
		// C가 0이면 첫 번째 쿼리를, 아니면 두 번째 쿼리를 수행한다.
		// 첫 번째 쿼리일 경우 1<=A <= b <= N이다.
		// 두 번째 쿼리일 경우, 1 <= A <= N, -100 <= b <= 100이다.
		
		/*
		 * 5 3 2 4
		 * 1 1 1 1 1
		 * 0 1 5
		 * 1 3 -2
		 * 0 1 5
		 * -----------------
		 * 26
		 * 20
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int length = Integer.valueOf(st.nextToken());
		int quizNo = Integer.valueOf(st.nextToken());
		int U = Integer.valueOf(st.nextToken());
		int V = Integer.valueOf(st.nextToken());
		int[] k = new int[length+1];
		int sum = 0;
		int result = 0;
		int I;
		int J;
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=length; i++) {
			k[0] = 0;
			k[i] = Integer.valueOf(st.nextToken());
		}

		for(int i=0; i<quizNo; i++) {			
			st = new StringTokenizer(br.readLine());
			int c = Integer.valueOf(st.nextToken());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			sum = 0;
			for(int q=0; q<=length; q++) {
				k[0] = 0;
				sum += k[q];
			}
			
			if(c == 0) {
				while((1<=a && a<=length) && (a<=b && b<=length)) {					
					J = b;
					I = a;
					result = (U * sum) + (V * (J-I));
					// 2*2 + 4 * 4 = 4 + 16
					System.out.println("I =" + I + ", j = " + J + ", 합 = " + result);
					System.out.println(Arrays.toString(k));
					break;
				} 
			} else {
				k[a] = b;
				System.out.println(Arrays.toString(k));
				continue;
			}
			
		} 
			
	
	}
		
		
		
	}

