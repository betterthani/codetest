def solution(n, times):
    left, right = 1, max(times) * n
    
    answer = right
    
    while left <= right :
        mid = (left + right) // 2
        
        people = sum(mid // time for time in times)
        
        if people >= n :
            # 인원수보다 합산이 많을 경우 범위 폭 줄이기
            answer = mid
            right = mid - 1
        else :
            left = mid + 1

    return answer