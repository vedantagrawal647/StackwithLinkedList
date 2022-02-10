class StackbyDubblyLinkedList{
    Node top;
    static class Node
    {
        int data;
        Node next;
        Node previous;
        Node(int data)
        {
            this.data=data;
        }
    }

    public boolean isempty()
    {
        return top==null;
    }

    public void push(Node newnode)
    {
        if(isempty())
        {
            top=newnode;
        }
        else
        {
            top.previous=newnode;
            newnode.next=top;
            top=newnode;

        }


    }

    public void pop() {
        if (top==null)
        {
            System.out.println("pop operation not take place as list is empty");
        } else
        {
            top = top.next;
            if(top!=null) {
                top.previous = null;
            }
        }
    }

    public void display()
    {
        if(isempty())
        {
            System.out.println("empty list");
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
public class Demo {
    public static void main(String[] args) {
        StackbyDubblyLinkedList obj=new StackbyDubblyLinkedList();

        obj.push(new StackbyDubblyLinkedList.Node(10));
        obj.display();
        System.out.println("----------------");

        obj.push(new StackbyDubblyLinkedList.Node(20));
        obj.push(new StackbyDubblyLinkedList.Node(30));
        obj.display();
        System.out.println("----------------");

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
        obj.display();
        System.out.println("----------------");



    }
}
