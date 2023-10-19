import java.util.Scanner;

class binaryTree {

    class node {
        int data;

        node left;
        node right;

        node(int value) {
            this.data = value;
        }
    }

    private node root;

    void populate() {
        Scanner s = new Scanner(System.in);
        populate(s);
    }

    void populate(Scanner sc) {
        System.out.println("enter root element");
        int data = sc.nextInt();
        root = new node(data);
        populate(sc, root);
    }

    void populate(Scanner sc, node Node) {
        System.out.println("Do you want to enter to left of " + Node.data);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("enter element to left of " + Node.data);
            int element = sc.nextInt();
            Node.left = new node(element);
            populate(sc, Node.left);

        }
        System.out.println("Do you want to enter to right of " + Node.data);
        boolean right = sc.nextBoolean();
        if (left) {
            System.out.println("enter element to left of " + Node.data);
            int element = sc.nextInt();
            Node.right = new node(element);
            populate(sc, Node.right);

        }

    }

    public void display(node Node, String indent) {
        if (Node == null) {
            return;
        }
        System.out.println(indent + Node.data);
        display(Node.left, indent + "\t");
        display(Node.right, indent + "\t");
    }

    public void display() {
        display(root, " ");

    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(node Node, int level) {
        if (Node == null) {
            return;
        }
        prettyDisplay(Node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.println("|\t\t");
            }
            System.out.println("------->"+Node.data);
        } 
        
        else {
            System.out.println(Node.data);
        }
        prettyDisplay(Node.left, level+1);
    }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        bt.populate();
        bt.display();
    }
}
