import java.io.*;
import java.util.*;
public class Git
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
Integer n1 = s.nextInt();
Integer n2 = s.nextInt();
Integer i;
int flag = 0;
for(i=n1;i<=n2;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
	flag=1;
}
}
if(flag==0)
System.out.print(i);
}
}
}
