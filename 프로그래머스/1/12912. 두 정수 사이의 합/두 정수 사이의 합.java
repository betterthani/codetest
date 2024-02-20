class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        
        // a,b 대소관계
        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        
        for(int i = a; i <= b; i++){
            answer += i;
        }
        System.out.print(answer);
        return answer;
    }
}