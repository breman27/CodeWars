module ConvertBoolean
    export bool_to_word
    function bool_to_word(boolean::Bool)::String
      boolean ? "Yes" : "No"
      end
end