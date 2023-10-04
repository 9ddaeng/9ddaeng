package codingTraining;

public class ErrandCoffee {
    public static int solution(String[] order) {
        int answer = 0;

        for(int i=0; i<order.length; i++) {
        	if(order[i].contains("latte")) answer+=5000;
        	else						   answer+=4500;
        }
          
        return answer;
    }
	public static void main(String[] args) {
		String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		String[] order2 = {"americanoice", "americano", "iceamericano"};
		
		System.out.println(solution(order1));
		System.out.println(solution(order2));

	}

}
