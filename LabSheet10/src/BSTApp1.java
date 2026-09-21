public class BSTApp1 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree1();
        tree.printTree(tree.getRoot(),0);

        System.out.println();
        System.out.println("minimum node is " + tree.findMinimum(tree.getRoot()));
        System.out.println("maximum node is " + tree.findMaximum(tree.getRoot()));

        int target = 40;
        System.out.println("Is " + target + " in bst => " + tree.findSpecificData(target));
        target = 15;
        System.out.println("Is " + target + " in bst => " + tree.findSpecificData(target));

        int delNode = 7;
        tree.searchDeleteNode(delNode);
        System.out.println("Parent is " + tree.getParent().data);
        System.out.println("Delete Node is " + tree.getDeleteNode().data);

        System.out.println();
        tree.deleteNode(delNode);
        tree.printTree(tree.getRoot(), 0);


    }
}
