// Node class to represent a node in tree data structure
class Node {
  int value;
  Node left, right;
  
  Node(int value) {
    this.value = value;
    this.left = this.right = null;
  }
}

// Create a root node
public class BasicTree {
    public static void main(String[] args) {
      Node root = new Node(20);
      System.out.println("Value at root : " + root.value );
  }
}
