package codingTraining;

import java.util.Arrays;

public class Tie {
    public static int solution(String[] strArr) {
        int answer = 0;
        
        
        // count라는 길이 30만큼의 배열을 생성한다.
        int[] count = new int[30];
        
        // strArr을 돌며 각 원소의 길이만큼 index-1의 원소 값을 +1해준다.
        for(int i=0; i<strArr.length; i++) {
        	count[strArr[i].length()-1]++;
        }
        
        System.out.println(Arrays.toString(count));
        // 가장 큰 수의 index를 찾아 +1한 값을 반환해준다.
        
        for(int i=0; i<count.length; i++) {
        	if(count[i] > answer) answer = count[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String[] strArr = {"a","bc","d","efg","hi"};
		
		System.out.println(solution(strArr));
	}

}
