#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("\n enter the value of a,b and c:");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c)
{
printf("\n %d is greater",a);
}
else
   if(b>c&&b>a)
   {
   printf("\n %d is greater",b);
}
else
{
printf("\n %d is greater",c);
}
}
