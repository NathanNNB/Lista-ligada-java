package projlistaligada;

public class Node {
    produto produto;	// elemento armazenado no nó
    Node next;	// próximo elemento da lista... que também é do tipo  Node

    Node(produto produto) {
        // construtor	
        this.produto = produto;
        next = null;
    }

    
    
    public void mostraProduto(){
        produto.mostraProduto();
    }
}
