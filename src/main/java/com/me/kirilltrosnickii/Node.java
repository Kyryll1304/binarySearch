package com.me.kirilltrosnickii;

public class Node {
    int key;
    String value;
    Node leftChild;
    Node rightChild;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}

