def palindrome_check(a):
    if a.lower() == a.lower()[::-1]:
        print("Palindrome Confirmed")
    else:
        print("Not a Palindrome")

if __name__ == "__main__":
    a = input("Enter first string: ")
    palindrome_check(a)
    
