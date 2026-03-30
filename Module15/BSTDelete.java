package basic.TripillarAssignment.Module15;
class Node2 {
        int data;
        Node left, right;

        Node2(int data) {
            this.data = data;
        }
    }

    public class BSTDelete {

        Node root;

        Node delete(Node root, int key) {
            if (root == null) return root;

            if (key < root.data) {
                root.left = delete(root.left, key);
            } else if (key > root.data) {
                root.right = delete(root.right, key);
            } else {
                // Node found

                // Case 1: No child
                if (root.left == null && root.right == null)
                    return null;

                // Case 2: One child
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                // Case 3: Two children
                Node temp = minValue(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
            return root;
        }

        Node minValue(Node node) {
            while (node.left != null)
                node = node.left;
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
            BSTDelete tree = new BSTDelete();

            tree.root = new Node(50);
            tree.root.left = new Node(30);
            tree.root.right = new Node(70);
            tree.root.left.left = new Node(20);
            tree.root.left.right = new Node(40);

            tree.root = tree.delete(tree.root, 30);

            tree.inorder(tree.root);
        }
    }

