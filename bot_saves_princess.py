def displayPathtoPrincess(n, grid):
    # print all the moves here
    indexOfM = [0, 0]
    indexOfP = [0, 0]
    for i in range(n):
        grid[i] = list(grid[i])
        try:
            indexOfM = [i, grid[i].index('m')]
        except:
            pass
        try:
            indexOfP = [i, grid[i].index('p')]
        except:
            pass
    # print("Splitted")
    # print(grid)
    # print(indexOfM)
    # print(indexOfP)
    up = indexOfP[0]-indexOfM[0]
    lr = indexOfP[1]-indexOfM[1]

    for i in range(abs(up)):
        if(up > 0):
            print("DOWN")
        else:
            print("UP")

    for i in range(abs(lr)):
        if(lr > 0):
            print("RIGHT")
        else:
            print("LEFT")


m = int(input())
grid = []
for i in range(0, m):
    grid.append(input().strip())

displayPathtoPrincess(m, grid)