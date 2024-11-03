def solution(array, commands):
    answer = []
    for command in commands :
        sliced_arrSort = sorted(array[command[0]-1 : command[1]])
        answer.append(sliced_arrSort[command[2]-1])
        
        
        
    return answer