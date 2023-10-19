/**
 * ll
 */
public class ll {
    private node head;
    private node tail;
    private int size;

    public ll() {
        this.size = 0;
    }

    void addFirst(int value) {
        node newnode = new node(value);
        newnode.next = head;
        head = newnode;

        // if adding first value
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    void addLast(int value) {
        if (tail == null) {
            addFirst(value);
        }
        node newnode = new node(value);
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    void deleteFisrt() {
        if (size == 0) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
    }

    void deleteLast(){
        if(size<=1){
            deleteFisrt();
        }
        node seconLast=get(size-2);
        tail=seconLast;
        tail.next=null;
        
        
    }

    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("end");
    }
    node get(int index)
    {   
        node temp =head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    // node class start
    private class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;

        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }

    }

    // class ends node
    public static void main(String[] args) {
        ll list = new ll();
        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(12);
        list.addLast(9);
        list.deleteFisrt();
        list.deleteLast();
        list.display();

    }

}
