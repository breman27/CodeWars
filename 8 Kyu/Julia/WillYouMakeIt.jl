"""
# module WillYouMakeIt

# https://www.codewars.com/kata/5861d28f124b35723e00005e

- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module WillYouMakeIt
    function zerofuel(distancetopump, mpg, fuelleft)
        mpg * fuelleft >= distancetopump
        end
end