package codingTraining2;

import java.util.Arrays;

public class Query2 {

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = 0;
        int ele = 0;
        
        // queries의 [i,0][i,1]까지 숫자를 반복한다.
        // int[] min에 queires의 [i, 2]를 담아 해당 값보다 큰 경우는 min에 담는다.
        // 없을 경우에는 answer에 -1을 넣어준다.
        // 이때 min의 length가 2 이상인 경우 for문을 돌려 가장 작은 값을 고른다.
        // answer에 값을 넣어준다.
        
        for(int i=0; i<queries.length; i++) {
        	ele = 0;
        	for(int j=queries[i][0]; j<=queries[i][1]; j++) {
        		min = queries[i][2];
                
        		if(queries[i][2] == min && arr[j]>min) {
        			ele = arr[j];
        			continue;
        		}
        		else if(queries[i][2] != min && arr[j]<queries[i][2] && arr[j]>min) {
        			ele = arr[j];
        			continue;
        		}
        		else continue;
        		
        	}
        	if(ele == 0) answer[i] = -1;
        	else		 answer[i] = ele;
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		
		System.out.println(Arrays.toString(solution(arr, queries)));

	}

}
