import java.util.*;
class LinkedListReverse
{
	static Node head;
	static class Node
	{
		int data;
		Node neext;
		Node(int d)
		{
			data =d;
			neext=null;
		}
	}
	void insertNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.neext!=null)
			{
				temp=temp.neext;
			}
			temp.neext=newNode;
		}
	}
	Node reverse(Node node)
	{
		Node prev=null;
		Node current=node;
		Node neext=null;
		while(current!=null)
		{
			neext=current.neext;
			current.neext=prev;
			prev=current;
			current=neext;
		}
		
		node =prev;
		return node;
	}
	void display(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.neext;
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[])
	{
		LinkedListReverse list=new LinkedListReverse();
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++)
		{
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				int x=sc.nextInt();
				list.insertNode(x);
			}
			head=list.reverse(head);
			list.display(head);
		}
	}
	
}
