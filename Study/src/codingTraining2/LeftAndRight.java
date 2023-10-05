package codingTraining2;

import java.util.Arrays;
import java.util.List;

public class LeftAndRight {

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> listAnswer =Arrays.asList(str_list);
        int l = listAnswer.indexOf("l"), r = listAnswer.indexOf("r");
        
        if(l != -1 && r != -1) {
            if(l < r) {
            	answer = Arrays.copyOfRange(str_list, 0, l);
            } else if(l > r) {
             	answer = Arrays.copyOfRange(str_list, r+1, str_list.length); 
            }        	
        } else if(l == -1 && r != -1) {
        	answer = Arrays.copyOfRange(str_list, r+1, str_list.length); 
        } else if(r == -1 && l != -1) {
        	answer = Arrays.copyOfRange(str_list, 0, l);
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		String[] str_list1 = {"u", "u", "l", "r"};
		String[] str_list2 = {"l"};
		String[] str_list3 = {"r", "l"};
		String[] str_list4 = {"l", "u", "u"};
		String[] str_list5 = {"u", "l", "u", "u"};
		String[] str_list6 = {"u", "l", "r", "u"};
		String[] str_list7 = {"u", "r", "l", "u"};
		String[] str_list8 = {"r"};
		String[] str_list9 = {"u", "u"};

		
		System.out.println("1"+Arrays.toString(solution(str_list1)));
		System.out.println("2"+Arrays.toString(solution(str_list2)));
		System.out.println("3"+Arrays.toString(solution(str_list3)));
		System.out.println("4"+Arrays.toString(solution(str_list4)));
		System.out.println("5"+Arrays.toString(solution(str_list5)));
		System.out.println("6"+Arrays.toString(solution(str_list6)));
		System.out.println("7"+Arrays.toString(solution(str_list7)));
		System.out.println("8"+Arrays.toString(solution(str_list8)));
		System.out.println("9"+Arrays.toString(solution(str_list9)));
	}

}
