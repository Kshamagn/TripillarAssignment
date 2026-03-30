package basic.TripillarAssignment.Module14;
public class PostorderTraversal {
    class Node3{
        int data;
        basic.TripillarAssignment.Module14.Node left, right;

        Node3(int data) {
            this.data = data;
            left = right = null;
        }
    }


    Node root;

        void postorder(Node node) {
            if (node == null) return;

            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        public static void main(String[] args) {
            PostorderTraversal tree = new PostorderTraversal();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            tree.postorder(tree.root);
        }
    }

