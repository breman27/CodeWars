def find_missing_numbers(arr)
  ret = Array.new
  if arr.any?
    (arr.min..arr.max).each{|index| ret.push(index) if not arr.include? index}
  end
  return ret
end