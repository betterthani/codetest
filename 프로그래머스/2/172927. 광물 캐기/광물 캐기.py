def solution(picks, minerals):
    answer = 0
    n = min(sum(picks) * 5, len(minerals))  # for문 조건 최솟값
    mineralArr = []
    diaTired, ironTired, stoneTired = 0, 0, 0  # 피로도

    for i in range(n):
        # 피로도 max
        if minerals[i] == 'diamond':
            diaTired += 25
        elif minerals[i] == 'iron':
            ironTired += 5
        else:
            stoneTired += 1
            
        # 5개씩 끊기    
        if (i+1) % 5 == 0 or i == (n - 1):
            mineralArr.append((diaTired, ironTired, stoneTired))
            diaTired, ironTired, stoneTired = 0, 0, 0 # 초기화

    mineralArr.sort(key=lambda x : (x[0], x[1], x[2]), reverse=True)

    # 피로도 계산
    i = 0
    for diaTired, ironTired, stoneTired in mineralArr :
        while picks[i] == 0 :
            i += 1

        if i == 0 :
            answer += ((diaTired//25) + (ironTired //5) + stoneTired)
        elif i == 1 :
            answer += ((diaTired//5) + (ironTired//5) + stoneTired)
        else :
            answer += (diaTired + ironTired + stoneTired)
            
        picks[i] -= 1
    print(answer)
    return answer