//write the program for tower of hanoi
#include<stdio.h>
void towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod){
    if(n==1){
        printf("move disk 1 from %c to %c\n",from_rod,to_rod);
        return;
    }
    towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
    printf("move disk %d from %c to %c\n",n,from_rod,to_rod);
    towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
}
void main(){
    int n;
    printf("enter the number of disks\n");
    scanf("%d",&n);
    towerOfHanoi(n,'A','C','B');
}