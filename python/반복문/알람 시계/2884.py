# 백준 알고리즘 2884번 : 알람 시계(43.375%)

hour, min = map(int, input().split())
time = hour * 60 + min
time -= 45
if(time < 0):
    time+=1440
print(int(time/60), int(time%60))
