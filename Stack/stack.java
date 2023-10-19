/**
 * stack
 */
public class stack {
    int arr[];
    int ptr=-1;
    int size=0;
    stack(int max)
    {
        this.arr=new int[max-1];
    }
    void push(int data){
        if(ptr==arr.length-1){
            System.out.println("full");
            return;
        }
        ptr++;
        arr[ptr]=data;
        size++;
    }
    int pop()
    {
        if(ptr==-1){
            System.out.println("empty");
        }
        int data=arr[ptr];
        ptr--;
        size--;
        return(data);
    }
    void display(){
        for (int i = 0; i <=ptr; i++) {
            System.out.println(arr[ptr-i]);
        }
    }

    public static void main(String[] args) {
        stack s=new stack(5);
        s.push(10);
        s.push(11);
        s.push(12);
        s.display();
        System.out.println(s.size);

        // System.out.println(s.pop());
        // s.display();

    }
    
}