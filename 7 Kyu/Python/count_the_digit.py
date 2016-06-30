def nb_dig(n, d):
    square = 0
    result = 0
    for i in range(n+1):
        square = i * i
        result += str(square).count(str(d))
    return result