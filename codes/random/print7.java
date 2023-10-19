import java.util.Stack;

public class print7 {
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                Stack<Integer>stl=new Stack<>();

                System.out.print(" ");

            }
            for (int j = 0; j <n-i ; j++) {
                System.out.print("@");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        print(7);
    }
}
