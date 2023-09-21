package codingTraining;

public class ComparisonDate {

    public static void solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i=0; i<date1.length; i++) {
        	if(date1[i] != date2[i] &&
        		Math.max(date1[i], date2[i]) == date2[i]) {
        		answer = 1;
        		break;
        	}
        }
        System.out.println(answer);
    }
	public static void main(String[] args) {
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		
		solution(date1, date2);

	}

}
