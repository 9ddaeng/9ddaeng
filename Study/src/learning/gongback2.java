package learning;

public class gongback2 {
    public static void solution(String my_string) {
    	String[] answer = {};
    	int count = 0;

    	my_string = my_string.trim();

    	if(my_string.contains(" ") == false) {
    		answer = new String[1];
    		answer[0] = my_string;
    	} else {
    		String[] temp = my_string.split(" ");
    		for(int i=0; i<temp.length; i++) {
    			if(temp[i].length() != 0) count++;
    			else					  continue;
    		}
    		answer = new String[count];
    		
    		Loop: for(int i=0; i<answer.length; i++) {
    			int index = my_string.indexOf(" ", 0);
    			
    			if(my_string.charAt(index+1) == ' ') {
    				my_string = my_string.substring(0, index+1);
    			}
    			else {    				
    				answer[i] = my_string.substring(0, index);
    				my_string = my_string.substring(index+1);
    			}
    			
    			if(my_string.contains(" ")==false && my_string.length() == 0) break Loop;

    		}
    		
    		
    		
    	}
    	
    	//return answer;
    	for(String i : answer)
    	{
    		System.out.println(i);
    	}


    }

	public static void main(String[] args) {
		String my_string = " i    love  you";

		solution(my_string);
	}

}
