package codingTraining;

public class Query3 {
    public static void solution(int[] arr, int[][] queries) {
        
//    		for(int i=0; i<queries.length; i++) {    			
//    			int a = queries[i][0], b = queries[i][1];
//    			for(int j=0; j<arr.length; j++) {
//    				if(j==a) {
//    					int tmp = arr[j];
//    					arr[j] = arr[b];
//    					arr[b] = tmp;
//    				}
//    			}
//    		}
    	for(int i=0; i<queries.length; i++) {
    		int one = arr[queries[i][0]];
    		int two = arr[queries[i][1]];
    		
    		arr[queries[i][0]] = two;
    		arr[queries[i][1]] = one;
    		
    		
    	}
    	for(int i : arr) System.out.print(i);
    	
    }
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};
		
		solution(arr, queries); // 3 4 1 0 2 

	}

}
