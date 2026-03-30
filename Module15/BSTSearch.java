package basic.TripillarAssignment.Module15;
public class BSTSearch {
    Node root;

        boolean search(Node node, int key) {
            if (node == null) return false;

            if (node.data == key) return true;

            if (key < node.data)
                return search(node.left, key);
            else
                return search(node.right, key);
        }

        public static void main(String[] args) {
            BSTSearch tree = new BSTSearch();

            tree.root = new Node(50);
            tree.root.left = new Node(30);
            tree.root.right = new Node(70);

            System.out.println(tree.search(tree.root, 30));
        }
    }

