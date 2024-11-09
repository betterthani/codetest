def solution(s):
    answer = ''
    s = list(map(int, s.split(sep = ' ')))
    
    minS, maxS = min(s), max(s)
    
    return f'{minS} {maxS}'