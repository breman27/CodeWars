def total_licks(env):
    licks = 252
    if env:
        licks += sum(elem for elem in env.values())
        bad_weather = max(env.values())
        challenge = max(env, key=env.get)
        if challenge and bad_weather > 0:
            return "It took %d licks to get to the tootsie roll center of a tootsie pop. The toughest challenge was %s." % (licks, challenge)
        
    return "It took %d licks to get to the tootsie roll center of a tootsie pop." % licks