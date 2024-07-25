def solution(keymap, targets):
    answer = []
    keysDic = {}
    
    for keys in keymap :
        count = 0
        for idx, key in enumerate(keys) :
            if key in keysDic :
                # key-value exist
                keysDic[key] = min(idx+1, keysDic[key])
            else :
                keysDic[key] = idx+1
    
    for idx, target in enumerate(targets) :
        sum = 0
        for word in target :
            sum  += keysDic.get(word, -1)
        answer.append(sum)
    return answer