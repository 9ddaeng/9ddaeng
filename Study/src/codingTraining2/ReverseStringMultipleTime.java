package codingTraining2;

public class ReverseStringMultipleTime {
    public static String solution(String my_string, int[][] queries) {
        
        for(int i=0; i<queries.length; i++) {
        	int x = queries[i][0], y = queries[i][1];
        	StringBuilder piece = new StringBuilder();
        	StringBuilder temp = new StringBuilder(my_string.substring(x, y+1)).reverse();
        	
        	piece.append(my_string.substring(0, x)).append(temp).append(my_string.substring(y+1));
        	my_string= piece.toString();
        }
        
        return my_string;
    }
	public static void main(String[] args) {
	int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
	
	System.out.println(solution("rermgorpsam", queries));
	// remrgorpsam
	// progrmersam
	// programmers

	}

}
