package codingTraining;

import java.util.Arrays;

public class ThreeDelimeter {
    public static void solution(String myStr) {
    	myStr = myStr.replaceAll("[a-c]", " ").replaceAll("\\s+", " ").trim();
    	
    	String[] answer = myStr.split(" ");
    	if(answer[0].equals("")) answer[0] = "EMPTY";

    	System.out.println(Arrays.toString(answer));
        
    }
	public static void main(String[] args) {
		
		solution("baconlettucetomato");
		solution("abcd");
		solution("cabab");
		solution("djckllkdcas");

	}

}
