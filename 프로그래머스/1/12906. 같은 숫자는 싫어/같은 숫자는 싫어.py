from collections import deque
def solution(arr):
    d = deque()

    for idx, i in enumerate(arr) :
        d.append(i)

        if len(d) != 0 and idx+1 < len(arr):
            if d[-1] == arr[idx+1] :
                d.pop()
    return list(map(int, d))