package learning;

public class nearestOne {
    public static void solution(int[] arr, int idx) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
        answer = sb.indexOf("1", idx);
        System.out.println(answer);
        
        //return answer;
    }
	public static void main(String[] args) {
		int[] arr1 = {0, 0, 0, 1};
		int[] arr2 = {1, 0, 0, 1, 0, 0};
		
		int idx1 = 1;
		int idx2 = 4;
		
		solution(arr1, idx1);
		solution(arr2, idx2);

	}

}
