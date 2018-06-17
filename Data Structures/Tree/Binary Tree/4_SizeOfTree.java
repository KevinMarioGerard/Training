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
  int size;
  BinaryTree(int key){
    this.root = new Node(key);
    this.size = 0;
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    //bt.root.right.right = new Node(7);
    //bt.root.left.right.left = new Node(8);
    bt.sizeOfTree(bt.root);
    System.out.println(bt.size);
  }

  public void sizeOfTree(Node node){
    if(node == null)
      return;
    size++;
    sizeOfTree(node.left);
    sizeOfTree(node.right);
  }
}
