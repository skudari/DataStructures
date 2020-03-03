public class Tree {

    enum State {Unvisited, Visited, Visiting;}

    class Node {
        public String name;
        public State state = State.Unvisited;
        public Node left;
        public Node right;
    }

    public Node root;

    void inOrderTraversal(Node current){
            if(current != null){
                inOrderTraversal(current.left);
                current.state = State.Visited;
                inOrderTraversal(current.right);
            }
    }

    void preOrderTraversal(Node current){
        if(current != null){
            current.state = State.Visited;
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    void postOrderTraversal(Node current){
        if(current != null){
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            current.state = State.Visited;
        }
    }
}
