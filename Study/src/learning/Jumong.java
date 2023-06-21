package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Jumong {

	public static void main(String[] args) throws Exception {
		/*
		 * 숫자가 정렬되지 않고 랜덤으로 주어지는 경우,
		 * Arrays.sort()를 사용해 오름차순으로 정렬해준다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] a = new long[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Long.valueOf(st.nextToken());
		}
		
		// 배열을 오름차순으로 정렬한다.
		Arrays.sort(a);
		
		int count = 0;
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if (a[i]+a[j]<m) {
				i++;
			} else if(a[i]+a[j]>m) {
				j--;
			} else if(a[i]+a[j] == m) {
				count++;
				i++;
				j--;
			}
		}
		
		System.out.println(count);
		br.close();

	}

}
