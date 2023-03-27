package Day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz02 {
	static ArrayList<Integer> A[];
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		A = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}

		for (int i = 1; i < n + 1; i++) {
			Collections.sort(A[i]);
		}

		visited = new boolean[n + 1];
		DFS(v);
		System.out.println();

		visited = new boolean[n + 1];
		BFS(v);
		System.out.println();

	}

	private static void BFS(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		visited[node] = true;

		while (!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			for (int i : A[now]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}

	private static void DFS(int node) {
		System.out.print(node + " ");
		visited[node] = true;
		for (int i : A[node]) {
			if (!visited[i]) {
				DFS(i);
			}
		}

	}

}
