package learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Bigger_num {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(br.readLine());
		
		// 수열 배열 생성
		int[] A = new int[n];
		
		//정답 배열 생성
		int[] ans = new int[n];
		
		//공백 문자를 기준으로 잘라 String배열에 초기화해준다.
		//StringTokenizer를 쓰지 않고 이렇게 하는 이유 -> 추가 학습 필요
		String[] str = br.readLine().split(" ");
		
		//수열 배열을 초기화해준다.
		for(int i=0; i<n; i++) {
			A[i] = Integer.valueOf(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		
		//처음에는 스택이 비어있으므로 최초 값을 push해 초기화한다.
		myStack.push(0);
		
		for(int i=1; i<n; i++) {
			//스택이 비어 있찌 않고 현재 수열이 스택 top인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				//정답 배열에 오큰수를 현재 수열로 저장한다.
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i);
		}
		//반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 때까지
		while(!myStack.empty()) {
			//스택에 쌓인 index에 -1을 넣고 출력한다.
			ans[myStack.pop()] = -1;
		}
		//많은 양의 데이터를 처리해줄 때 좋은 함수이다.
		//자동으로 개행되지 않기 때문에 개행 문자가 필요하다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		
		//스트림을 비우는 메서드
		bw.flush();
		

	}

}
