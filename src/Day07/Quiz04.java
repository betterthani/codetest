package Day07;

import java.util.ArrayList;

public class Quiz04 {
	public static void main(String[] args) {
		int dots[][] = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		 int answer = 0;
	        ArrayList<Double> arr = new ArrayList<>();
	        for(int i = 0; i < dots.length-1; i++){
	            for (int j = i+1; j < dots.length; j++){
	                double line = Math.abs((double)(dots[i][1]-dots[j][1]) / (dots[i][0]-dots[j][0]));
	                if(arr.contains(line)){
	                    System.out.println(1);
	                    return;
	                } else {
	                    arr.add(line);
	                }
	            }
	        }
	        System.out.println(answer);
	}
}
