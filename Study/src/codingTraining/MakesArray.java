package codingTraining;

import java.util.Arrays;

public class MakesArray {
    public static void solution(int[] arr) {
    	int cnt = 0;
  		int[] answer;
    	if(arr.length==1) answer=Arrays.copyOf(arr, 1);
    	else {    		
    		for(int i=1; ; i*=2) {
    			if(2*i >= arr.length) {
    				cnt = i;
    				break;	
    			}
    			else continue;
    		}
    		System.out.println(cnt);
    		answer = Arrays.copyOf(arr, 2*cnt);
    	}
    	
    	System.out.println(Arrays.toString(answer));
    	
        
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6}; //6
		int[] arr2 = {58, 172, 746, 89}; //4
		int[] arr3 = {56, 3, 222, 16, 78, 909, 223}; //7
		int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; //13
		int[] arr5 = {1}; //1
		// 2, 4, 8, 16, 32
		solution(arr);
		solution(arr2);
		solution(arr3);
		solution(arr4);
		solution(arr5);

	}

}
