def solution(absolutes, signs):
    answer = 0
    for i in range(0, len(absolutes)) :
        if signs[i] == True :
            # 양수일 경우
            answer += absolutes[i]
        else :
            # 음수일 경우
            answer -= absolutes[i]
    return answer