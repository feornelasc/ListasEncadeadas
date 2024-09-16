package ListaSimplesmenteEncadeada;
public class SLinkedList {
    private Node head;

    public SLinkedList() {
        head = null;
    }

    public void adicionar(String element) {
        if (head == null) {
            head = new Node(element, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(element, null);
        }
    }

    public void remover(String element) {
        if (head == null) return;

        if (head.element.equals(element)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.element.equals(element)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void imprimir() {
        Node current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
}
