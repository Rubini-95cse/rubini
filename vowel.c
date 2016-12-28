#include<stdio.h>
#include<conio.h>
void main()
{
char n;
printf("\n enter the value of n:");
scanf("%c",&n);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
{
printf("\n the character %c is a vowel",n);
}
else{
    printf("\n the character %c is a consonant",n);
}
getch();
}

