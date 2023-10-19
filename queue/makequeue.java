public class makequeue {
    int front=0;
    int end=0;
    int arr[];
    makequeue(int size){
        this.arr=new int [size];

    }
    void add(int data)
    {
        if(end==arr.length-1)
        {
         System.out.println("full");
        }
        arr[end]=data;
        end++;
    }
    void pop(){
        if(front==0)
        {
            System.out.println("empty");
        }
        front++;
    }
    void display()
    { int temp=front;
        while(temp<end){
            System.out.println(arr[temp]);
            temp++;
        }
    }

    public static void main(String[] args) {
        makequeue q=new makequeue(5);
        q.add(1);
        q.add(2);
        q.add(3); 
        // q.display();
        q.pop();
        q.display(); 

    
    }
}
