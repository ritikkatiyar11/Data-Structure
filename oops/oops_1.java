/**
 * introduction
 */
public class oops_1 {
      class student{
        int rollno;
        String name;
        student(int rn,String name){
            this.rollno=rn;
            this.name=name;
        }
    }

    public static void main(String[] args) {
        oops_1 i=new oops_1();
        student s1= i.new student(0, null);
        s1.name="ritik";
        s1.rollno=22;
        System.out.println(s1.rollno+" "+s1.name);

        
    }
}