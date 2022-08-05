package Topico2.ExeCarro;

public class Main {
    public static void main(String[] args) {
        Competicao corridaAmericas=new Competicao();
      
        corridaAmericas.adicionaCarro("Ferrari");
        corridaAmericas.adicionaCarro("Lamburguine");
        corridaAmericas.adicionaCarro("Honda fit");
        corridaAmericas.adicionaCarro("Ford car");  
        
        corridaAmericas.adicionaCarro("BMW");

        corridaAmericas.escolhaAument("Ferrari", 140);
        corridaAmericas.escolhaAument("BMW", 160);
        corridaAmericas.escolhaAument("Lamburguine", 130);
        corridaAmericas.escolhaAument("Honda fit", 90);
        corridaAmericas.escolhaAument("Ford car", 60);

        corridaAmericas.escolhaDim("Ferrari", 20);
        corridaAmericas.escolhaDim("BMW", 31);

        corridaAmericas.corrida(20);
    }  
}
