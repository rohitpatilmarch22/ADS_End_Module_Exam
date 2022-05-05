import java.util.*;
class Sorting
{
		static void insertsort(int n,int[]a1)
	{
			for(int i=1;i<n;++i)
			{
				int key=a1[i];
				int j=i-1;
				while(j>=0 && a1[j]>key)
				{
					a1[j+1]=a1[j];
					j=j-1;
					display(a1);
				}
					a1[j+i]=key;
				}
			}
			static void display(int arr[])
			{
				int n=arr.length;
				for(int i=0;i<n;++i)
					System.out.print(arr[i]+"  ");
				System.out.println();
				
			}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
	
	insertsort(n,arr);
	display(arr);
		
	}
}
