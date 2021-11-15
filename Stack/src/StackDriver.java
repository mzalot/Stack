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
        Stack<String> stack1 = new Stack<String>();
        //test size
        System.out.println("Size: " + stack1.size() + " (should be zero)");
        //test isEmpty
        System.out.println("IsEmpty: " + stack1.isEmpty() + " (should be true)");
        //edge cases
        System.out.println("Testing edge cases:");
        System.out.println("Peek with zero nodes: " + stack1.pop());
        System.out.println("Pop with zero nodes: " + stack1.peek());
        //add to the stack
        stack1.push("one");
        stack1.push("two");
        stack1.push("three");
        System.out.println("Push method works");
        //test the pop method
        System.out.println("Pop: " + stack1.pop() + " (should be three)");
        //peek method
        System.out.println("Peek: " + stack1.peek() + " (should be two)");

    }
}
