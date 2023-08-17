#include<stdio.h>
#include<time.h>
int binarySearch(int arr[],int n,int key){
    int low=0,high=n-1,mid;
    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}
void main()
{
    int n, i, key, arr[10];
    clock_t st, et;
    double time_taken;
    printf("enter the size of the array\n");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("enter the key element\n");
    scanf("%d", &key);
    st = clock();
    int res = binarySearch(arr, n, key);
    et = clock();
    time_taken = ((double)(et - st) / CLOCKS_PER_SEC) * 1000;
    if (res == -1)
    {
        printf("element not found\n");
    }
    else
    {
        printf("element found at %d\n", res);
        printf("time_taken by the exection is %0.f", time_taken);
    }
}