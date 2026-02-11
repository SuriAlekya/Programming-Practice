print("enter a string")
str=input("enter a string")
ch=str[0]
str=str.replace(ch,'@')
str=ch+str[1: ]
print("new string:",str)
