package com.gab12;

/**
 * Created by SONY on 12/30/2017.
 */
public class BinaryTree {
    Node root;

    public void addNode(int key, String name) {

        if (root == null){
            root = new Node(key, name);
            return;
        }
        Node focusNode = root;
        while(focusNode!=null){
            if(key < focusNode.key){
                focusNode=focusNode.leftChild;
            }else{
                focusNode=focusNode.rightChild;
            }
        }
    }



}
