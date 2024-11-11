import collections
def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)
    
    # counter의 key반환
    return list(answer.keys())[0]