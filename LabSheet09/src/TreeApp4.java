public class TreeApp4 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("----------------------------");
        System.out.println("Binary tree from createTree6()");
        System.out.println("----------------------------");
        tree.createTree4();
        tree.printTree(tree.getRoot(), 0);

        System.out.println();
        tree.searchNode(tree.getRoot(),32);
    }
}
