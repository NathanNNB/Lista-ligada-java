
package projlistaligada;

public class produto {
    String codigo;
    String descricao;
    double precoUnitario;
    int qtde;
    
    
    
    produto(String codigo, String descricao,double precoUnitario, int qtde){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario; 
        this.qtde = qtde;
    
    }
    
    public void mostraProduto(){
        System.out.println("Código: "+this.codigo);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Preço unitário: R$"+this.precoUnitario);
        System.out.println("Quantidade: "+this.qtde);
        System.out.println("Valor total: R$"+calcTotal());
        System.out.println("-------------");
        
    }
    
    public double calcTotal(){
    
        double total = this.precoUnitario * this.qtde;
        return total;
        
    }
}
