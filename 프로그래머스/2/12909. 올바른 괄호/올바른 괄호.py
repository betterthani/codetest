def solution(s):
    answer = True
    
    stack = []
    
    for i in s :
        if i == '(' :
            stack.append('(')
        else :
            if stack == [] :
                # stack 이 비어있을 경우
                return False
            else :
                # ')'로 들어갈 경우
                stack.pop() # '(' 빼내기
    if stack != [] :
        # stack이 비어있지 않을 때 -> 짝이 맞지 않을 때
        return False
    else :
        return True
        
        