public class dll {


    node head;
    class node{
        int val;
        int size;
        node prev;
        node next;
        public node(int val) {
            this.val = val;
        }
        // public node(int val, dll.node prev, dll.node next) {
        //     this.val = val;
        //     this.prev = prev;
        //     this.next = next;
        // }
        
        

    }
    void addFirst(int value)
        {
            node newnode=new node(value);
            newnode.next=head;
            newnode.prev=null;
            if(head!=null)
            {
                head.prev=newnode;
            }
            head=newnode;
        }
        void display()
        {
            node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+"-->");
                temp=temp.next;
            }
            System.out.print("end");
        }

    public static void main(String[] args) {
        
        dll list=new dll();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();
    }
}
