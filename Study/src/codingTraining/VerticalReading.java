package codingTraining;

public class VerticalReading {
    public static void solution(String my_string, int m, int c) {
    	StringBuilder sb = new StringBuilder();
    	
        for(int i=c-1; i<my_string.length(); i+=m) {
        	sb.append(String.valueOf(my_string.charAt(i)));
        }
        
        System.out.println(sb.toString());
        
    }
	public static void main(String[] args) {
		
		solution("ihrhbakrfpndopljhygc", 4, 2);
		solution("programmers", 1, 1);

	}

}
