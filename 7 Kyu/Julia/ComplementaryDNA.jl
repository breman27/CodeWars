"""
# module ComplementaryDNA

# https://www.codewars.com/kata/554e4a2f232cdd87d9000038
- Julia version: 
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module ComplementaryDNA
    function dnastrand(dna)
        subs = Dict("A" => "T", "T" => "A", "C" => "G", "G" => "C")
        replace(dna, r"A|T|C|G" => s -> subs[s])
        end
end