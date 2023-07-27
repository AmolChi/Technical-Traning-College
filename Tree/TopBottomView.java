import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    int vertDist;
    Node(int d,int dist){
        this.data = d;
        this.left = null;
        this.right = null;
        this.vertDist = dist;
    }
}

public class TopBottomView {
    static Node root;
    static String nodeName = "root";
    public static Node insert(Scanner sc,int dist){
        System.out.print("Insert " + nodeName + " Data (-1 if null): ");
        int x = sc.nextInt();
        if(x == -1)
            return null;
        Node curr = new Node(x,dist);
        nodeName = "left";
        curr.left = insert(sc,dist-1);
        nodeName = "right";
        curr.right = insert(sc,dist+1);
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        root = insert(sc,0);

        q.offer(root);
        Map<Integer,List<Integer>> map = new TreeMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node currNode = q.poll();
                List<Integer> curr = map.getOrDefault(currNode.vertDist, new ArrayList<>());
                curr.add(currNode.data);
                map.put(currNode.vertDist,curr);
                if(currNode.left!=null)
                    q.offer(currNode.left);
                if(currNode.right!=null)
                    q.offer(currNode.right);
            }
        }

        List<Integer> topView = new ArrayList<>();
        List<Integer> botView = new ArrayList<>();

        
    }
}
