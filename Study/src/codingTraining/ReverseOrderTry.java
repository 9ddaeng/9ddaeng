package codingTraining;

public class ReverseOrderTry {
	public static int[] solution(int[] num_list, int n) {
	    int[] answer = new int[num_list.length];
	    
	    System.arraycopy(num_list, n, answer, 0, num_list.length -n);
	    System.arraycopy(num_list, 0, answer, num_list.length -n, n);
	    
	    return answer;

	}

	public static void main(String[] args) {
		int[] num_list1 = {2, 1, 6};
		int[] num_list2 = {5, 2, 1, 7, 5};
		
		solution(num_list1, 1); // 1, 6, 2
		solution(num_list2, 3); // 7, 5, 5, 2, 1

	}

}
