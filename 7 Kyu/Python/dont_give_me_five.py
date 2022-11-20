# https://www.codewars.com/kata/5813d19765d81c592200001a
def dont_give_me_five(start,end):
    return len(list(filter(lambda x: '5' not in str(x), range(start, end+1))))