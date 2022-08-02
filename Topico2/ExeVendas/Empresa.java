package Topico2.ExeVendas;

import java.util.ArrayList;

public class Empresa {
    private String razaoSocial;
    private ArrayList<Vendedor> vendedores= new ArrayList<Vendedor>();
    public Empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
    public void setVendedores(Vendedor vendedor) {
        this.vendedores.add(vendedor);
        
    }
}
