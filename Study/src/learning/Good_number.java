package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Good_number {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수의 개수
		int n = Integer.valueOf(st.nextToken());
		
		// n개의 수의 값을 받는다.
		st = new StringTokenizer(br.readLine());
		
		// 수의 값을 받아 long형의 a라는 원본 배열에 저장한다.
		long[] a = new long[n];
		for(int i=0; i<n; i++) {
			a[i] = Long.valueOf(st.nextToken());
		}
		
		// 배열을 오름차순으로 정렬한다.
		Arrays.sort(a);
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			long find = a[i];
			int x = 0;
			int y = n-1;
			
			while(x<y) {
				if(a[x] + a[y] == find) {
					count++;
					x++;
					y--;
				} else if(a[x] + a[y] > find) {
					y--;
				} else if(a[x] + a[y] < find) {
					x++;
				}
			}
			
			System.out.println(count);
			
		}
		

	}

}
