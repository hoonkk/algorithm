# 백준알고리즘 1110번 : 더하기 사이클(49.339%)


def getTen(num):
    return int(num/10)

def getOne(num):
    return int(num%10)

inputNumber = int(input())
newNumber = inputNumber
stack = 0
while True:
    newNumber = 10 * getOne(newNumber) + getOne(getOne(newNumber)+getTen(newNumber))
    stack+=1
    if newNumber == inputNumber:
        break
print(stack)