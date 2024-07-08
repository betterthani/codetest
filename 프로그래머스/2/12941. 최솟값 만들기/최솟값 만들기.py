def solution(A,B):
    # A 오름차순, B 내림차순
    A.sort()
    B.sort(reverse=True)
    
    # 누적합
    sum = 0
    for a, b in zip(A, B) :
        num = a * b
        sum += num
    return sum
    