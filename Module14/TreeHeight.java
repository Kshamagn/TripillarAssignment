package basic.TripillarAssignment.Module14;
class Node4 {
        int data;
        Node left, right;

        Node4(int data) {
            this.data = data;
        }
    }

    public class TreeHeight {

        Node root;

        int height(Node node) {
            if (node == null) return 0;

            int left = height(node.left);
            int right = height(node.right);

            return Math.max(left, right) + 1;
        }

        public static void main(String[] args) {
            TreeHeight tree = new TreeHeight();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

            System.out.println("Height: " + tree.height(tree.root));
        }
    }

