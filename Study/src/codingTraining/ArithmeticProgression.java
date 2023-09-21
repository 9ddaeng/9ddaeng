package codingTraining;

public class ArithmeticProgression {    
	public static int solution(int a, int d, boolean[] included, int n) {
    int answer = 0;
   
    int num = a;
    for(int i=0; i<included.length; i++) {
    	if(included[i]) answer += num;
    	num += d;
    }
    
    return answer;
   
}

	public static void main(String[] args) {

		boolean[] included = {true, false, false, true, true};
		
		solution(3, 4, included, 5);
		
	}

}
