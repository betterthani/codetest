package Day09;

import java.io.*;

public class Quiz01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int answer = 0;
		String str [] = line.split("-");
		for(int i = 0; i < str.length; i++) {
			int temp = mySum(str[i]);
			if(i == 0) {
				answer += temp;
			} else {
				answer -= temp;
			}
		}
		
		System.out.println(answer);
	}

	private static int mySum(String a) {
		
		int sum = 0;
		String arr[] = a.split("[+]");
		for(int i = 0; i <arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		return sum;
	}
}
