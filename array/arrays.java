import java.util.Scanner;

public class arrays {
// array input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("terma please");
        int n = sc.nextInt();
        System.out.println("enter x");
        int x=sc.nextInt();
        
        int[] marks = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("enter term " + (j + 1));
            marks[j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
            if(marks[i]==x) {
                System.out.println("found "+(i));
            }
        }
    }
}
