# https://www.codewars.com/kata/586bca7fa44cfc833e00005c
def create_array_of_tiers(n):
    return [str(n)[0:i] for i in range(1, len(str(n)) + 1)]