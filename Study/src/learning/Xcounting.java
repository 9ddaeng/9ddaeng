package learning;

public class Xcounting {

    public static void solution(String myString) {
        
        String[] split = myString.split("x");
        int[] answer = new int[split.length];
        
        for(int i=0; i<split.length; i++) {
        	answer[i] = split[i].length();
        }
        
        for(int i : answer) {System.out.println(i);}
        
    }
    
	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		solution(myString);

	}

}
