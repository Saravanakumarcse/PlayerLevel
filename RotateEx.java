import java.util.*;
public class RotateEx
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,k;
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
k=sc.nextInt();
for(int i=k;i<n;i++)
System.out.println(a[i]);
for(int i=0;i<k;i++)
System.out.println(a[i]);
}
}
