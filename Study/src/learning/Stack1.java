package learning;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 수열의 개수를 num에 저장한다.
		int num = sc.nextInt();
		
		// 수열을 받을 배열을 선언한다.
		int[] A = new int[num];
		boolean result = true;
		
		// 수열을 A배열에 초기화한다.
		for(int i=0; i<num; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> st = new Stack<>();
		
		StringBuffer sb = new StringBuffer();
		
		// 오름차순으로 비교할 숫자를 초기화한다.
		int asc = 1;

		for(int i=0; i<A.length; i++) {
			
			// 수열 배열의 첫 번째 숫자를 su에 초기화한다.
			int su=A[i];
			
			// 수열 배열의 첫 번째 숫자가 오름차순으로 비교할 자연수보다 크거나 같을 때,
			if(su >= asc) {
				while (su>=asc) {
					
					// 자연수를 배열의 첫 번째 숫자와 같아질 때까지 push한다.
					st.push(asc++);
					
					// push해줄 때마다 +를 StringBuffer에 추가한다.
					sb.append("+\n");
				} 
				// 배열의 첫 번째 숫자와 자연수가 동일해지면 while문을 빠져나가 pop해준다.
				// 이때, 맨 위의 top숫자가 빠지면 자연수가 배열의 첫 번째 숫자보다 작아지므로 if문을 완전히 빠져나가게 된다.
				st.pop();
				sb.append("+\n");
			}
			else {
				int topNum = st.pop();
				
				if(topNum > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
		// result의 값이 true일 때, 즉 오름차순 수열을 만들 수 있을 때만 배열을 출력할 수 있게
		// boolean result값의 조건을 설정해준다.
		if(result) System.out.println(sb.toString());

	}

}
