/**
 StackDriver
 The program will test the stack class
 Author: Mareks
 Collaborator(s):
 Collaboration:
 Date: 11/14/21
 **/
public class StackDriver {
    public static void main(String[] args){
        //new stack
        Stack<Integer> stack1 = new Stack<Integer>();
        //test size
        System.out.println("Size: " + stack1.size() + " (should be zero)");
        //test isEmpty
        System.out.println("IsEmpty: " + stack1.isEmpty() + " (should be true)");
        //add to the stack
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        //test the pop method
        System.out.println("Pop: " + stack1.pop() + " (should be 3)");
        //peek method
        System.out.println("Peek: " + stack1.peek() + " (should be 2)");

    }
}
