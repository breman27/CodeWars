"""
 # https://www.codewars.com/kata/53369039d7ab3ac506000467
"""
module ConvertBoolean
    export bool_to_word
    function bool_to_word(boolean::Bool)::String
      boolean ? "Yes" : "No"
      end
end