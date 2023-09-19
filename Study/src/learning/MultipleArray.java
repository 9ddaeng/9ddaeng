package learning;

import java.util.Arrays;

public class MultipleArray {
    public static void solution(int[][] arr) {
        int answer = 0;
        int[][] temp = new int[arr.length][arr.length];
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
            	temp[j][i]=arr[i][j];
            }
        }
        
        if(Arrays.deepEquals(arr, temp)) answer = 1;
        System.out.println(answer);
        
    }
	public static void main(String[] args) {
		
		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
		solution(arr);

	}

}
