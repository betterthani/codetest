from collections import deque
def solution(s):
    d = deque()
    
    for i in s :
        if i == '(' :
            d.append(i)
        else :
            if len(d) == 0 :
                return False
            else :
                d.pop()
        
    if len(d) == 0 :
        return True
    else :
        return False
        