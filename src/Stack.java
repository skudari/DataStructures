import java.util.EmptyStackException;

public class Stack<T> {

    private StackNode<T> top;
    private int stackSize = 0;

    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    //remove top of stack and return its value
    public T pop(){
        if (top == null)
            throw new EmptyStackException();
        T temp = top.data;
        top = top.next;
        stackSize--;
        return temp;
    }

    //will push new value to top of the stack
    public void push(T data){
        StackNode<T> newItem = new StackNode<T>(data);
        newItem.next = top;
        top = newItem;
        stackSize++;
    }

    //peek the value at the top of the list
    public T peek(){
        if (top == null)
            throw new EmptyStackException();
        return top.data;
    }


    //check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    //find size of stack
    public int stackSize(){
        return stackSize;
    }
}
