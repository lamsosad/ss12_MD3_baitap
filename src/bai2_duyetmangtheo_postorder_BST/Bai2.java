package bai2_duyetmangtheo_postorder_BST;

public class Bai2 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Thêm các nút vào BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);
        postorder(tree.root);
    }
    public static void postorder(Node node){
        if (node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println("" + node.value);
    }
}
