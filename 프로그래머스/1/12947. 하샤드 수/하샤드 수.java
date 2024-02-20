class Solution {
    public boolean solution(int x) {
        // int -> String 배열 변환
        String xNum[] = String.valueOf(x).split("");
        
        // 자릿수 덧셈
        int sum = 0;
        for(int i = 0; i < xNum.length; i++){
            sum += Integer.valueOf(xNum[i]);
        }
        
        // x % 자릿수 합 == 0 일경우 true, 반대 false
        boolean answer = true;
        if(x % sum == 0){
            return answer;
        } else return !answer;
    }
}