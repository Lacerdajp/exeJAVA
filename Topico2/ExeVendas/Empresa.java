package Topico2.ExeVendas;

public class Empresa {
    String razaoSocial;
    int numeroMaxVendedor=5;
    int numeroAtualVendedor=0;
    Vendedor[] vendedor= new Vendedor[numeroMaxVendedor];
    public Empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public Vendedor[] getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor[numeroAtualVendedor] = vendedor;
        numeroAtualVendedor++;
        
    }
}
