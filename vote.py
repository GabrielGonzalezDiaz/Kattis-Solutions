cases = int(input())

for i in range(cases):
    ppl = int(input())
    votes = []
    for j in range(ppl):
        votes.append(int(input()))
    s = votes[:]
    s.sort()
    winner = s[len(votes) - 1]
    if winner == s[len(votes) - 2]:
        print "no winner"
    elif winner > sum(s) - winner:
        print "majority winner " + str(votes.index(winner) + 1)
    else:
        print "minority winner " + str(votes.index(winner) + 1)
