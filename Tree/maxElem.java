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

public class maxElem {

    static Node root;
    static String nodeName = "root";
    static int max;
    
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

    public static void findMax(Node node){
        if(node == null)
            return;
        max = Math.max(node.data,max);
        findMax(node.left);
        findMax(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        max = Integer.MIN_VALUE;
        root = insert(sc);
        findMax(root);
        System.out.println("Max value is: "+max);
    }
}
