-- https://www.codewars.com/kata/58bf9bd943fadb2a980000a7
module WhoIsPaying where

whoIsPaying :: String -> [String]
whoIsPaying n = if length n <= 2 then [n] else [n, take 2 n]