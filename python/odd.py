print("enter a string:")
str=input("original string:")
res=" "
for i in range(len(str)):
    if (i%2==0):
      res=res+str[i]
print("new string:",res)
