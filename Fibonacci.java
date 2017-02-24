import java.util.Scanner;
public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int f1=0;
int f2=1;
int f3;
if(n==0)
{
	System.out.println(f1);
}
else if(n==1)
{
	System.out.println(f2);
}
else
{
	System.out.println(0);
	System.out.println(1);
for(int i=3;i<=n;i++)
{
	f3=f2+f1;
	System.out.println(f3);
	f1=f2;
	f2=f3;
}
	}
	}
}
