package codingTraining;

import java.util.ArrayList;
import java.util.List;

public class EraseChar {
    public static void solution(String my_string, int[] indices) {
    	List<Integer> arrList = new ArrayList<>();
    	StringBuilder answer = new StringBuilder();

    	for(int i : indices) arrList.add(i);
    	
    	for(int i=0; i<my_string.length(); i++) {
    		if(arrList.indexOf(i) != -1) continue;
    		else answer.append(String.valueOf(my_string.charAt(i)));
    	}
    	
    	System.out.println(answer.toString());
    	
    }
	public static void main(String[] args) {
		int[] indices= {1, 16, 6, 15, 0, 10, 11, 3};
		
		solution("apporoograpemmemprs", indices);

	}

}
