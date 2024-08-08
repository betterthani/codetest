from collections import deque


def solution(number, k):
    answer = ''
    d = deque()
    i = 0
    length = len(number)-k

    for i in range(len(number)) :
        if len(d) < 1 :
            d.append(number[i])
        else :
            j = -1
            while d and k != 0 :
                n = number[i]
                if d[j] < number[i] :
                    d.pop()
                    k -= 1
                else :
                    break
            d.append(number[i])

    answer = ''.join(d)

    answer= answer[0:length]
    return answer