
import java.util.Scanner;

class Node
{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}

public class NthNode
{
	public static Node getNthFromLast(Node head, int k)
	{
		int n = 0;
		Node curr = head;

		while (curr != null)
		{
			curr = curr.next;
			n++;
		}

		if (n >= k)
		{
			curr = head;
			for (int i = 0; i < n - k; i++) {
				curr = curr.next;
			}
		}
		

		return curr;
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No.of Nodes in a Linked List:-");
		int n=s.nextInt();
		System.out.println("Enter Nth Node: ");
		int a = s.nextInt();
		System.out.println("Enter "+n+" Elements:");
		int k[] = new int[n];
		for(int i=0;i<n;i++) {
			k[i]=s.nextInt();
		}
		Node head = null;
		for (int i = k.length - 1; i >= 0; i--) {
			head = new Node(k[i], head);
		}
		
		
		if(a>k.length) {
			System.out.println(-1);
		}
		Node node = getNthFromLast(head, a);

		if (node != null) {
			System.out.println("N'th node from the end is: " + node.data);
		}
	}
}
