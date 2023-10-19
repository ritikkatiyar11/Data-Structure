class student{
        int roll;
        student(int roll){
            this.roll=roll;
        }
        student(student obj){
            this.roll=obj.roll;
        }
    }
public class copy_constructure {

   
    public static void main(String[] args) {
        student s1=new student(12);
        student s=new student(s1);
        System.out.println(s.roll+" ");

    }
     
    
}

