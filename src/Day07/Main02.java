package Day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main02 {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 첫번째 줄
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1]; //0번 사용 안 함
		A = new ArrayList[n+1]; // 시작점에 따른 인접리스트
		for(int i =1; i < n+1; i++) {
			A[i] = new ArrayList<>(); // 시작점에 따른 접점들 초기화
		}
		
		for (int i = 0; i < m; i++) {
			// 인접 리스트 그래프 데이터 저장 -> 방향성이 없다.
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()); // 시작점
			int e = Integer.parseInt(st.nextToken()); // 끝점
			A[s].add(e);
			A[e].add(s);
		}
		
		int count = 0;
		for (int i = 1; i < n+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
		
		
	}

	private static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		for(int i : A[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}

}
