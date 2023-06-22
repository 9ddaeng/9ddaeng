package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum_two {

	public static void main(String[] args) throws Exception {
		
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
			System.out.println("sum = " + sum);
			
			if(c == 0) {
				while((1<=a && a<=length) && (a<=b && b<=length)) {					
					J = b;
					I = a;
					result = (U * sum) + (V * (J-I));
					System.out.println(result);
					break;
				}
				continue;
			} else if(c == 1){
				k[a] = b;
				continue;
			}
			
		} 


	}

}
