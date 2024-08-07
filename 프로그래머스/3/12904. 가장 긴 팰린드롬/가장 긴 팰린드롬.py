def expand(s, left, right) :
    while left >= 0 and right < len(s) and s[left] == s[right] :
        left -= 1
        right += 1
    return right - left -1

def solution(s):
    if not s :
        return 0
    
    start, end = 0,0
    for i in range(len(s)):
        len1 = expand(s, i, i) # 홀
        len2 = expand(s, i, i+1) # 짝
        
        max_len = max(len1, len2)
        
        if max_len > end - start :
            start = i - (max_len -1) //2
            end = i + max_len // 2
    return end - start + 1