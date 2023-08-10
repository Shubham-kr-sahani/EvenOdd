import java.util.Scanner;
class EvenSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter first number");
		int n=sc.nextInt();
		
		System.out.println("Enter last number");
		int m=sc.nextInt();
		for (int i=n;i<=m ;i++ )
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("even sum is :"+sum);
	}
}
