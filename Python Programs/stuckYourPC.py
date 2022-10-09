"""
Programme to make your computer stuck
"""
from itertools import cycle
x = [i for i in range(10)]
for i in cycle(x):
    x.append(i)
