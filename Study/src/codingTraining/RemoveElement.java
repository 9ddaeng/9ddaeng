package codingTraining;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void solution(int[] arr, int[] delete_list) {
    	List<Integer> arr1 = new ArrayList<Integer>();
    	
    	for(int i : arr) {
    		arr1.add(i);
    	}
    	
    	for(int del : delete_list) {
    		int index = arr1.indexOf(del);
    		
    		if(index != -1) {
    			arr1.remove(index);
    		}
    	}
    	
    	for(int i:arr1) System.out.println(i);
    	
    }
	public static void main(String[] args) {
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		solution(arr, delete_list);

	}

}
