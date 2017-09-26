import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int sum=0,n,r,temp;
temp=n=454;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println(" Its a Palindrome no.");
else
System.out.println(" Its not a Palindrome no.");
}
}
