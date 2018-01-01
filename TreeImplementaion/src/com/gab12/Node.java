package com.gab12;

/**
 * Created by SONY on 12/30/2017.
 */
public class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return ( name + " has the key " + key );
    }
}
