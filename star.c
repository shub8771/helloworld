#include<stdio.h>
#include <unistd.h>
void delayMicroseconds(unsigned int microseconds)
{
    usleep(microseconds);
}
void main()
{
    int i,j;
    for(i=1;i<=5;i++)
    {
        for(j=i;j>=1;j--)
        {
            printf("*");
        }
        delayMicroseconds(1000000);
        printf("\n");
    }
}