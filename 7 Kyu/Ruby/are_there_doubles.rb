def double_check(str)
  str.downcase.split("").each_cons(2) do |i, j|
    return true if i == j
  end
  return false
end