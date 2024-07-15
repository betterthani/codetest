from collections import Counter
def solution(topping):
    topping_count = Counter(topping) #  left
    topping_set = set() # right
    answer = 0
    
    for i in topping :
        topping_count[i] -= 1 # left 지우기
        topping_set.add(i) # right 넣어주기
        if topping_count[i] == 0 :
            # 한개도 없을 경우 -> 빼버리기
            topping_count.pop(i) 
        #왼 오 길이 맞을 경우 answer 증가
        if len(topping_count) == len(topping_set) :
            answer += 1
    return answer
    