package codingTraining;

import java.util.Arrays;

public class CountingChar {

    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++) {
        	if(my_string.charAt(i)<97) {
        		int idx = my_string.charAt(i);
        		answer[idx-65]++;
        	} else {
        		int idx = my_string.charAt(i);
        		answer[idx-71]++;
        	}
        	
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("Programmers")));

	}

}
