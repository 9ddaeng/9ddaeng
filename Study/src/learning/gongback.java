package learning;

public class gongback {
    public static String[] solution(String my_string) {
    String[] answer = {};
    String[] temp = new String[my_string.length()];
    int count = 0;
    	
    if(my_string.contains(" ") == false) {
    	answer = new String[1];
    	answer[0] = my_string;
    } else {
    	temp = my_string.split(" ");
    	for(int i=0; i<temp.length; i++) {
    		if(temp[i].length() == 0) continue;
    		else count++;
    	}
        
    	answer = new String[count];
    	
    	for(int i=0; i<count; i++) {
    		int index = my_string.indexOf(" ", 0);
    		if(my_string.indexOf(" ") != -1 ) {
    			answer[i] = my_string.substring(0, index);
    			my_string = my_string.substring(index+1);
    		} else {
    			answer[i] = my_string.substring(0);
    		}
    	}
    }
    return answer;
    }

	public static void main(String[] args) {
		String my_string = "i love you";
		
		solution(my_string);

	}

}
