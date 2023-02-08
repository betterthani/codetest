package Day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] a= new int[N];
		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(a, 0, N-1, K-1);
	}
	
	// 퀵 소트 함수
	private static void quickSort(int[] a, int s, int e, int k) {
		if(s < e) {
			int pivot = partiton(a,s,e);
			if(pivot == k) { // k번째 수가 pivot이면 더이상 구할 필요 없음
				return;
			} else if (k < pivot) { // k가 pivot보다 작으면 왼쪽 그룹만 정렬 수행
				quickSort(a, s, pivot-1, k);
			} else { // k가 pivot보다 크면 오른쪽 그룹만 정렬 수행하기
				quickSort(a, pivot+1, e, k);
			}
		}
	}

	// 피벗구하기 함수
	private static int partiton(int[] a, int s, int e) {
		if(s + 1 == e) {
			if(a[s] > a[e]) {
				swap(a,s,e);
			}
			return e;
		}
		
		int m = s+e / 2;
		swap(a,s,m);
		int pivot = a[s];
		int i = s+1;
		int j = e;
		while(i <= j) {
			while(pivot < a[j] && j > 0) {
				j--;
			}
			
			while(pivot > a[i] && i < a.length-1) {
				i++;
			}
			
			if(i <= j) {
				swap(a,i++,j--);
			}
		}
		
		a[s] = a[j];
		a[j] = pivot;
		return j;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
