package codingTraining2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArray2 {

    public static int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        
        List<Integer> listStk = new ArrayList<>();
        
        // i가 arr의 길이보다 작으면 반복한다. i의 초기값은 0이다.
        while(i<arr.length) {
        	// stk가 빈 배열이라면 arr[i]를 skt에 추가해주고 i에 1을 더한다.
        	
        	if(listStk.size() == 0) {
        		listStk.add(arr[i]);
        		i++;
        	}
        	
        	// stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 skt에 추가해주고 i에 1을 더한다.
        	
        	else if(listStk.get(listStk.size()-1) < arr[i] && listStk.size() != 0) {   
        			listStk.add(arr[i]);
        			i++;
        		} 
            // stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 제거한다.        		
        	else if(listStk.get(listStk.size()-1) >= arr[i] && listStk.size() != 0) {
        			listStk.remove(listStk.size()-1);
        		}
   
        	
        	stk = new int[listStk.size()];
        	
        	for(int j=0; j<listStk.size(); j++) {
        		stk[j] = listStk.get(j); 
        	}

        	
        }
        return stk;
    }
    
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 3};
		
		// 1, 2, 3
		System.out.println(Arrays.toString(solution(arr)));

	}

}
