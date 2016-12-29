#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,fact=1;
printf("\n enter the value");
scanf("%d",&n);
for(i=2;i<=n;i++)
{
fact=fact*i;
}
printf("\n the value is %d",fact);
}
