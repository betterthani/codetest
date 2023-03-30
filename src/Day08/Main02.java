package Day08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main02 {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		int k = 2;
		int[] answer = new int[id_list.length];
		
		// key 유저 아이디, value 신고한 유저의 아이디의 Set을 가진 Map -> 동일 유저 신고 횟수 1로 처리 중복 없애기 위해 set
		Map<String, HashSet<String>> map = new HashMap<>();
		Map<String, Integer> idxMap = new HashMap<>();
		
		// map초기화
		for (int i = 0; i < id_list.length; i++) {
			String name = id_list[i];
			map.put(name, new HashSet<>());
			idxMap.put(name, i);
		}
		
		// 신고자 id, 신고한 id 를 split() 함수 이용 구분하고 map에 저장
		for (String s : report) {
			String[] str = s.split(" ");
			String from = str[0];
			String to = str[1];
			map.get(to).add(from);
		}
		
		// 이용 정지된 유저에 대해 해당 유저를 신고한 id에 메일이 몇번 전송됐는지 파악
		// map을 순회하여 set마다 사이즈가 2이상인지 확인 idxMap에 맞게끔 누적값 1 증가
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> send = map.get(id_list[i]);
			if (send.size() >= k) {
				for (String name : send) {
					answer[idxMap.get(name)]++;
				}
		    }
		}
		for(int i =0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
