def time_to_minutes(time):
    h, m = map(int, time.split(':'))
    return h * 60 + m

def solution(book_time):
    roomArr = [[] for _ in range(len(book_time))]  # 방 배열 선언
    n = len(book_time)  # 행 길이
    book_time.sort(key=lambda x: x[0])  # 시작 시간 오름 차순 정렬
    visited = [False] * n

    k = 0
    for i in range(n):
        if visited[i]:
            continue
        start_time = time_to_minutes(book_time[i][0])
        end_time = time_to_minutes(book_time[i][1])
        roomArr[k].append([start_time, end_time])
        visited[i] = True
        for j in range(i + 1, n):
            next_start_time = time_to_minutes(book_time[j][0])
            next_end_time = time_to_minutes(book_time[j][1])
            if end_time + 10 <= next_start_time and not visited[j]:
                roomArr[k].append([next_start_time, next_end_time])
                visited[j] = True
                end_time = next_end_time
        k += 1

    answer = k  # 사용된 방의 수
    print(answer)
    return answer
