# https://www.codewars.com/kata/56269eb78ad2e4ced1000013
import math

def find_next_square(sq):
    if(math.sqrt(sq) % 1 == 0): return (math.sqrt(sq) + 1) ** 2
    else: return -1