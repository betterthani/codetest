from collections import deque

def bfs(start, end, maps):
    result = -1
    d = deque()
    directions = [(1, 0), (-1, 0), (0, -1), (0, 1)]  # 하상좌우
    n, m = len(maps), len(maps[0])
    visited = [[False] * m for _ in range(n)]
    check = 0

    # start 찾기
    for i in range(n):
        for j in range(m):
            if maps[i][j] == start:
                d.append((i, j, 0))
                visited[i][j] = True
                break
        if d :
            break

    while d  :
        x, y, second = d.popleft()
        if maps[x][y] == end :
            return second
        for dx, dy in directions :
            nx = dx + x  # 새로운 좌표 = 하상좌우 + 기존 좌표
            ny = dy + y

            if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]) and maps[nx][ny] != 'X' and visited[nx][ny] == False:
                
                visited[nx][ny] = True
                d.append((nx, ny, second + 1))
        
                
    return -1
def solution(maps) :
    path1 = bfs('S', 'L', maps)
    path2 = bfs('L', "E", maps)
    
    if path1 != -1 and path2 != -1 :
        return path1 + path2
    else :
        return -1