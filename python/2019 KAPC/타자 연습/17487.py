# 백준 알고리즘 17487번: 타자 연습

S = input()

leftHand = ['q','w','e','r','t','y','a','s','d','f','g','z','x','c','v','b']
rightHand = ['u','i','o','p','h','j','k','l','n','m']

left = 0
right = 0
space = 0
capsLock = 0

prev = S[0].islower()

for i in S:
    if i in leftHand or i.lower() in leftHand:
        left+=1
    elif i in rightHand or i.lower() in rightHand:
        right+=1
    if i == ' ':
        space+=1
    elif i.isupper():
        capsLock+=1
    prev = i.islower()

for j in range(space):
    if right<left:
        right+=1
    else:
        left+=1

for k in range(capsLock):
    if right<left:
        right+=1
    else:
        left+=1


print(left, right)


