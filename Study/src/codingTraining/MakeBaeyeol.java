package codingTraining;

public class MakeBaeyeol {
    public static void solution(int[] arr, int[][] intervals) {
        int x1 = intervals[0][0];
        int y1 = intervals[0][1];
        int x2 = intervals[1][0];
        int y2 = intervals[1][1];
        int[] answer = new int[(y1-x1+1)+(y2-x2+1)];
        
        System.arraycopy(arr, x1, answer, 0, y1-x1+1);
        System.arraycopy(arr, x2, answer, y1-x1+1, y2-x2+1);

        for(int i : answer) System.out.print(i+", ");
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
		
		solution(arr, intervals);

	}

}
