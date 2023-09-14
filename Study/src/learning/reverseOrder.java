package learning;

import java.util.StringTokenizer;

public class reverseOrder {
    public static void solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        
        for(int y : answer) {
        	System.out.print(y);
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] num_list1 = {2, 1, 6};
		int[] num_list2 = {5, 2, 1, 7, 5};
		int[] num_list3 = {4, 5, 6, 2, 3, 7};
		
		solution(num_list1, 1); // 1 6 2 (1, 2, 0)
		solution(num_list2, 3); // 7 5 5 2 1 (3, 4, 0, 1, 2)
		solution(num_list3, 2); // 6, 2, 3, 7, 4, 5 (2, 3, 4, 5, 0, 1)

	}

}
