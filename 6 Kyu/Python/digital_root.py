def digital_root(n):
    if n == 0:
        return n
    else:
        s = digital_root(n/10) + n%10
        while(s > 9):
            s = digital_root(s/10) + s%10
        return s