package learning;

import java.util.Arrays;

public class addString {
    public static void solution(String my_string) {
        String[] answer = {};
        String[] temp = new String[my_string.length()];
        int index = my_string.indexOf(" ");
        int count=0;
        int i=0;
        
        temp = my_string.split(" ");
        
        for(int j=0; j<temp.length; j++) {
            if(temp[j].length() != 0) count++;
            else                      continue;
        }
        
        if(count == 0 && index == -1) {
        	answer = new String[1];
        	answer[0] = my_string.substring(0);
        }
        else {
        	answer = new String[count+1];
        	while(my_string.length() != 0) {
        		index = my_string.indexOf(" ");
                answer[i] = my_string.substring(0, index);
                my_string = my_string.substring(index+1);
               i++;
        	}
        }

        Arrays.toString(answer);
    }

	public static void main(String[] args) {
		
		String my_string = "i love you";
//		
//		int index = my_string.indexOf(" ");
//		
//		String new_string = my_string.substring(0, index);
//		
//		System.out.println(new_string);
//		
//		my_string = my_string.substring(index+1);
//		
//		System.out.println(my_string);
		
		solution(my_string);


	}

}
