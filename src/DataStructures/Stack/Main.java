package DataStructures.Stack;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Valorant");
        stack.push("Skyrim");
        stack.push("Mario Bros");
        stack.push("FFVII");
        System.out.println(stack);

        stack.pop();
        stack.pop();
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        System.out.println(stack.peek());

        System.out.println(stack.search("Minecraft"));






    }
}
