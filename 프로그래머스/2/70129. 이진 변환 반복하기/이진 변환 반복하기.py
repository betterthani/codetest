def solution(s):
    zero_len,count = 0,0
    while s != '1' :
        count+=1 # 순환 count
        
        num = len(s) # 전체 길이
        s = s.count('1')*'1' # 1로 정렬
        zero_len += num - len(s) # 전체길이 - 1의 개수 = 0의 개수
        s = len(s)
        s = bin(s)[2:] # 이진변환 후 0b자른 뒤의 배열
    
    return [count, zero_len]