# 백준 알고리즘 1924번: 2007년

mon, day = map(int, input().split())
time = 0
dayList =[31,28,31,30,31,30,31,31,30,31,30,31]
for i in range(mon-1):
    time += dayList[i]
time += day

if time%7 == 1:
    print("MON")
elif time%7 == 2:
    print("TUE")
elif time%7 == 3:
    print("WED")
elif time%7 == 4:
    print("THU")
elif time%7 == 5:
    print("FRI")
elif time%7 == 6:
    print("SAT")
elif time%7 == 0:
    print("SUN")

