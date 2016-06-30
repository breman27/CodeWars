def nb_year(p0, percent, aug, p):
    result = 0
    population = p0
    while population < p:
        population = population + population * percent/100 + aug
        result += 1
    return result