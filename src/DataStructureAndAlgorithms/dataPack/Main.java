package DataStructureAndAlgorithms.dataPack;

import java.util.Stack;

public class Main {

    //Data Structures is named location that can be used to store and organize data.
    //Algorithm : Collection step to solve the problems.

    //why you need to learn about Data Structures and Algorithm ?
    //
    public static void main(String[] args) {

        //stack = LIFO data structure. Last-in First-out
        //        stores object into a sort of "vertical tower".
        //        push() to add ot the top
        //        pop to remove from the top

        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty());
        stack.push("Micraft");
        stack.push("Skyrim");
        stack.push("doom");
        //System.out.println(stack.empty());
        //String myFav = stack.pop();
        System.out.println(stack);
        //System.out.println(myFav);
        //to see the first item in the stack.
        System.out.println(stack.peek());
        //it will be return number of position of the object in stack from the top.
        System.out.println(stack.search("Skyrim"));

        //use of stacks?
        // 1. undo/redo features in text editors.
        // 2. moving back/forward through browser history.
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling function (call stack)

    }
}
