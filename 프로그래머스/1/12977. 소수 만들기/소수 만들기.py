def isPrime(n) :
    if n < 2 :
        return False
    for i in range(2, int(math.sqrt(n))+1) :
        if n % i == 0 :
            return False
    return True

from itertools import combinations
import math
def solution(nums):
    answer = 0
    
    for comb in combinations(nums, 3) :
        if isPrime(sum(comb)) :
            answer += 1
    return answer