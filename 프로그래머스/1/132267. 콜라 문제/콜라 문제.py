def solution(a, b, n):
    answer = 0

    while n >= a :
        new_cola = (n // a) * b
        # 교환 후 나머지 콜라 개수
        n = (n % a) + new_cola
        answer += new_cola
    return answer