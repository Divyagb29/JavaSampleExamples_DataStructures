import java.util.Scanner;
class Alpha
{
	public static void main(String[] args) 
	{
		int i, j, n;

		System.out.print("Enter value of n :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++)//a
			{
				if (i==0&&j!=0&&j<n/2 || i==n/2&&j<n/2 || j==0&&i!=0 || j==n/2&&i!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//b
			{
				if (i==0&&j<n/2 || i==n/2&&j<n/2 || i==n-1&&j<n/2 || j==0 || j==n/2&&i!=0&&i!=n/2&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//c
			{
				if (i==0&&j!=0&&j<=n/2 || i==n-1&&j!=0&&j<=n/2 || j==0&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (j=0; j<n; j++)//d
			{
				if (i==0&&j<n/2 || i==n-1&&j<n/2 || j==0 || j==n/2&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//g
			{
				if (i==0&&j!=0&&j<n/2 || j==0&&i!=0&&i!=n-1 || i==n-1&&j!=0&&j<n/2 || j==n/2&&i!=n-1&&i>=n/2 || i==n/2&&j>=n/4&&j<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//h
			{
				if (i==n/2&&j<=n/2 || j==0 || j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//i
			{
				if (i==0&&j<=n/2 || i==n-1&&j<=n/2 || j==n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//j
			{
				if (i==0&&j<=n/2 || j==n/4&&i!=n-1 || i==n-1&&j!=0&&j<n/4 || j==0&&i>n/2&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//k
			{
				if (j==0 || i+j==n/2 || i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	

			for (j=0; j<n; j++)//l
			{
				if (i==n-1&&j<n || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//m
			{
				if (j==0 || i==j&&i<=n/2 || i+j==n-1&&i<=n/2 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for(j=0; j<n; j++)//n
			{
			 	if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (j=0; j<n; j++)//o
			{
				if (i==0&&j!=0&&j<n/2 || i==n-1&&j!=0&&j<n/2 || j==0&&i!=0&&i!=n-1 || j==n/2&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//p
			{
				if (i==0&&j<n/2 || i==n/2&&j<n/2 || j==0 || j==n/2&&i!=0&&i!=n/2&&i<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//q
			{
				if (i==0&&j!=0&&j<3*n/4 || j==0&&i!=0&&i!=n-1 || i==n-1&&j!=0&&j<3*n/4 || j==3*n/4&&i!=0&&i!=n-1 || i==j&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			
			for (j=0; j<n; j++)//r
			{
				if (j==0 || i==0&&j<n/2 || j==n/2&&i!=0&&i<n/2 || i==n/2&&j<n/2 || i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	

			for (j=0; j<n; j++)//s
			{
				if (i==0&&j!=0&&j<=n/2 || j==0&&i!=0&&i!=n/2&&i<=n/2 || i==n/2&&j!=0&&j<n/2 || j==n/2&&i!=n/2&&i<n-1&&i>=n/2 || i==n-1&&j<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//t
			{
				if (i==0&&j<=n || j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//u
			{
				if (j==0&&i!=n-1 || i==n-1&&j!=0&&j!=n-1&&j<=n-1 || j==n-1&&i!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//v
			{
				if (j==0&&i<=n/2 || i-j==n/2 || i+j==(n+n/2)-1 || j==n-1&&i<=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}	

			for (j=0; j<n; j++)//w
			{
				if (j==0 || i+j==n-1&&i>=n/2 || i==j&&i>=n/2 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//x
			{
				if (i==j || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			for (j=0; j<n; j++)//y
			{
				if (i==j&&i<=n/2 || i+j==n-1&&i<=n/2 || j==n/2&&i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (j=0; j<n; j++)//z
			{
				if (i==0 || i+j==n-1 || i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//Entire Code for A-Z alphabet’s . But I don’t know which part is for which alphabet - you will have to write your name and send it to me - how you will do - I don’t know