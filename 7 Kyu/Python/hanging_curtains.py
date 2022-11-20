# https://www.codewars.com/kata/5d532b1893309000125cc43d
def number_of_hooks(length,max_hook_dist):
    init_length = length
    while length > max_hook_dist:
        length /= 2
    return init_length / length + 1