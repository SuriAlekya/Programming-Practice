my_dict={
    "l1":["red","green","yellow","blue"],
    "l2":["violet","dark","pink","white"],
    "l3":["black","queue","beige","aqua"],
    "l4":["aliceblue","cyan","gold","silver"]
}
print("before sorting")
for key,value in my_dict.items():
    print(key+":"+str(value))
sorted_dict={key:sorted(value)for key,value in my_dict.items()}
print("after sorting")
for key,value in sorted_dict.items():
    print(key+":"+str(value))
