from collections import deque

N, K = map(int, input().split())

q = deque(range(1, N+1))
answer = []

while q:
    q.rotate(-(K-1))
    answer.append(str(q.popleft()))
print("<"+", ".join(answer) + ">")

