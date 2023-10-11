package codingTraining2;

public class Sequence2 {
	
    public static int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        
        LOOP:while(true) {
        	count = 0;
        	for(int i=0; i<arr.length; i++) {
            	if(arr[i] >= 50 && arr[i] % 2 == 0)		arr[i] /= 2;
            	else if(arr[i]<50 && arr[i] % 2 != 0)	arr[i] = arr[i]*2+1;
            	else									count++;
            	
            	if(count == arr.length || i == arr.length) break LOOP;
        	}
        	answer++;
        }

        return answer;
    }

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int[] arr2 = {2};
		
		System.out.println(solution(arr));
		System.out.println(solution(arr2));

	}

}
