package com.linkedlist.tulsapretech;

public class LinkedList {
    private static int counter;
    private NodeName headName;
    private NodeData headData;


    //default constructor
    public LinkedList(){

    }

    public void addName(Object name){
        if(headName.getHead() == null){
            headName = new NodeName(headName.hashCode());
        }


    }

    public void addData(Object data){
        if(headData.getHead() == null){
            headData = new NodeData(headData.hashCode());
        }
    }

    public static int getCounter(){return counter;}
    public static void incrementCounter(){counter++;}
    public static void decrementCounter(){counter--;}

    public NodeName getHeadName(){return headName;}
    public void setHeadName(NodeName headName){this.headName=headName;}
    public NodeData getHeadData(){return headData;}
    public void setHeadName(NodeData headData){this.headData=headData;}
}
