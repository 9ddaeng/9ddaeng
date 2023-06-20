package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Interval_hap_2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 배열 크기(N), 질의 수(M) 저장하기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 원본 배열(a)을 저장할 배열을 생성한다.
		int[][] a = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
				for(int j=1; j<=n; j++) {
					a[i][j]= Integer.parseInt(st.nextToken());
				}
		}
		
		// 2차원 합배열(d)을 저장할 배열을 생성한다.
		int[][] d = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				d[i][j] = d[i][j-1] + d[i-1][j] - d[i-1][j-1] + a[i][j];
			}
		}
		
		// 주어진 m의 질의 수만큼 연산한다.
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			
			int result = d[x2][y2] - d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1];
			
			System.out.println(result);
		}
	}

}
