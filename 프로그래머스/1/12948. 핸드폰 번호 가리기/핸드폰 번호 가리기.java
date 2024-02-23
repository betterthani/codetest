class Solution {
    public String solution(String phone_number) {
        /*
        // 뒷 4자리
        String backNumber = phone_number.substring(phone_number.length()-4, phone_number.length());
        
        // 뒷 4자리 제외 앞자리
        phone_number = phone_number.substring(0, phone_number.length()-4);
        
        for(int i = 0; i < phone_number.length(); i++){
            phone_number = phone_number.replace(phone_number.substring(i,i+1), "*");
        }
        
        String answer = phone_number + backNumber;
        
        return answer;
        */
        String answer = "";
        for(int i = 0; i < phone_number.length()-4; i++){
            answer += "*";
        }
        
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}