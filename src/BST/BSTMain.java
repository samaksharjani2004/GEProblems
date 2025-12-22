package BST;

public class BSTMain {

    public static void main(String[] args) {

        System.out.println("Binary Search Tree Program");

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC 1: Create BST
        bst.add(56);
        bst.add(30);
        bst.add(70);

        // UC 2: Create full tree shown in figure
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        System.out.println("Size of Binary Tree: " + bst.size());

        // UC 3: Search 63
        boolean found = bst.search(63);
        System.out.println("Is 63 present in BST? " + found);
    }
}

