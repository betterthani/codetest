def solution(food):
    answer = ''
    water = []
    amount = []
    
    for idx, foodCnt in enumerate(food) :
        if idx == 0 :
            water.append(0)
        else :
            for num in range((foodCnt // 2)) :
                amount.append(idx)
    
    amount_reverse = amount.copy()
    amount_reverse.sort(reverse=True)
    
    answer = amount + water + amount_reverse
    answer = ''.join(str(i) for i in answer)
    
    return answer