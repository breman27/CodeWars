from math import sqrt; from itertools import count, islice

def is_prime(num):
  if num is 0 or num is 1:
      return False
  return num > 1 and all(num%i for i in islice(count(2), int(sqrt(num)-1)))