
str=input("original string:")
res=" "
for i in range(len(str)):
    if i%2==0:
      res=res+res[str]
print("new string",res)
