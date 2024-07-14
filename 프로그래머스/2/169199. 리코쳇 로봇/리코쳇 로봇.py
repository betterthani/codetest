from collections import deque
def solution(board):
    # 초기화
    n,m = len(board), len(board[0]) #for문 돌릴 값 초기화
    q = deque() #deque
    visited = [[False] * m for _ in range(n)] # 최단거리 - bfs , 방문 노드
    answer = -1
    directions = [(0,1),(0,-1),(1,0),(-1,0)]#우좌하상

    # r을 찾아서
    for x in range(n) :
        for y in range(m) :
            if board[x][y] == 'R' :
                rx, ry = x, y
                break
    q.append((rx,ry,0))

    # bfs
    while q :
        # q 담은거 꺼내고 꺼낸 값이 G일 경우 answer 에 level(회차) 넣기
        x, y, level = q.popleft()
        if board[x][y] == 'G' :
            answer = level
            break

        # 하나씩 전진
        for dx,dy in directions :
            nx, ny = x, y #독립적으로 움직이기 위해 초기화
            while True :
                nx += dx
                ny += dy
                if nx < 0 or nx >= n or ny < 0 or ny >= m or board[nx][ny] == 'D' : # 끝에 도달했을 경우
                    nx -= dx
                    ny -= dy
                    break
                
            if visited[nx][ny] == False :
                visited[nx][ny] = True
                q.append((nx,ny,level+1))
    return answer