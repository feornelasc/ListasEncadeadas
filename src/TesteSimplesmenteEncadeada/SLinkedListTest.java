package TesteSimplesmenteEncadeada;

import ListaSimplesmenteEncadeada.SLinkedList;

public class SLinkedListTest {

    public static void main(String[] args) {
        System.out.println("Teste 1: Adicionar elementos e imprimir");
        SLinkedList lista = new SLinkedList();
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.imprimir(); // Esperado: A B C

        System.out.println("Teste 2: Remover um elemento e imprimir");
        lista.remover("B");
        lista.imprimir(); // Esperado: A C

        System.out.println("Teste 3: Remover o primeiro elemento e imprimir");
        lista.remover("A");
        lista.imprimir(); // Esperado: C

        System.out.println("Teste 4: Remover o último elemento e imprimir");
        lista.remover("C");
        lista.imprimir(); // Esperado: (vazio)

        System.out.println("Teste 5: Adicionar elementos e imprimir novamente");
        lista.adicionar("X");
        lista.adicionar("Y");
        lista.adicionar("Z");
        lista.imprimir(); // Esperado: X Y Z
    }
}
