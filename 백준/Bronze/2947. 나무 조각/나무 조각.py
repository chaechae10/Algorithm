# 버블정렬을 이용하며 ,오름차순으로 정렬하며 스왑 발생 시다 현재 상태 출력 
input = list(map(int,input().split()))
answer = [1,2,3,4,5]

while 1 : 
    for i in range(len(input)-1) :
        if(input[i] > input[i+1]) :
            input[i],input[i+1] = input[i+1],input[i]
            print(" ".join(map(str,input)))

    if (input == answer) : 
        break