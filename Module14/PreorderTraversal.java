package basic.TripillarAssignment.Module14;
public class PreorderTraversal {
    class Node2{
        int data;
        basic.TripillarAssignment.Module14.Node left, right;

        Node2(int data) {
            this.data = data;
            left = right = null;
        }
    }


    Node root;

        void preorder(Node node) {
            if (node == null) return;

            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        public static void main(String[] args) {
            PreorderTraversal tree = new PreorderTraversal();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            tree.preorder(tree.root);
        }
    }

