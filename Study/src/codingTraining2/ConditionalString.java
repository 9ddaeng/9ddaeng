package codingTraining2;

public class ConditionalString {

    public static int solution(String ineq, String eq, int n, int m) {
        
        if(eq.equals("=") && ineq.equals(">"))			return n >= m ? 1 : 0;
        else if (eq.equals("=") && ineq.equals("<"))	return n <= m ? 1 : 0;
        else if (eq.equals("!") && ineq.equals(">"))	return n > m ? 1 : 0;
        else				 							return n < m ? 1 : 0; 		

    }
    
	public static void main(String[] args) {
		
		System.out.println(solution("<", "=", 20, 50));

	}

}
