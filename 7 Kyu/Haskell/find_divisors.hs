module Divisors where

divisors :: Integral a => a -> Int
divisors x = length [i | i <- [1..(x)], x `rem` i == 0]