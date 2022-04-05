package Topico2.ExeVendas;

public class Main {
    public static void main(String[] args) {
        Comercio tenis=new Comercio();
        //Inserir empresas no mercado
        tenis.inserirEmpresa("Nike");
        tenis.inserirEmpresa("Adidas");
        //inserir funcionario
        tenis.inserirFuncionario("Nike","João Pedro Lacerda");
        tenis.inserirFuncionario("Adidas","Jorge Duarte");
        tenis.inserirFuncionario("Nike","Lucas Braga");
        
        //inserir vendas
        tenis.inserirVenda("João Pedro Lacerda", 200.00,1);
        tenis.inserirVenda("Jorge Duarte", 50.00, 2);
        tenis.inserirVenda("João Pedro Lacerda", 500.00, 3);
        tenis.inserirVenda("João Pedro Lacerda", 500.00, 4);
        tenis.inserirVenda("João Pedro Lacerda", 500.00, 5);
        tenis.inserirVenda("João Pedro Lacerda", 500.00, 4);
        tenis.inserirVenda("João Pedro Lacerda", 200.00, 2);
        tenis.inserirVenda("João Pedro Lacerda", 200.00, 6);

        //imprimir
        System.out.println("Funcionario:    |"+ "Empresa  |"+" comissao  " );
        for (Empresa empresa : tenis.getEmpresas()) {
            if(empresa==null) break;
            for (Vendedor vendedor : empresa.getVendedor()) {
                if(vendedor==null) break;
                 vendedor.ordenacao();   
                 System.out.println(vendedor.getNome()+" |"+empresa.getRazaoSocial()+" |"+tenis.comissaoVendedor(vendedor));
            }
            
        }

        

    }
}
