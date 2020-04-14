package projlistaligada;

public class ListaLigada {

    private Node header; // início da lista ligada
    private Node trailer; // fim da lista ligada
    private int size;    // quantidade de elementos na lista ligada

    public ListaLigada() {
        // construtor - cria uma lista vazia
        header = null;
        trailer = null;
        size = 0;
    }

    public int size() {
        // retorna o tamanho da lista	
        return size;
    }

    public boolean isEmpty() {
        // verifica se a lista está vazia
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Node first() {
        // retorna o Nó inicial da lista
        return header;
    }

    public Node last() {
        // retorna o nó final da lista
        return trailer;
    }

    public void addFirst(Node produto) {
        // adiciona um produto no início da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = produto;
            trailer = produto;
        } else {
            // já existe pelo menos um produto na lista
            produto.next = header;
            header = produto;
        }
        size++;
    }

    public void addLast(Node produto) {
        // adiciona um produto no final da Lista
        if (isEmpty()) {
            // a lista está vazia
            header = produto;
            trailer = produto;
        } else {
            // já existe pelo menos um produto na lista
            trailer.next = produto;
            trailer = produto;
        }
        size++;
    }

    public void mostraLista() {
        //mostra todos os elementos da lista
        Node aux = header;
        header.mostraProduto();
        while (aux.next != null) {
            aux = aux.next;
            aux.mostraProduto();
        }
        System.out.println("Fim da Lista!");
        System.out.println("-------------");
    }
    
    
    public void MaiorValor(){
        Node aux = header;
        String y = header.produto.descricao;
        double x = header.produto.calcTotal();
        while (aux.next != null) {
            aux = aux.next;
           if(x<aux.produto.calcTotal()){
               x = aux.produto.calcTotal();
               y= aux.produto.descricao;
           }
        }
        System.out.println("Maior valor total: R$"+x);
        System.out.println("Produto: "+y);
        System.out.println("-------------");
    
    }
    public void MenorValor(){
        Node aux = header;
        String y = header.produto.descricao;
        double x = header.produto.calcTotal();
        while (aux.next != null) {
            aux = aux.next;
           if(x>aux.produto.calcTotal()){
               x = aux.produto.calcTotal();
               y= aux.produto.descricao;
           }
        }
        System.out.println("Menor valor total: R$"+x);
        System.out.println("Produto: "+y);
        System.out.println("-------------");
    
    }
          
    
}
