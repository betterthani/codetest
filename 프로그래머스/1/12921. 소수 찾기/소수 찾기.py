import math
def solution(n):
    answer = 0
    
    isPrime = [True] * (n+1) # 전부 소수라고 생각하는 배열
    
    for i in range(2, int(math.sqrt(n))+1) :
        if isPrime[i] :
            # 소수일 경우
            for j in range(i*i, n+1, i) :
                isPrime[j] = False # 소수일 경우 그의 배수들은 전부 소수가 아님
                
    for i in range(2, n+1) :
        if isPrime[i] :
            answer += 1

    return answer