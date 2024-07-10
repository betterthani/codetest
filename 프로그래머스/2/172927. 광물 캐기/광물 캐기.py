def solution(picks, minerals):
    answer = 0
    mineralSort = []
    
    # 최소 광물 개수 구하기
    ableAmount = min(sum(picks)*5, len(minerals))
    diaCnt, ironCnt, stoneCnt = 0,0,0
    
    # 광물들 개수 구하기
    for i in range(ableAmount) :
        if minerals[i] == 'diamond' :
            diaCnt += 1
        elif minerals[i] == 'iron' :
            ironCnt += 1
        else :
            stoneCnt += 1
    
        # 5개씩 끊어서 넣어주기-> 5의 배수이거나 ableAmount -1 즉 마지막 그룹 도달
        if (i+1) % 5 == 0 or i == ableAmount -1 :
            mineralSort.append((diaCnt, ironCnt, stoneCnt))
            diaCnt, ironCnt, stoneCnt = 0,0,0
    
    # 최대 효율을 위해 sort하기, 다이아몬드, 철, 돌 순으로 높은거 정렬
    mineralSort.sort(key = lambda x : (x[0], x[1], x[2]), reverse=True)
    
    # 피로도
    i = 0
    for diaCnt, ironCnt, stoneCnt in mineralSort :
        # 해당 등급 없으면 다음 등급
        while picks[i] == 0 :
            i += 1
            
        # 피로도 계산
        if i == 0 :
            # 다이아몬드곡괭이일 경우
            answer += (diaCnt + ironCnt + stoneCnt)
        elif i == 1 :
            answer += (diaCnt*5 + ironCnt + stoneCnt)
        else :
            answer += (diaCnt*25 + ironCnt*5 + stoneCnt)
        
        # 다 되면 곡괭이 빼기
        picks[i] -= 1
        
    return answer
            