import math
import os
import random
import re
import sys
def getTotalX(a, b):
    count = 0
    A = max(a)
    B = min(b)
    for num in range(A, B + 1):
        l=[]
        check=True
        for A in a:
            if num%A !=0:
                check=False    
        for B in b:
            if B%num !=0:
                check=False
        if check:
            count+=1     
    return count
if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()
    n = int(first_multiple_input[0])
    m = int(first_multiple_input[1])
    arr = list(map(int, input().rstrip().split()))
    brr = list(map(int, input().rstrip().split()))
    total = getTotalX(arr, brr)
    print(str(total) + '\n')