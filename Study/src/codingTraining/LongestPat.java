package codingTraining;

public class LongestPat {
    public static void solution(String myString, String pat) {
        
        int index = myString.lastIndexOf(pat.charAt(pat.length()-1));
        
        System.out.println(myString.substring(0, index+1));
        
    }
	public static void main(String[] args) {
		solution("AbCdEFG", "dE");
		solution("AAAAaaaa", "a");

	}

}
