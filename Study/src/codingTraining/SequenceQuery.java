package codingTraining;

import java.util.Arrays;

public class SequenceQuery {
    public static void solution(int[] arr, int[][] queries) {
    	//queries의 0,0에 있는 숫자에서부터 0,1에 있는 숫자의 인덱스만큼
    	//arr의 원소에 +1씩 하기 
        // (0,0)(0,1)
        // (1,0)(1,1)
        // (2,0)(2,1)
       
        for(int i=0; i<queries.length; i++) {        	
        	int max = queries[i][1], min = queries[i][0];
        	for(int j=min; j<=max; j++) {
        		arr[j] += 1;
        	}
        }
        
        for(int i=0; i<queries.length; i++) {        	
        	for(int j=queries[i][0]; j<=queries[i][1]; j++) {
        		arr[j]++;
        	}
        }
    	
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
		
		solution(arr, queries);

	}

}
