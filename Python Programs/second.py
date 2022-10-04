list1=eval(input("enter the elements: "))
L=len(list1)

for i in range(0,L):
    element=list1[i]  
    s=0                           
    while list1[i]>0:
        r=list1[i]%10  
        list1[i]=list1[i]//10  
        s=s+r**3 
        

    
    if element==s:
        print("the amstrong numbers among the list are: ",element)

    else:
        print("there are no amstrong numbers in this list")