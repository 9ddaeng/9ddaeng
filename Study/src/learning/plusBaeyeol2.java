package learning;

public class plusBaeyeol2 {
    public static void solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=1; j<=arr[i]; j++) {
        		sb.append(arr[i]+",");
        		count++;
        	}
        }
        
        String temp = new String(sb);
        
        String[] s = temp.split(",");
        
        answer = new int[count];
        
        for(int i=0; i<s.length; i++) {
        	answer[i] = Integer.valueOf(s[i]);
        }

        for(int i : answer) {
        	System.out.print(i+" ");
        }
    }
	public static void main(String[] args) {
		int[] arr = {5, 1, 4};
		
		solution(arr);

	}

}
