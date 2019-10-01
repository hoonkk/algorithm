# 백준 알고리즘 2920번 : 음계(56.236%)

list = input().split()
prev = int(list[0])
ascStack = 0
decStack = 0
for i in list[1:]: # 맨 첫번째 인덱스는 건너뛰고 시작
    if prev+1==int(i):
        ascStack += 1
    elif prev-1==int(i):
        decStack += 1
    prev = int(i)

if ascStack==len(list)-1:
    print('ascending')
elif decStack==len(list)-1:
    print('descending')
else:
    print('mixed')


