package com.linkedlist.tulsapretech;

public class NodeName {
    private NodeName head;
    private Object name;

    //Node constructor
    public NodeName(Object data){
        head = null;
        this.name = data;
    }

    //Node constructor WITH pointer
    public NodeName(Object data, NodeName next){
        this.head = next;
        this.name = data;
    }


    public Object getName(){return name;}
    public void setName(Object data){this.name = data;}
    public NodeName getHead(){return head;}
    public void setHead(NodeName head){this.head = head;}

}
