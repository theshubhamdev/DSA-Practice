package BinaryTree;

import java.util.*;

public class BaseBinaryTreeBuilding {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorderPrint(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }

        public static void inorderPrint(Node root) {
            if (root == null) {
                return;
            }
            inorderPrint(root.left);
            System.out.print(root.data + " ");
            inorderPrint(root.right);
        }

        public static void postorderPrint(Node root) {
            if (root == null) {
                return;
            }
            postorderPrint(root.left);
            postorderPrint(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelWisePrint(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int maxHeightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = maxHeightOfTree(root.left);
            int rightHeight = maxHeightOfTree(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount + rightCount + 1;
        }

        public static int calculateDiameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDiameter = calculateDiameter(root.left);
            int rightDiameter = calculateDiameter(root.right);
            int leftHeight = maxHeightOfTree(root.left);
            int rightHeight = maxHeightOfTree(root.right);
            int selfDiameter = leftHeight + rightHeight + 1;
            return Math.max(leftDiameter, Math.max(rightDiameter, selfDiameter));
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        static class Info {
            int height;
            int diameter;

            public Info(int h, int d) {
                this.height = h;
                this.diameter = d;
            }
        }

        public static Info calculateDiameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftDiameter = calculateDiameter2(root.left);
            Info rightDiameter = calculateDiameter2(root.right);

            int diameter = Math.max(Math.max(leftDiameter.diameter, rightDiameter.diameter),
                    leftDiameter.height + rightDiameter.height + 1);
            int height = Math.max(leftDiameter.height, rightDiameter.height) + 1;

            return new Info(height, diameter);
        }
    
        public static boolean isIdentical(Node root, Node subRoot) {
            if (root == null && subRoot == null) {
                return true;
            } else if (root == null || subRoot == null || root.data != subRoot.data) {
                return false;
            }

            if (!(isIdentical(root.left, subRoot.left))) {
                return false;
            }
            if (!(isIdentical(root.right, subRoot.right))) {
                return false;
            }
            return true;
        }
        
        public static boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }
    
        static class Info2 {
            Node node;
            int hd; //Horizontal Distance

            public Info2(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        public static void topView(Node root) {
            // Level Order Traverse
            Queue<Info2> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int max = 0, min = 0;
            q.add(new Info2(root, 0));
            q.add(null);
            while (!q.isEmpty()) {
                Info2 curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        // first time occurrence of HD
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new Info2(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right != null) {
                        q.add(new Info2(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 7, -1, -1 };
        // Root
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // Sub Root
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // System.out.println(root.data);
        // tree.preorderPrint(root);
        // tree.inorderPrint(root);
        // tree.postorderPrint(root);
        // tree.levelWisePrint(root);
        // System.out.println(tree.maxHeightOfTree(root));
        // System.out.println(tree.countNodes(root));
        // System.out.println(tree.sumOfNodes(root));
        // System.out.println(tree.calculateDiameter(root));
        // System.out.println(tree.calculateDiameter2(root).diameter);
        // System.out.println(tree.isSubTree(root, subRoot));
        // System.out.println();
        tree.topView(root);
    }
}