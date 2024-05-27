package collection;

import java.util.Stack;

public class Stack1 {

    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");


        while (!stack.isEmpty())
            System.out.println(stack.pop());


    }

}
