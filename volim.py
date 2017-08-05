players = ['1', '2', '3', '4', '5', '6', '7', '8']

starter = int(input()) - 1

questions = int(input())

time = 210

for i in range(questions):
    info = raw_input().split()
    used = int(info[0])
    ans = str(info[1])
    time -= used
    if time < 0:
        break
    if ans == "T":
        starter += 1

print players[starter % 8]
