package codingTraining;

import java.util.ArrayList;
import java.util.List;

public class MakeBaeyeol5 {
    public static void solution(String[] intStrs, int k, int s, int l) {
        List<Integer> strList = new ArrayList<>();
        
        for(int i =0; i<intStrs.length; i++) {
        	int temp = Integer.valueOf(intStrs[i].substring(s, s+l));
        	if(temp > k) strList.add(temp);
        	else continue;
        }
        
        int[] answer = new int[strList.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = strList.get(i);
        }
        
        for(int i : answer) System.out.println(i);
        
        
       
        
    }
	public static void main(String[] args) {
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		
		solution(intStrs, 50000, 5, 5);
		

	}

}
