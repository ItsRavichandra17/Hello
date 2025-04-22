import java.util.Scanner;
class PalindromicNumber
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the n value");
int n=scan.nextInt();
int rev=reverse(n);
System.out.println(n==rev?"palindromic no":"not palindromic no");
}
public static int reverse(int n)
{
int rev=0;
while(n!=0)
{
rev=(rev*10)+(n%10);
n=n/10;
}
return rev;
}
}