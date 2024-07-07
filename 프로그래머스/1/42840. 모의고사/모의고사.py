def solution(answers):    
    # 수포자의 답 배열
    one = [1,2,3,4,5]
    two = [2,1,2,3,2,4,2,5]
    three = [3,3,1,1,2,2,4,4,5,5]
    
    c1, c2, c3 = 0, 0, 0
    result = []
    
    for idx, num in enumerate(answers) :
        if num == one[idx % 5] : c1 += 1
        if num == two[idx % 8] : c2 += 1
        if num == three[idx % len(three)] : c3 += 1
        
    # 높은 점수 받은 사람이 여럿일 경우 오름차순
    answer = [c1, c2, c3]
    for idx, n in enumerate(answer) :
        if n == max(answer) :
            result.append(idx+1)
    
    result.sort()
        
    return result