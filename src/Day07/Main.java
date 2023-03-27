package Day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static boolean visited[];
	static ArrayList<Integer> A[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		
		A = new ArrayList[n+1];
		for(int i = 1; i < n+1; i++) {
			A[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i = 1; i < n+1; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[n+1];
		DFS(v);
		System.out.println();
		
		visited = new boolean[n+1];
		BFS(v);
		System.out.println();
		
	}

	private static void BFS(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		visited[node] = true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			System.out.print(now + " ");
			
			for(int i : A[now]) {
				if(!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}

	private static void DFS(int node) {
		System.out.print(node + " ");
		visited[node] = true;
		
		for(int i : A[node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}
}
