package codingTraining2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray6 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
        	if(answerList.size() == 0) answerList.add(arr[i]);
        	else if(answerList.size() != 0 && answerList.get(answerList.size()-1) == arr[i]) {
        		answerList.remove(answerList.size()-1);
        	}
        	else if(answerList.size() != 0 && answerList.get(answerList.size()-1) != arr[i]) {
        		answerList.add(arr[i]);
        	}
        }
        
        if(answerList.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	answer = new int[answerList.size()];
        	
            for(int i=0; i<answerList.size(); i++) {
            	answer[i] = answerList.get(i);
            }
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[] arr1 = {0, 1, 1, 1, 0};
		int[] arr2 = {0, 1, 0, 1, 0};
		int[] arr3 = {0, 1, 1, 0};
		int[] arr4 = {0, 1, 1, 0, 1};
		int[] arr5 = {0, 1, 0, 0};
		
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
		System.out.println(Arrays.toString(solution(arr3)));
		System.out.println(Arrays.toString(solution(arr4)));
		System.out.println(Arrays.toString(solution(arr5)));
		
	}

}
