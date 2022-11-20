"""
# module IsUpperCase

- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module IsUpperCase
    function isupper(str::String)
        all(c -> isuppercase(c) | isspace(c), str)
        end
end