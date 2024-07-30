from collections import deque
def solution(board, moves):
    answer = 0
    d = deque()
    n = len(board)

    for i in moves:
        for j in range(n) :
            if board[j][i-1] != 0 :
                # stack의 맨 뒤에있던 아이와 새로 들어올 아이가 같을 경우
                if len(d) != 0 and d[-1] == board[j][i-1] :
                    # count 세어주고 기존의 stack위에 있던거 꺼내기
                    answer += 1
                    d.pop()
                else :
                    # stack 에 넣기
                    d.append(board[j][i-1])

                # 기존에 있던 배열에 값은 0으로 초기화
                board[j][i-1] = 0
                break

    return answer *2