def maxprofit(price):
    minp = float('inf')
    maxp = 0
    for i in price:
        minp = min(i,minp)
        profit = i - minp
        maxp = max(profit,maxp)
    return maxp
price = [7,1,5,3,6,4]
print(maxprofit(price))