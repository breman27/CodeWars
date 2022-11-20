# https://www.codewars.com/kata/5f0ed36164f2bc00283aed07
import math

def over_the_road(address, n):
    place = math.floor(address / 2)
    if(address % 2 == 1):
        return n * 2 - place * 2
    else:
        return n * 2 + 1 - place * 2