import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PostOrderIterative{

    static Node root;
    static String nodeName = "root";
    
    public static Node insert(Scanner sc){
        System.out.print("Insert " + nodeName + " Data (-1 if null): ");
        int x = sc.nextInt();
        if(x == -1)
            return null;
        Node curr = new Node(x);
        nodeName = "left";
        curr.left = insert(sc);
        nodeName = "right";
        curr.right = insert(sc);
        return curr;
    }

    static void postOrder(Node root){
        Stack<Node> stack = new Stack<>();
        while(true) {
            while(root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }
             
            // Check for empty stack
            if(stack.empty()) return;
            root = stack.pop();
             
            if(!stack.empty() && stack.peek() == root) root = root.right;
             
            else {
                 
                System.out.print(root.data + " "); root = null;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = insert(sc);

        postOrder(root);
    }
}