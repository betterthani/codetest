def solution(lottos, win_nums):
    answer = []
    zero, cnt = 0, 0
    
    if sum(lottos) == 0 :
        answer = answer+[1,6]
        return answer
    else :
        for lotto in lottos :
            if lotto == 0 :
                zero += 1
                continue
            for num in win_nums :
                if lotto == num :
                    cnt += 1
                    
        num = cnt + zero
        print(f'cnt: ', cnt, 'zero : ', zero, 'num : ', num)
                  
        if num == 6 :
            answer.append(1)
        elif num == 5 :
            answer.append(2)
        elif num == 4 :
            answer.append(3)
        elif num == 3 :
            answer.append(4)
        elif num == 2  :
            answer.append(5)
        else :
            answer.append(6)
            
        if cnt == 6:
            answer.append(1)
        elif cnt == 5:
            answer.append(2)
        elif cnt == 4:
            answer.append(3)
        elif cnt == 3:
            answer.append(4)
        elif cnt == 2 :
            answer.append(5)
        else :
            answer.append(6)
    return answer