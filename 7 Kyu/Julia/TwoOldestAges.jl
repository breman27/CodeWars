"""
# module TwoOldestAges

# https://www.codewars.com/kata/511f11d355fe575d2c000001
- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module TwoOldestAges
    # return the two oldest ages within the array of ages passed in.
    function twooldestages(ages)
        sort(ages)[end-1:end]
        end
end