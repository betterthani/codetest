import re
def solution(new_id):
    # 1단계
    new_id = new_id.lower()
    # 2단계 알파벳 소문자, 숫자, (-), 밑줄, 마침표 제거
    new_id = re.sub('[^a-z0-9-_.]', '', new_id)
    
    # 3단계
    new_id = re.sub('[.]{2,}','.',new_id)
    
    # 4단계
    new_id = re.sub('^[.]|[.]$', '', new_id)
    
    # 5단계
    if len(new_id) == 0 :
        new_id = 'a'
    # 6단계
    if len(new_id) >= 16 :
        new_id = new_id[:15]
        new_id = re.sub('[.]$', '',new_id)
    
    # 7단계
    if len(new_id) <= 2 :
        lastword = new_id[-1]
        
        while len(new_id) < 3 :
            new_id += lastword
        
    return new_id