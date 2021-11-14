/**
 Stack
 The program will create a stack of nodes
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 11/8/21
 **/
public class Stack <T>{
    //instance data
    private int counter;
    private StackNode node;

    //default constructor
    public Stack(){
        counter = 0;
        node = new StackNode();
    }
    //methods

    //push method
    public void push(T data){
        //find the last node in the stack
        StackNode currentNode = node;
        //go to last element
        for(int i = 0; i < counter; i++){
            currentNode = currentNode.getNode2();
        }
        //create a new node and add it to the end of the stack
        StackNode addNode = new StackNode(data);
        addNode.setNode1(currentNode);
        //add to counter of nodes
        counter++;
    }

    //pop method
    public StackNode pop(){
        //stack node to store last added node
        StackNode currentNode = node;
        //go to last added node
        for(int i = 0; i < counter; i++){
            currentNode = currentNode.getNode1();
        }
        //remove current node through reducing the counter
        counter--;
        //return removed node
        return (StackNode)currentNode;
    }
}
