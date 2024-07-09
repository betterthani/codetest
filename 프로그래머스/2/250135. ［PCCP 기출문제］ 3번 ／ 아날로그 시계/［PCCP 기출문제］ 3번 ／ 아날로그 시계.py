def solution(h1, m1, s1, h2, m2, s2):
    count = 0
    # 초로 다 변환, 각도 변환
    startTime = h1 * 3600 + m1 * 60 + s1
    endTime = h2 * 3600 + m2 * 60 + s2
    
    # 00시 12시 미리 카운팅
    if startTime == 0 or startTime == 12 * 3600 :
        count += 1
        
    while startTime < endTime :
        # 각도 변환
        h_angle = startTime / 120 % 360 
        m_angle = startTime / 10 % 360
        s_angle = startTime * 6 % 360
        
        h_nextAngle = 360 if (startTime+1) / 120 % 360 == 0 else (startTime+1) / 120 % 360
        m_nextAngle = 360 if (startTime+1) / 10 % 360 == 0 else (startTime+1) / 10 % 360
        s_nextAngle = 360 if (startTime+1) * 6 % 360 == 0 else (startTime+1) * 6 % 360
        
        # 초침이 시침보다 앞에 있을 경우 와 다음 초침이 다음 시침보다 크거나 같을 경우 
        if s_angle < h_angle and s_nextAngle >= h_nextAngle :
            count += 1
        if s_angle < m_angle and s_nextAngle >= m_nextAngle :
            count+= 1
        # 시, 분, 초침이 모두 겹침 -> 중복 방지 -1
        if s_nextAngle == h_nextAngle and h_nextAngle == m_nextAngle :
            count -= 1
            
        startTime += 1
        
    return count
            