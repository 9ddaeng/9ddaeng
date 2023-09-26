package codingTraining;

public class EasyLogicOperation {
    public static void solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answerLeft = true;
        boolean answerRight = true;
        boolean answer = false;
        
        //boolean answer = (x1||x2)&&(x3||x4);
        
        if(!x1&&!x2) answerLeft = false;
        if(!x3&&!x4) answerRight = false;
        if(answerLeft&&answerRight) answer = true;
        
        System.out.println(answer);
    }
	public static void main(String[] args) {
		solution(false, true, true, true);
		solution(true, false, false, false);

	}

}
