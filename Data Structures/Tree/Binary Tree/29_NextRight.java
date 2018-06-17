import java.util.*;
class Node{
  int key;
  Node left, right;
  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}
class BinaryTree{
  Node root;
  BinaryTree(int key){
    this.root = new Node(key);
  }
  public void findRight(Node node, int key){
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while(!q.isEmpty()){
      int l = q.size();
      while(l-- > 0){
        Node temp = q.poll();
        if(temp.key == key){
          if(q.isEmpty()){
            System.out.println(-1);
            break;
          }
          else{
            System.out.println(q.poll().key);
            break;
          }
        }
        if(temp.left != null)
          q.add(temp.left);
        if(temp.right != null)
          q.add(temp.right);
      }
    }
  }

  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.right.left = new Node(8);
    bt.findRight(bt.root, 8);
  }
}
