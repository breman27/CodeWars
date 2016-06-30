def mxdiflg(a1, a2):
    if not a1 or not a2: return -1
    return max(abs(len(max(a2, key=len)) - len(min(a1, key=len))),
                abs(len(max(a1, key=len)) - len(min(a2, key=len))))