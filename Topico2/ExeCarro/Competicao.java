package Topico2.ExeCarro;

import java.util.ArrayList;
import java.util.Collections;

public class Competicao {

    private ArrayList<Carro> carros=new ArrayList<Carro>();

    public void adicionaCarro(String nomeCarro) {
        carros.add(new Carro(nomeCarro));
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
       for (int carro = 0; carro < this.carros.size(); carro++) {
        if(carros.get(carro)==null) break;  
           switch (carro) {
               case 0:
                   System.out.println("Primeiro: "+carros.get(carro).getNomeCarro() +" "+carros.get(carro).getDistanciaTotal() );
                   break;
                case 1:
                   System.out.println("Segundo: "+carros.get(carro).getNomeCarro() +" "+carros.get(carro).getDistanciaTotal() );
                   break;
                case 2:
                   System.out.println("Terceiro: "+carros.get(carro).getNomeCarro() +" "+carros.get(carro).getDistanciaTotal()) ;
                   break;
                
                
               default:
               System.out.println("Retardatarios: "+carros.get(carro).getNomeCarro() +" "+carros.get(carro).getDistanciaTotal() );
                   break;
           }
       }
    }
    public void ordenacao() {
        carros.sort((o1, o2) -> Integer.compare(o1.getDistanciaTotal(), o2.getDistanciaTotal()));
        Collections.reverse(carros);
    }
}
