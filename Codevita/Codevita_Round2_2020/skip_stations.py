# Public cases: All passed
# Private cases: All passed

t = int(input())
n = []
for i in range(t):
    n = int(input())

    if n ==0:
        print(1)

    elif n == 1:
        print(2)

    elif n == 2:
        print(4)

    else:
        ways =[]
        ways = [0] * (n + 1)
        ways[0] = 1
        ways[1] = 2
        ways[2] = 4

        for i in range(3, n + 1):
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3]

        print(ways[n])


    
