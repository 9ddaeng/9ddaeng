package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class remain_hap {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수열의 개수(n), 나누어 떨어져야 하는 수(m) 입력받기
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 나머지가 0인 배열 카운트하기
		long cnt = 0;

		// 합 배열(s) 생성하기
		long[] s = new long[n+1];
		
		// 나머지가 같은 것들을 카운트하는 배열(c) 생성하기
		long[] c = new long[n+1];

		// 합배열 저장하기
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			s[i] = s[i-1] + Integer.valueOf(st.nextToken());
		}
		
		// m으로 나머지 나누기
		for(int i=1; i<=n; i++) {
			int remainder = (int)s[i] % m;
			if(remainder == 0) cnt++;
			c[remainder]++;
		}
		
		for(int i=0; i<m; i++) {
			if(c[i]>1) {
				cnt = (cnt + (c[i] * (c[i]-1) / 2));
			}
		}
		
		System.out.println(cnt);
	}

}
