package Topico2.ExeVendas;

public class Comercio {
    
            int numeroMax=10;//numero maximo de empresas que podem estar ao mercado
            int numeroAtual=0;//numero atual de empresas no mercado
            Empresa[] empresas=new Empresa[numeroMax];

        public Empresa[] getEmpresas() {
                return empresas;
            }
        public void inserirEmpresa(String nomeEmpresa) {
            this.empresas[numeroAtual]=new Empresa(nomeEmpresa);
            numeroAtual++;
        }
        public void inserirFuncionario(String nomeEmpresa, String nomeFuncionario) {
            for (Empresa empresa : this.empresas) {
                if(empresa==null) break;
                if(nomeEmpresa==empresa.razaoSocial){
                    Vendedor funcionario=new Vendedor(nomeFuncionario);
                    empresa.setVendedor(funcionario);
                }
                
            }
            }
        public void inserirVenda(String nomeFuncionario, double valor, int mes) {
            for (Empresa empresa : this.empresas) {
                if(empresa==null) break;
                for (Vendedor funcionario : empresa.vendedor) 
                    {
                        if(funcionario==null)break;
                        if (nomeFuncionario==funcionario.nome) {
                            Venda venda=new Venda(mes, valor);
                            funcionario.setVendas(venda);
                        }
                        
                    }
                }
                
        }
        public double comissaoVendedor(Vendedor funcionario) {
            double soma=0,comissao=0,somatotal=0;
                for (Venda venda : funcionario.vendas) {
                    if(venda==null)break;
                        somatotal=somatotal+venda.valor;
                        if(somatotal>2000){
                            comissao=(venda.valor*10)/100;
                        }
                        else{
                            comissao=(venda.valor*5)/100;
                        }
                    soma=comissao+soma;
                            
                }
            return soma;
        }
       
}
