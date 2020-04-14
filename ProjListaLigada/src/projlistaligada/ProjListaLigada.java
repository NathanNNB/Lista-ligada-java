//Nathan Novais Borges
//TIA: 31987869
package projlistaligada;

public class ProjListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        produto caneta1 = new produto("001","Caneta Azul",1.5,5);
        produto caneta2 = new produto("002","Caneta Vermelha",2,1);
        produto caneta3 = new produto("003","Caneta Preta",1.5,3);
        produto caneta4 = new produto("004","Caneta Verde",2,3);
        produto caneta5 = new produto("005","Caneta Rosa",4,1);
        
        Node n1 =new Node(caneta1);
        lista.addFirst(n1);
        Node n2 =new Node(caneta2);
        lista.addLast(n2);
        Node n3 =new Node(caneta3);
        lista.addLast(n3);
        Node n4 =new Node(caneta4);
        lista.addLast(n4);
        Node n5 =new Node(caneta5);
        lista.addLast(n5);
        
        lista.mostraLista();
        lista.MaiorValor();
        lista.MenorValor();
    }
    
    
}
