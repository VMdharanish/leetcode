class solution:
    def twosum_hashing(self,array,target):
        hashtable = {}
        for i in range(len(array)):
            a = target - array[i]
            if a in hashtable:
                return [hashtable[a],i]
            hashtable[array[i]] = i
sol = solution()
target = 9
array = [2,7,11,15]
print(sol.twosum_hashing(array,target))