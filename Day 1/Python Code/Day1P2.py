import numpy as np
import string

#Opens input data file
from Tools.scripts.treesync import compare

f = open('Inputs', 'r')

#List used for storing data from file
lists = []

#Parses the file and adds to the storage list
for i in range(1000):
    lists.append(f.readline())
f.close()

for index, this in enumerate(lists):
    for that in lists[index+1:]:
        compare(this + that, that + this)

