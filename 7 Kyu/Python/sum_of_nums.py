def get_sum(a,b):
    s = 0
    
    #Returns a arbitrarily when both a and b are equal
    if(a == b):
        return a
    else:
        #Sum through the range of a and b inclusively
        for i in range(min(a,b), max(a,b)+1):
            s += i
    return s