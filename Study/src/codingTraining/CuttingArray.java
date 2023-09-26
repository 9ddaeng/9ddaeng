package codingTraining;

import java.util.Arrays;

public class CuttingArray {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
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
        	StringBuilder sb = new StringBuilder();
        	for(int i=num_list[a]-1; i<=num_list[b]; i+=c) {
        		sb.append(num_list[i]+"");
        	}
        	String s = new String(sb);
        	String[] temp2 = s.split("");
        	answer = new int[temp2.length];
        	for(int i=0; i<temp2.length; i++) {
        		answer[i] = Integer.valueOf(temp2[i]);
        	}
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		System.out.println(Arrays.toString(solution(4, slicer, num_list)));

	}

}
