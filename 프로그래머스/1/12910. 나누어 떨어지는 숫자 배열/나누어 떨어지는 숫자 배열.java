import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        //arr 오름차순
        Arrays.sort(arr);
        
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if(list.isEmpty()) {
            answer = new int[] {-1};
        } else {
            answer = new int[list.size()];
            int size = 0;
            for(int i : list) {
                answer[size++] = i;
            }
        }
        
        return answer;
    }
}