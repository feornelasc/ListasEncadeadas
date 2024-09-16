package ListaDuplamenteEncadeada;

public class Node {
    public String element;
    public Node next;
    public Node prev;

    public Node(String element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}

