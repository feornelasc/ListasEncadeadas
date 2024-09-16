package ListaEncadeadaCircular;

public class CircularDLinkedList {
    private Node head;
    private Node tail;

    public CircularDLinkedList() {
        head = null;
        tail = null;
    }

    public void adicionar(String element) {
        Node newNode = new Node(element, head, tail);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void remover(String element) {
        if (head == null) return;

        Node current = head;
        do {
            if (current.element.equals(element)) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else {
                    if (current == head) {
                        head = head.next;
                        tail.next = head;
                    } else if (current == tail) {
                        tail = tail.prev;
                        tail.next = head;
                        head.prev = tail;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void imprimir() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.element + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void imprimirReverso() {
        if (tail == null) return;

        Node current = tail;
        do {
            System.out.print(current.element + " ");
            current = current.prev;
        } while (current != tail);
        System.out.println();
    }
}

