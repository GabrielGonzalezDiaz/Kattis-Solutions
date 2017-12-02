num = int(input())

list = [int(x) for x in raw_input().split()]

checked = 0

list.sort()


for i in range(num-2):
  if(list[i] + list[i+1] > list[i+2]):
    print 'possible'
    checked = 6
    break
  
if checked == 0:
  print 'impossible'
