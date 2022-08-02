package Topico2.ExeVendas;

import java.util.ArrayList;

public class Vendedor {
    private String nome;
    private ArrayList<Venda> vendas=new ArrayList<Venda>();
    public Vendedor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(Venda venda) {
        this.vendas.add(venda);
    }
    public void ordenacao() {
       vendas.sort((o1, o2) ->Integer.compare(o1.getMes(), o2.getMes()) );
    }


}
