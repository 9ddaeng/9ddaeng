package codingTraining;

public class ComparisonDate {

    public static void solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i=0; i<date1.length; i++) {
        	if(date1[i] < date2[i]) {
        		answer = 1;
        		break;
        	} else if(date1[i]>date2[i]) {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
	public static void main(String[] args) {
		int[] date1 = {2021, 10, 29};
		int[] date2 = {2021, 10, 29};
		
		solution(date1, date2);

	}

}
