package Topico2.ExeCarro;


public class Competicao {
    int quantidadeMaxCars=6;
    int quantidadeNaCorrida=0;
    Carro[] carros=new Carro[quantidadeMaxCars];

    public void adicionaCarro(String nomeCarro) {
        carros[quantidadeNaCorrida]=new Carro(nomeCarro);
        quantidadeNaCorrida++;
    }
    public void escolhaAument(String nomeCarro,int vel) {
        for (Carro carro : carros) {
            if(carro==null) break;
            if(carro.getNomeCarro()==nomeCarro){
                carro.aumentarVel(vel);
            }
        }
    }
    public void escolhaDim(String nomeCarro,int vel) {
        for (Carro carro : carros) {
            if(carro==null) break;
            if(carro.getNomeCarro()==nomeCarro){
                carro.diminuirVel(vel);
            }
        }
    }
    public void corrida(int tempo) {
        for (Carro carro : carros) {
            if(carro==null) break;
                carro.percorrer(tempo);
        }
        ordenacao();
        campeoes();
    }
    public void campeoes() {
       for (int carro = 0; carro < this.quantidadeMaxCars; carro++) {
        if(carros[carro]==null) break;  
           switch (carro) {
               case 0:
                   System.out.println("Primeiro: "+carros[carro].getNomeCarro() +" "+carros[carro].getDistanciaTotal() );
                   break;
                case 1:
                   System.out.println("Segundo: "+carros[carro].getNomeCarro()+" "+carros[carro].getDistanciaTotal()  );
                   break;
                case 2:
                   System.out.println("Terceiro: "+carros[carro].getNomeCarro()+" "+carros[carro].getDistanciaTotal()  );
                   break;
                
                
               default:
               System.out.println("Retardatarios: "+carros[carro].getNomeCarro()+" "+carros[carro].getDistanciaTotal()  );
                   break;
           }
       }
    }
    public void ordenacao() {
        for (int fim =this.quantidadeMaxCars; fim> 0; fim--) {
            for (int i = 0; i < fim; i++) {
                if(carros[i]==null||carros[i+1]==null) break;  
                if(carros[i].getDistanciaTotal()<carros[i+1].getDistanciaTotal()){
                    Carro temp=carros[i];
                    carros[i]=carros[i+1];
                    carros[i+1]=temp;
                }
                
            }
        }
    }
}
