package collectionFramework;
import java.util.Stack;

public class stack {

    //methods
    //1. push
    //2. pop
    //3. peek - top ele

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack ele are: "+ st);

        // top ele
        System.out.println(st.peek());

        // pop ele
        st.pop();
        System.out.println("Updated ele are "+st);




    }
}
