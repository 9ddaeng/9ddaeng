package codingTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnNumber2 {
    public static void solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        int[] answer = {};
       
        for(int i=0; i<arr.length; i++) {
        	arrList.add(arr[i]);
        }
        int first = arrList.indexOf(2);
        int last = arrList.lastIndexOf(2);
        if(first != -1) {        	
        	answer = new int[last-first+1];
        	
        	for(int i=0; i<answer.length; i++) {
        		answer[i] = arr[i+first];
        	}
        } else {
        	answer = new int[1];
        	answer[0] = -1;
        }
        
        System.out.println(Arrays.toString(answer));
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int[] arr2 = {1, 1, 1};
		int[] arr3 = {1, 2, 1};
		solution(arr);
		solution(arr2);
		solution(arr3);

	}

}
