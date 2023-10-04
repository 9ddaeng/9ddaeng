package codingTraining;

public class QrCode {
	
    public static String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<code.length(); i++) {
        	if(i%q == r) answer.append(code.charAt(i)+"");
        	else continue;
        }
        
        return answer.toString();
    }
    
	public static void main(String[] args) {
		System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
		System.out.println(solution(1, 0, "programmers"));
	}

}
