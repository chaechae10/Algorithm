for _ in range(int(input())):
    s, stack = input(), []
    for c in s:
        if c == '(':
            stack.append(c)
        elif stack:
            stack.pop()
        else:
            stack = ['x']
            break
    print('YES' if not stack else 'NO')