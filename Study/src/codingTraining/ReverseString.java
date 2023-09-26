package codingTraining;

public class ReverseString {
    public static void solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0, s));
        
        for(int i=e; i>=s; i--) {
        	answer.append(String.valueOf(my_string.charAt(i)));
        }
        answer.append(my_string.substring(e+1));
        
        System.out.println(answer.toString());
    }
	public static void main(String[] args) {
		solution("Progra21Sremm3", 6, 12);
		solution("Stanley1yelnatS", 4, 10);

	}

}
