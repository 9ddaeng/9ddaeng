package codingTraining;

public class CountPat {
    public static void solution(String myString, String pat) {
        int answer = 0;
        String temp = myString;
        
        for(int i=0; i<temp.length(); i++) {
        	if(!myString.contains(pat)) break;
        	else {
        		int index = myString.indexOf(pat);
        		myString = myString.substring(index+1);
        	}
        	answer++;
        }
        System.out.println(answer);
        
    }
	public static void main(String[] args) {
		solution("banana", "ana");
		solution("aaaa", "aa");

	}

}
