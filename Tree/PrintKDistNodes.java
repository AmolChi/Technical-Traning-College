import java.util.Scanner;

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

public class PrintKDistNodes {
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

    public static void findk(Node node,int k,int currDist){
        if(node == null)
            return;
        if(currDist == k){
            System.out.print(node.data+ " ");
            return;
        }
        findk(node.left,k,currDist+1);
        findk(node.right,k,currDist+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Node root = insert(sc);
        System.out.print("Nodes at "+k+" distance are: ");
        findk(root,k,0);
    }
}
