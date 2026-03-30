package basic.TripillarAssignment.Module14;
class Node{
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public class InorderTraversal {

        Node root;

        void inorder(Node node) {
            if (node == null) return;

            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

        public static void main(String[] args) {
            InorderTraversal tree = new InorderTraversal();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            tree.inorder(tree.root);
        }
    }

