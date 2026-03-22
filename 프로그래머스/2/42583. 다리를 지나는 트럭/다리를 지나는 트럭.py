from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    
    dq = deque([0] * bridge_length)
    onBriW = 0
        
    for i in truck_weights:    
        onBriW -= dq.popleft()      
        
        while (onBriW + i) > weight:       
            answer += 1
            dq.append(0)
            onBriW -= dq.popleft()
        
        dq.append(i)        
        onBriW += i     
        answer += 1  
    
    return answer + bridge_length