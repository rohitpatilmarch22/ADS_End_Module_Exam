import java.util.*;

class twoStacks
{
	int arr[];
	int size;
	int top1;
	int top2;
	
	twoStacks(int n)
	{
		size=n;
		arr=new int[n];
		top1=n/2+1;
		top2=n/2;
	}
	
	void push1(int x)
	{
		if (top1>0)
		{
			top1--;
			arr[top1]=x;
		}
		else
		{
			System.out.println("Popped element from stack1 is   "+x);
			return;
		}
	}
	void push2(int x)
	{
		if(top2<size-1)
		{
			top2++;
			arr[top2]=x;
		}
		else
		{
			System.out.println("Popped element from stack2 is  "+x);
			return;
		}
	}
	int pop1()
	{
		if(top1<=size/2)
		{
			int x=arr[top1];
			top1++;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
			
		}
		return 0;
	}
	
	
		int pop2()
	{
		if(top2>=size/2+1)
		{
			int x=arr[top2];
			top2--;
			return x;
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
			
		}
		return 1;
	}

}
















class twoStack
{


	public static void main(String args[])
	{
		twoStacks two =new twoStacks(5);
		
			two.push1(5); 
			two.push2(10); 
			two.push2(15); 
			two.push1(11); 
			two.push2(7); 
		//	two.push2(40);
		
		
		System.out.println("Popped element from stack1 is "+two.pop1());
		two.push2(40);
	//	System.out.println("Popped element from stack2 is "+two.pop2());
		
		
		
		
	}
}