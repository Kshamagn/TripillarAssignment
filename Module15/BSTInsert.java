package basic.TripillarAssignment.Module15;
class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public class BSTInsert {

        Node root;

        Node insert(Node node, int data) {
            if (node == null) return new Node(data);

            if (data < node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);

            return node;
        }

        void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.data + " ");
                inorder(node.right);
            }
        }

        public static void main(String[] args) {
            BSTInsert tree = new BSTInsert();

            tree.root = tree.insert(tree.root, 50);
            tree.insert(tree.root, 30);
            tree.insert(tree.root, 70);

            tree.inorder(tree.root);
        }
    }

