package Topico2.ExeVendas;

import java.util.ArrayList;

public class Comercio {
        private ArrayList<Empresa> empresas=new ArrayList<Empresa>();
        public ArrayList<Empresa> getEmpresas() {
                return empresas;
            }
        public void inserirEmpresa(String nomeEmpresa) {
            this.empresas.add(new Empresa(nomeEmpresa));
        }
        public void inserirFuncionario(String nomeEmpresa, String nomeFuncionario) {
            for (Empresa empresa : this.empresas) {
                // if(empresa==null) break;
                if(nomeEmpresa==empresa.getRazaoSocial()){
                    Vendedor funcionario=new Vendedor(nomeFuncionario);
                    empresa.setVendedores(funcionario);
                }
                
            }
            }
        public void inserirVenda(String nomeFuncionario, double valor, int mes) {
            for (Empresa empresa : this.empresas) {
                // if(empresa==null) break;
                for (Vendedor funcionario : empresa.getVendedores()) 
                    {
                        // if(funcionario==null)break;
                        if (nomeFuncionario==funcionario.getNome()) {
                            Venda venda=new Venda(mes, valor);
                            funcionario.setVendas(venda);
                        }
                        
                    }
                }
                
        }
        public double comissaoVendedor(Vendedor funcionario) {
            double soma=0,comissao=0,somatotal=0;
                for (Venda venda : funcionario.getVendas()) {
                    // if(venda==null)break;
                        somatotal=somatotal+venda.getValor();
                        if(somatotal>2000){
                            comissao=(venda.getValor()*10)/100;
                        }
                        else{
                            comissao=(venda.getValor()*5)/100;
                        }
                    soma=comissao+soma;
                            
                }
            return soma;
        }
       
}
