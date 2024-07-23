def solution(k, m, score):
    # 내림차순
    score.sort(reverse=True)
    # 상자 개수
    boxCount = len(score) // m
    # 합계
    amount = 0

    for i in range(boxCount):
        applBox = score[i*m : (i+1)*m]
        min_score = min(applBox)
        amount += min_score * m
    return amount
