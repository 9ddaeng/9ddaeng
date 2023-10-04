package codingTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuttingArray {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
    	int[] answer = {};
    	int a = slicer[0];
    	int b = slicer[1];
    	int c = slicer[2];
    	
    	//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
    	//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
    	//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
    	//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
    	
    	switch(n) {
    	
    	case 1:
    		answer = Arrays.copyOfRange(num_list, 0, b+1);
    		break;
    	case 2:
    		answer = Arrays.copyOfRange(num_list, a, num_list.length);
    		break;
    	case 3:
    		answer = Arrays.copyOfRange(num_list, a, b+1);
    		break;
    	case 4:
    		int[] temp = Arrays.copyOfRange(num_list, a, b+1);
    		List<Integer> cut = new ArrayList<>();
    		
    		for(int i=0; i<temp.length; i+=c) {
    			cut.add(temp[i]);
    		}
    		
    		answer = new int[cut.size()];
    		
    		for(int i=0; i<cut.size(); i++) {
    			answer[i] = cut.get(i);
    		}
    	}
    	
        return answer;
    }
	public static void main(String[] args) {
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println(Arrays.toString(solution(1, slicer, num_list)));

	}

}
