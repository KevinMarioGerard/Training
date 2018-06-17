import java.util.*;
class Node{
  Node left;
  Node right;
  int key;
  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}
class BinaryTree{
  Node root;
  int diameter = 0;
  BinaryTree(int key){
    this.root = new Node(key);
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    //bt.root.left.right.left = new Node(8);
    //bt.root.right.left = new Node(6);
    //bt.root.right.right = new Node(7);
    bt.post(bt.root);
    System.out.println(bt.diameter);
  }
  public int post(Node node){
    if(node == null){
      return 0;
    }
    int lheight = post(node.left) + 1;
    int rheight = post(node.right) + 1;
    if(diameter < lheight + rheight - 1){
        diameter = lheight + rheight - 1;
    }
    return Math.max(lheight, rheight);
  }
}
