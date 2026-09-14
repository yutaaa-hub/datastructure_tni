public class TreeApp3 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("----------------------------");
        System.out.println("Binary tree from createTree5()");
        System.out.println("----------------------------");
        tree.createTree3();
        tree.printTree(tree.getRoot(), 0);

        tree.delete(25);
        tree.printTree(tree.getRoot(), 0);

        tree.delete(40);
        tree.printTree(tree.getRoot(), 0);

        tree.delete(60);
        tree.printTree(tree.getRoot(), 0);
    }
}

