package basic.TripillarAssignment.Module15;
public class BSTMinMax {
    Node root;
    int findMin(Node node) {
            while (node.left != null)
                node = node.left;
            return node.data;
        }

        int findMax(Node node) {
            while (node.right != null)
                node = node.right;
            return node.data;
        }

        public static void main(String[] args) {
            BSTMinMax tree = new BSTMinMax();

            tree.root = new Node(50);
            tree.root.left = new Node(30);
            tree.root.right = new Node(70);

            System.out.println("Min: " + tree.findMin(tree.root));
            System.out.println("Max: " + tree.findMax(tree.root));
        }
    }

