
public class TreeApp {

	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("Binary tree from createTree1()");
		System.out.println("----------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(),0);
		
		System.out.println("----------------------------------");
		System.out.println("Binary tree from createTree2()");
		System.out.println("----------------------------------");
		
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree2();
		tree2.printTree(tree2.getRoot(),0);
		
		System.out.println("----------------------------------");
		System.out.println("Binary tree from createTree3()");
		System.out.println("----------------------------------");
		
		BinaryTree tree3 = new BinaryTree();
		tree3.createTree3();
		tree3.printTree(tree3.getRoot(),0);
		

	}

}
