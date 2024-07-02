def solution(x):    
    digit_sum = list(map(int, str(x)))
    # 자릿수 합
    digit_sum = sum(digit_sum)
    
    if x % digit_sum == 0 :
        return True
    else :
        return False