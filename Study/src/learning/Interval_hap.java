package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Interval_hap {

	public static void main(String[] args) throws Exception {
		
		// 질의의 수가 많을 때는 scanner클래스보다 BufferedReader클래스가 좋다.
		// 연산이 더 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringTokenizer를 이용해 BufferedReader로 받아온 값을 token으로 분리해 사용한다.
		// readLine() => 값을 입력받고 해당 줄을 읽는 메서드
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// nextToken()을 이용해 하나씩 값을 순서대로 받아오는데,
		// 이때 String형이므로 Integer로 형변환해 사용한다.
		int suNo = Integer.valueOf(st.nextToken());
		int quizNo = Integer.valueOf(st.nextToken());
		
		// 합배열을 생성하기 위한 long형의 배열을 선언해준다.
		long[] s = new long[suNo + 1];
		
		// 원본 배열을 입력받는다.
		st = new StringTokenizer(br.readLine());
		
		//S[i] = S[i-1] + A[i]
		for(int i=1; i<=suNo; i++) {
			s[i] = s[i-1] + Integer.valueOf(st.nextToken());
		}
		
		for(int q=0; q<quizNo; q++) {
			// 질의 구간을 입력받는다.
			st = new StringTokenizer(br.readLine());
			
			// i부터 j까지의 구간 합을 구한다.
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			System.out.println(s[j] - s[i-1]);
		}

	}

}
