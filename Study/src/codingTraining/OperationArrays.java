package codingTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationArrays {
	    public static int[] solution(int[] arr, boolean[] flag) {
	    	int[] answer = {};
	    	List<Integer> listAnswer = new ArrayList<>();
	    	
	    	for(int i=0; i<flag.length; i++) {
	    		if(flag[i] == true) {
	    			for(int j=0; j<arr[i]*2; j++) {
	    				listAnswer.add(arr[i]);
	    			}
	    		} // End if
	    		
	    		else {
	    			for(int j=0; j<arr[i]; j++) {
	    				listAnswer.remove(listAnswer.size()-1);
	    			}
	    		}
	    	}
	    	
	    	answer = new int[listAnswer.size()];
	    	
	    	for(int i=0; i<answer.length; i++) {
	    		answer[i] = listAnswer.get(i);
	    	}
	    	
	    	
	    	return answer;
	
	    }
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		
		System.out.println(Arrays.toString(solution(arr, flag)));

	}

}
