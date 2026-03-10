def rotateclockwise(arr, k):
    if k == 0:
        return
    n = len(arr)
    temp = arr[n - 1]
    for i in range(n - 1, 0, -1):
        arr[i] = arr[i - 1]
    arr[0] = temp
    rotateclockwise(arr, k - 1)
if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5, 6]
    k = 2
    rotateclockwise(arr, k)
    for it in arr:
        print(it, end=" ")
