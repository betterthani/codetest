import math
def solution(n):
    answer = []
    length = int(math.sqrt(n)) + 1
    
    for i in range(1, length) :
        if n % i == 0 :
            # 약수일 경우
            answer.append(i)
            if i < n//i :
                # 1 < 12/1=12 도 약수이므로
                answer.append(n//i)
    return sum(answer)