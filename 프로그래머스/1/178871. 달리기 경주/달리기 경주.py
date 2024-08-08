def solution(players, callings):
    rank = {}

    for idx, player in enumerate(players):
        rank[player] = idx
        
    #print(f'rank : ', rank)
        
    for calling in callings:
        if calling in rank.keys():
            rank[calling] -= 1 # 값 변경
            #print(rank)
            
            # 값 변경된 등수의 원래 이름 찾기ㅏ
            name = players[rank[calling]]
            #print(name)
            # 원래 등수였던 사람 등수 낮추기
            rank[name] += 1
            
            # players 배열 순서 swap
            players[rank[name]], players[rank[calling]] = players[rank[calling]], players[rank[name]]
            #print(f'swap : ' , players)
            
        
    return players