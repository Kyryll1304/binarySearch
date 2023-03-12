package com.me.kirilltrosnickii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {
    @Test
    void testContains() {
        BinarySearchTree tree = new BinarySearchTree();

        assertFalse(tree.contains(5));

        tree.insert(5);

        assertTrue(tree.contains(5));

        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);

        assertTrue(tree.contains(2));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(4));
    }

    @Test
    void testDelete() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5);
        tree.delete(5);

        assertFalse(tree.contains(5));

        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.delete(2);

        assertFalse(tree.contains(2));
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(3));

        tree.delete(5);

        assertFalse(tree.contains(5));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(3));
    }
}
