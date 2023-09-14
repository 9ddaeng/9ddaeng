package learning;

public class todo_list {
    public static void solution(String[] todo_list, boolean[] finished) {
    	String[] answer = {};

    	for(int i=0; i<finished.length; i++) {
    		answer[i] = todo_list[i]+finished[i];
    	}
    	
    	for(int i=0; i<answer.length; i++) {
    		
    	}
    }
	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		solution(todo_list, finished);

	}

}
