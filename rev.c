#include<stdio.h>
#include<conio.h>
void main()
{
int i,n,rev=0,r;
printf("\n enter the value");
scanf("%d",&n);
while(n!=0)
{
r=n%10;
n=n/10;
rev=rev*10+r;
}
printf("\n the reverse is %d",rev);
}

