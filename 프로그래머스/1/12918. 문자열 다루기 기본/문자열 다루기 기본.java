import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return answer;
            }catch(NumberFormatException e){
                return !answer;
            }
        } else 
        
        return !answer;
    }
}