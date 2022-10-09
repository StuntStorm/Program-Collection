
"""
A simple programme to check if a number is a power of 2
"""


def isPowerofTwo(n):

    return (n != 0) and ((n & (n - 1)) == 0)


if __name__ == "__main__":

    # Function call
    if isPowerofTwo(30):
        print("Yes")
    else:
        print("No")

    if isPowerofTwo(128):
        print("Yes")
    else:
        print("No")
