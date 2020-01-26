public class Queue<T> {
    private QueueNode<T> top;
    private QueueNode<T> end;
    private int queueSize = 0;

    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    //add
    public void add(T data){
        QueueNode<T> newItem = new QueueNode<T>(data);
        if(end != null) {
            end.next = newItem;
        }
        end = newItem;

        if(top == null){
            top = end;
        }
        queueSize++;
    }

    //remove
    public T remove(T data) throws Exception {
        if(top == null)
            throw new Exception("EmptyQueueException");

        T temp = top.data;
        top = top.next;
        queueSize--;
        return temp;
    }

    //peek
    public T peek() throws Exception{
        if(top == null)
            throw new Exception("EmptyQueueException");
        return top.data;
    }

    //is Empty
    public boolean isEmpty(){
        if(top == null)
            return true;
        else
            return false;
    }

    public int queueSize(){
        return queueSize;
    }
}
