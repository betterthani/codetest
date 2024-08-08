def solution(people, limit):
    answer = 0
    people.sort()
    left, right, check = 0, len(people) - 1, 0
    while left <= right:
        if left == right :
            answer += 1
            break
        elif people[left] + people[right] > limit :
            right -= 1
            answer += 1
        else:
            answer += 1
            left += 1
            right -= 1
            check += 1

    # if check == 0 :
    #     answer += 1

    return answer