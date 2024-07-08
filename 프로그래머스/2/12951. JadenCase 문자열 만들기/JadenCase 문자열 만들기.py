def solution(s):
    answer = list(map(str, s.lower().split(' ')))
    result = []
    
    for word in answer :
        result.append(word.capitalize())
    
    return ' '.join(result)
    