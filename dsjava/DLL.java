/*1. Write a Java program for the following:
a. Create a doubly linked list of elements.
b. Delete a given element from the above list.
c. Display the contents of the list after deletion.*/

import java.util.*;



public class dl {
    class node
    {
        int data;
        node prev,next;
        public node(int data)
        {
            this.data = data;
        }
    }
    node head =null,tail = null;

    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter item to be inserted: ");
        int item = sc.nextInt();
        node p  = new node(item);
        p.data = item;
        if(head==null)
        {
           p.next = null;
           p.prev = null;
           head = p;
        }
        else{
            p.prev = null;
            head.prev = p;
            p.next = head;
            head = p;

        }
    }
    void display()
    {
        node curr = head;
        if(curr==null)
        {
            System.out.println("list is empty");
        }
        else{
            System.out.println(curr);
            while(curr!=null)
            {
                System.out.print(curr.data);
                curr = curr.next;
                if(curr!=null)
                {
                    System.out.print("->");
                }
                
            }
        }
    }
    void delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter item to be deleted: ");
        int item = sc.nextInt();
        node curr = head;
        while(curr!=null && curr.data!=item)
        {
            curr = curr.next;
        }
        if(curr==null)
        {System.out.println("deletion not possible");}
        else{
            if(curr == head)
            {
               head = curr.next;
            }
            else if(curr==tail){
                 tail = curr.prev;
            }
            else {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of nodes needed: ");
        int n = sc.nextInt();
        dl d = new dl();
        for(int i=0;i<n;i++)
        {
           d.insert();
        }
        d.delete();
        d.display();
    }
}
