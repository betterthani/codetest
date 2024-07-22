def solution(ingredient): 
    count, i = 0,0
    while i < len(ingredient) - 3 :
        if ingredient[i:i+4] == [1,2,3,1] :
            count += 1
            del ingredient[i:i+4]
            i = max(i-3, 0)
        else :
            i += 1
    return count