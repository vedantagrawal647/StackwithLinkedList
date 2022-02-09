

class Stackbylinkedlist
{
    Node top;
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }
    public boolean isEmpty()
    {
        return top==null;
    }

    public void push(Node newnode)

    {
        if(isEmpty())
        {
            top=newnode;
            top.next=null;
        }
        else
        {
            Node temp=top;
            top=newnode;
            top.next=temp;
        }

    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("no deletion operation as stack is empty");
        }
        else
        {
            top=top.next;
        }
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("empty stack");
        }
        else
        {
            Node temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}

public class Taste{
    public static void main(String[] args) {
        Stackbylinkedlist obj=new Stackbylinkedlist();

        obj.display();
        System.out.println("----------------");

        obj.push(new Stackbylinkedlist.Node(10));
        obj.push(new Stackbylinkedlist.Node(20));
        obj.push(new Stackbylinkedlist.Node(30));
        obj.display();
        System.out.println("----N------------");

        obj.pop();
        obj.display();
        System.out.println("----------------");

        obj.pop();
        obj.display();
        System.out.println("----------------");

        obj.pop();
        obj.display();
        System.out.println("----------------");

        obj.pop();
    }
}
