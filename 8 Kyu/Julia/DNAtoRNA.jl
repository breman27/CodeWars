"""
# module DNAtoRNA

- Julia version:
- Author: brett
- Date: 2022-11-20

# Examples

```jldoctest
julia>
```
"""
module DNAtoRNA
    function dnatorna(dna::String)
        replace(dna, 'T' => 'U')
        end
end