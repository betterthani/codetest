def solution(ingredient):
    count = 0
    i = 0
    while i <= len(ingredient) - 4:
        if ingredient[i:i+4] == [1, 2, 3, 1]:
            count += 1
            del ingredient[i : i+4]
            #i = 0 # 인덱스 초기화 -> 시간 초과
            i = max(i-4, 0)
        else:
            i += 1
    return count
