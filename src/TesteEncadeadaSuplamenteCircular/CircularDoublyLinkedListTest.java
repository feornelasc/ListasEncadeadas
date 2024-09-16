package TesteEncadeadaSuplamenteCircular;

import ListaEncadeadaDuplamenteCircular.CircularDoublyLinkedList;

public class CircularDoublyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("Teste 1: Adicionar elementos e imprimir");
        CircularDoublyLinkedList lista = new CircularDoublyLinkedList();
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.imprimir(); // Esperado: A B C
        lista.imprimirReverso(); // Esperado: C B A

        System.out.println("Teste 2: Remover um elemento e imprimir");
        lista.remover("B");
        lista.imprimir(); // Esperado: A C
        lista.imprimirReverso(); // Esperado: C A

        System.out.println("Teste 3: Remover o primeiro e o último elemento e imprimir");
        lista.remover("A");
        lista.remover("C");
        lista.imprimir(); // Esperado: (vazio)
        lista.imprimirReverso(); // Esperado: (vazio)

        System.out.println("Teste 4: Adicionar elementos novamente e remover o último");
        lista.adicionar("X");
        lista.adicionar("Y");
        lista.adicionar("Z");
        lista.imprimir(); // Esperado: X Y Z
        lista.imprimirReverso(); // Esperado: Z Y X
        lista.remover("Z");
        lista.imprimir(); // Esperado: X Y
        lista.imprimirReverso(); // Esperado: Y X

        System.out.println("Teste 5: Adicionar elementos e remover o único elemento");
        CircularDoublyLinkedList lista2 = new CircularDoublyLinkedList();
        lista2.adicionar("1");
        lista2.imprimir(); // Esperado: 1
        lista2.imprimirReverso(); // Esperado: 1
        lista2.remover("1");
        lista2.imprimir(); // Esperado: (vazio)
        lista2.imprimirReverso(); // Esperado: (vazio)
    }
}
