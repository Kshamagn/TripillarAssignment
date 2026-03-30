package basic.TripillarAssignment.Module15;
class Node3 {
        int data;
        Node left, right;

        Node3(int data) {
            this.data = data;
        }
    }

    public class CheckBST {

        boolean isBST(Node node, int min, int max) {
            if (node == null) return true;

            if (node.data <= min || node.data >= max)
                return false;

            return isBST(node.left, min, node.data) &&
                    isBST(node.right, node.data, max);
        }

        public static void main(String[] args) {
            CheckBST tree = new CheckBST();

            Node root = new Node(50);
            root.left = new Node(30);
            root.right = new Node(70);

            System.out.println("Is BST: " +
                    tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        }
    }

