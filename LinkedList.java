import java.util.Scanner;
class ListNode
{
    int data;
    ListNode next;

    ListNode(int data1, ListNode next1)
    {
        this.data = data1;
        this.next = next1;
    }
    ListNode(int data1) {
        this.data = data1;
        this.next = null;
    }
}
class LinkedList{
    ListNode head, tail;
    public void insert(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = null;
        if (head == null) 
        {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertbeg(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertpos(int pos,int data)
    {
        ListNode temp = head;
        ListNode newNode = new ListNode(data);
        for(int i = 0; i < pos - 1; i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete()
    {
        ListNode temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void deletebeg()
    {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deletepos(int pos)
    {
        ListNode temp = head;
        for(int i = 0; i < pos - 1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void display()
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of linked list 1");
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        System.out.println("enter the values of l1");
        for(int i = 0; i < n; i++)
        {
            int data = sc.nextInt();
            l1.insert(data);
        }

        System.out.println("enter the length of linked list 2");
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        System.out.println("enter the values of l2");
        for(int i = 0; i < m; i++)
        {
            int data = sc.nextInt();
            l2.insert(data);
        }

        l2.delete();
        l2.deletebeg();
        l1.deletepos(1);
        System.out.println("elements in list 1");
        l1.display();

        System.out.println("elements in list 2");
        l2.display();

        sc.close();
    }
}