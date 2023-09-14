package learning;

public class removeZero {
    public static String solution(String n_str) {
        int index = n_str.indexOf("[^0]", 0);
        
        return index == -1 ? n_str : n_str.substring(index);
    }
	public static void main(String[] args) {
		
		String n_str="0010";
		
		int index = n_str.indexOf("[^0]");
		System.out.println(index);
		//solution(n_str);

	}

}
