"""
# module GenerateRange

# https://www.codewars.com/kata/55eca815d0d20962e1000106
- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module GenerateRange
    function generaterange(min, max, step)
        [min:step:max;]
        end
end