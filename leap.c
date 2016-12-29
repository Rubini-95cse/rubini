#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
int a;
printf("\n enter the year:");
scanf("%d",&a);
if(a%400==0||a%4==0&&a%100==0)
{
printf("\n the year %d is a leap year",a);
}
else{
printf("\n the year %d is not a leap year",a);
}
}
