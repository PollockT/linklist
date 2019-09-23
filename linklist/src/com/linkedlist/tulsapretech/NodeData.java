package com.linkedlist.tulsapretech;

public class NodeData {
    private NodeData head;
    private Object data;

    //Node constructor
    public NodeData(Object data){
        head = null;
        this.data = data;
    }

    //Node constructor WITH pointer
    public NodeData(Object data, NodeData next){
        this.head = next;
        this.data = data;
    }



    public Object getData(){return data;}
    public void setData(Object data){this.data = data;}
    public NodeData getHead(){return head;}
    public void setHead(NodeData head){this.head = head;}

}
