def solution(s):
    firstWord = s[0]
    first, last, result = 0, 0, 0

    for idx, word in enumerate(s):

        # 첫번째 문자와 같을 경우
        if firstWord == word:
            first += 1
        else:
            last += 1

        if first == last:
            result += 1
            if (idx + 1) < len(s):
                firstWord = s[idx + 1]
            first, last = 0,0
    if first != 0 or last != 0 :
        result += 1

    return result