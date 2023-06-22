import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
    
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> check = new HashMap<>();
        
        // Map 초기화
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], new HashSet<>());
            check.put(id_list[i], i);
        }
        
        // split
        for(int i = 0; i < report.length; i++){
            String reportSplit[] = report[i].split(" ");
            String from = reportSplit[0]; // 신고자
            String to = reportSplit[1]; // 신고 당한자
            map.get(to).add(from);
        }
        
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> send = map.get(id_list[i]);
            if(send.size() >= k) {
                for(String name : send){
                   answer[check.get(name)]++; 
                }
                
            }
        }
        
        return answer;
    }
}