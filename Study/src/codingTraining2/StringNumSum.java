package codingTraining2;

import java.math.BigInteger;

public class StringNumSum {

	
    public static String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        return num1.add(num2)+"";
    }
    
	public static void main(String[] args) {
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		
		System.out.println(solution(a, b));
		

	}

}
