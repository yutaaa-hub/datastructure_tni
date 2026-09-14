private Node root;
private Node parent;
private Node deleteNode;


public BinaryTree() {
    root = null;
}

public Node getRoot() {
    return root;
}

public Node getParent() {
    return parent;
}

public Node getDeleteNode() {
    return deleteNode;
}

public void printTree(Node node, int depth) {
    if (node != null) {
        printTree(node.right, depth + 1);
        System.out.println("    ".repeat(depth) + node.data);
        printTree(node.left, depth + 1);
    }
}

public void insert(int new_data) {
    if (root == null) {

        root = new Node(new_data);
    } else {
        Node current_node = root;
        while (true) {
            if (new_data < current_node.data) {
                if (current_node.left == null) {
                    current_node.left = new Node(new_data);
                    break;
                }
                current_node = current_node.left;
            } else
            {
                if (current_node.right == null) {
                    current_node.right = new Node(new_data);
                    break;
                }
                current_node = current_node.right;
            }
        }
    }
}

public void searchDeleteNode (int target) {
    deleteNode = null;
    parent = null;

    if (root == null) {
        return;
    }

    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        Node current_node = queue.poll();
        parent = current_node;
        if (parent.data == target) {
            deleteNode = parent;
            break;
        }
        for (int i = 0; i < levelSize; i++) {
            if (current_node.left != null) {
                if (current_node.left.data == target) {
                    deleteNode = current_node.left;
                    queue.clear();
                    break;
                }
                queue.add(current_node.left);
            }
            if (current_node.right != null) {
                if (current_node.right.data == target) {
                    deleteNode = current_node.right;
                    queue.clear();
                    break;
                }
                queue.add(current_node.right);
            }
        }
    }
    System.out.println("Parent = " + parent.data);
    System.out.println("Delete Node = " + deleteNode.data);
}

public void delete(int target) {

    searchDeleteNode(target);

    if (root == null) {
        System.out.println("Empty Tree");
        return;
    }

    if (deleteNode == null) {
        System.out.println("Cannot found data");
        return;
    }

    // Case 1: Leaf Node
    if (deleteNode.left == null && deleteNode.right == null) {

        if (deleteNode == root) {
            root = null;
        }
        else if (parent.left == deleteNode) {
            parent.left = null;
        }
        else {
            parent.right = null;
        }
    }


    else if (deleteNode.left != null && deleteNode.right != null) {

        Node successorParent = deleteNode;
        Node successor = deleteNode.right;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        deleteNode.data = successor.data;

        if (successorParent.left == successor) {
            successorParent.left = successor.right;
        }
        else {
            successorParent.right = successor.right;
        }
    }


    else {

        Node child;

        if (deleteNode.left != null) {
            child = deleteNode.left;
        }
        else {
            child = deleteNode.right;
        }

        if (deleteNode == root) {
            root = child;
        }
        else if (parent.left == deleteNode) {
            parent.left = child;
        }
        else {
            parent.right = child;
        }
    }
}

public Node searchNode(Node node, int target) {
    if (node == null) {
        System.out.println("Cannot found Node(data=[" + target + "])");
        return null;
    }

    if (node.data == target) {

        // Left Child
        if (node.left != null) {
            System.out.println("Left Child = " + node.left.data);
        } else {
            System.out.println("No Left Child");
        }


        if (node.right != null) {
            System.out.println("Right Child = " + node.right.data);
        } else {
            System.out.println("No Right Child");
        }


        if (node.left == null && node.right == null) {
            System.out.println(target + " is Leaf Node");
        } else {
            System.out.println(target + " is not Leaf Node");
        }

        return node;
    }

    if (target < node.data) {
        return searchNode(node.left, target);
    } else {
        return searchNode(node.right, target);
    }
}

public void createTree1() {
    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
}

public void createTree2() {
    root = new Node(15);
    root.left = new Node(8);
    root.right = new Node(23);
    root.left.left = new Node(4);
    root.left.right = new Node(11);
    root.right.left = new Node(19);
    root.left.left.left = new Node(2);
    root.right.left.right = new Node(20);
}

public void createTree3() {
    root = new Node(50);
    root.left = new Node(10);
    root.right = new Node(22);
    root.left.left = new Node(11);
    root.left.right = new Node(12);
    root.right.right = new Node(24);
    root.right.right.left = new Node(23);
}

public void createTree4() {
    int[] nums = { 10, 8, 15, 2, 9, 18, 14, 20, 11, 17 };

    for (int i : nums) {
        insert(i);
    }
}

public void createTree5() {
    int[] nums = { 50,30,70,10,40,60,20,45,55,65,25 };

    for (int i : nums) {
        insert(i);
    }
}

public void createTree6() {
    int[] nums = { 40,20,70,30,55,85,25,35,80,32 };

    for (int i : nums) {
        insert(i);
    }
}


