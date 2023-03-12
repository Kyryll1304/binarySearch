package com.me.kirilltrosnickii;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);

        System.out.println(tree.contains(3)); // true
        System.out.println(tree.contains(4)); // false

        tree.delete(3);

        System.out.println(tree.contains(3)); // false
    }
}
