def subset_sum(numbers, target, partial=[]):
    s = sum(partial)

    if s == target and len(partial) == 7:
        for q in range(7):
            print partial[q]
        return
    if s >= target:
        return

    for i in range(len(numbers)):
        n = numbers[i]
        remaining = numbers[i+1:]
        subset_sum(remaining, target, partial + [n])

ppl = []

for j in range(9):
    ppl.append(int(input()))

subset_sum(ppl, 100)



