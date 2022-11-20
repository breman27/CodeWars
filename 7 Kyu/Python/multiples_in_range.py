# https://www.codewars.com/kata/583989556754d6f4c700018e
# Python version: return multiples of 2 numbers in a list
def multiples(s1,s2,s3):
    return [x for x in range(1, s3) if(x % s1 == 0 and x % s2 == 0)]