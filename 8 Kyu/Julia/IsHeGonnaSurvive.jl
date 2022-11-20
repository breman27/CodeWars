"""
# module IsHeGonnaSurvive

# https://www.codewars.com/kata/59ca8246d751df55cc00014c
- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module IsHeGonnaSurvive
    function hero(bullets, dragons)
        bullets / dragons ≥ 2
        end
end