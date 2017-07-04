import java.io.*;
import java.util.*;
public class Fact
{
public static void main(String args[])throws IOException
{
Integer fact = 1;
Scanner s = new Scanner(System.in);
Integer n = s.nextInt();
for(int i=1;i<=n;i++)
{
fact = fact*i;
}
System.out.println(fact);
}
}
