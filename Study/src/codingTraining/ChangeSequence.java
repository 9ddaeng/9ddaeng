package codingTraining;

public class ChangeSequence {
    
	public static int solution(int[] arr) {
        int answer = 0;
     	
        LOOP: for(int j=0; ;j++) {
        	answer = 0;
        	for(int i=0; i<arr.length; i++) {

        		if(arr[i] >=50 && arr[i] % 2 == 0) {
        			arr[i] /= 2;
        			answer++;
        		}
        		else if(arr[i] < 50 && arr[i] % 2 != 0) {
        			arr[i] = arr[i] * 2 + 1;
        			answer++;
        		}
        		
        		if(answer==0) {
        			answer = j;
        			break LOOP;
        		}
        	}
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		
		System.out.println(solution(arr));

	}

}
