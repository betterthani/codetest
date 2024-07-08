def solution(s):
    # 공백 기준으로 자르기
    answer = list(map(int, s.split(sep=' ')))
    
    result = f'{min(answer)} {max(answer)}'
    return result