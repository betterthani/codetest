from collections import deque
def solution(maps):
    max_value = -1
    # 상하좌우
    # dx = [1, -1, 0, 0]
    # dy = [0, 0, -1, 1]
    locations = [(1,0), (-1,0), (0,-1), (0,1)]
    n, m = len(maps), len(maps[0])
    d = deque()
    d.append((0, 0))  # 0,0 좌표 넣기
    check = [[False] * m for _ in range(n)]
    check[0][0] = True

    while d:
        x, y = d.popleft()

        for lx, ly in locations:
            nx, ny = x + lx, y + ly

            if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1 and not check[nx][ny]:
                # 이전 위치 값에 1을 더해 최단 거리 갱신
                maps[nx][ny] = maps[x][y] + 1
                check[nx][ny] = True  # 방문 처리
                d.append((nx, ny))

    # 도착 지점의 값이 초기값 그대로라면 도달할 수 없음을 의미
    return maps[n-1][m-1] if maps[n-1][m-1] > 1 else -1