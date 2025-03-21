import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(int data)
    {
        this.val = data;
        this.next = null;
    }
    ListNode(int data, ListNode next)
    {
        this.val = data;
        this.next = next;
    }
}
public class circular{
    ListNode head, tail;
    public void insert(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = null;
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print(int count) {
        ListNode temp = head;
        while (temp != null && count > 0) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
            count--;
        }
        System.out.println("...");
    }

    public void circle()
    {
        if (tail != null) {
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        circular list = new circular();
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            list.insert(data);
        }

        list.print(n);
        list.circle();
        list.print(2 * n);

        sc.close();
    }
}
