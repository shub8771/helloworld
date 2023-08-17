#include<stdio.h>
#include<time.h>
#include <unistd.h>

void delayMicroseconds(unsigned int microseconds)
{
    usleep(microseconds);
}
void selectionSort(int arr[],int n){
    int min,i,j,temp;
    for(i=0;i<n-1;i++)
    {
        min=i;
        for(j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
}
void main()
{
    int n,arr[10],i;
    clock_t st,et;
    double time_taken;
    printf("enter the number of elements\n");
    scanf("%d",&n);
    printf("enter the elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    st=clock();
    selectionSort(arr,n);
    et=clock();
    printf("the elements are\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
        // delay(200);
        delayMicroseconds(1000000);
    }
    time_taken=((double)(et-st)/CLOCKS_PER_SEC)*1000;
    printf("\nthe time taken is %0.f\n",time_taken);
}