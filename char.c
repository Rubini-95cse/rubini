#include<stdio.h>
#include<conio.h>
void main()
{
char n;
printf("\n print the value of n:");
scanf("%c",&n);
if(n>='A'&&n<='Z'||n>='a'&&n<='z')
{
printf("\n the entered value %c is a alphabet",n);
}
else{
printf("\n the enter value %c is not an alphabet",n);
}
}
