curr = int(input())
end = int(input())

direct = abs(end - curr)
cc = 360 - abs(direct)

if direct > cc:
    if cc == 180:
        print 180
    if curr < end:
        print - cc
    else:
        print cc
else:
    if direct == 180:
        print 180
    elif curr > end:
        print -direct
    else:
        print direct


