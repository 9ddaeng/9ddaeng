package learning;

import java.util.Scanner;

public class Num_hap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		/* 
		 * next()와 nextLine()의 차이점
		 * - next()는 개행문자를 무시하고 공백 전까지 입력받는다.
		 * - nextLine()은 개행문자를 포함하여 입력받는다.
		 * 위와 같이 nextInt() 사용시 숫자를 입력받고 Enter를 클릭하면 앞의 숫자만 출력되고 \n은 남아있게 되는데,
		 * next()는 \n을 무시하기 때문에 그 다음줄에 입력받을 수 있다.
		 * nextLine()은 \n을 포함하기 때문에 해당 문자만 가져오고 바로 종료되어 버린다.
		 * */
		String num = sc.next();
		char[] ch = num.toCharArray();
		int sum = 0;
		
		// 아스키코드에서 숫자-문자의 차이는 48
		// 문자형을 정수형으로 바꾸려면 -'0' 해줘야 한다.
		for(int i=0; i<ch.length; i++) {
			sum += ch[i]-'0';
		}
		
		System.out.println("숫자의 합 = " + sum);

	}

}
