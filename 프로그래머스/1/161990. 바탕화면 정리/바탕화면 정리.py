def solution(wallpaper):
    answer = []

    # #를 찾은 변수 - i에서 가장 먼저 나온 아이 , j 에서 가장 먼저 나온 아이
    # 행 열 개수
    n, m = len(wallpaper), len(wallpaper[0])
    print(n,m)

    for i in range(n) :
        for j in range(m) :
            if wallpaper[i][j] == '#' :
                answer.append((i, j))

    answer.sort(key= lambda x : (x[0]))
    fist_x, last_x = answer[0][0], answer[-1][0]+1
    answer.sort(key=lambda x : (x[1]))
    fist_y, last_y = answer[0][1], answer[-1][1]+1

    result = [fist_x, fist_y, last_x, last_y]

    return result