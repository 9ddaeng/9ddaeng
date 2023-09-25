package codingTraining;

import java.util.ArrayList;
import java.util.List;

public class OperationArrays {
	    public static void solution(int[] arr, boolean[] flag) {
	    	List<Integer> arrList = new ArrayList<>();
	        
	        for(int i=0; i<flag.length; i++) {
	        	if(flag[i] == true) {
	        		for(int j=0; j<arr[i]*2; j++) {
	        			arrList.add(arr[i]);
	        		}
	        	} else if(flag[i] == false) {
	        		for(int j=0; j<arr[i]; j++) {	        			
	        			arrList.remove(arr.length-1);
	        		}
	        	}
	        }

	        int[] answer = new int[arrList.size()];

	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = arrList.get(i);
	        }
	        
	        for(int i : answer) System.out.println(i);
	
	    }
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		
		solution(arr, flag);

	}

}
