package Topico2.ExeVendas;


public class Vendedor {
    String nome;
    int numeroMAxVendas=12;
    int numeroAtualVend=0;
    Venda[] vendas= new Venda[numeroMAxVendas];
    public Vendedor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Venda[] getVendas() {
        return vendas;
    }
    public void setVendas(Venda venda) {
        this.vendas[numeroAtualVend] = venda;
        numeroAtualVend++;
    }
    public void ordenacao() {
        for (int fim =this.numeroAtualVend; fim> 0; fim--) {
            for (int i = 0; i < fim; i++) {
                if(vendas[i]==null||vendas[i+1]==null) break;  
                if(vendas[i].mes>vendas[i+1].mes){
                    Venda temp=vendas[i];
                    vendas[i]=vendas[i+1];
                    vendas[i+1]=temp;
                }
                
            }
        }
    }


}
