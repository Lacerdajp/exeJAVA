package PO;

import java.util.Random;

public class TestaForma {
    Forma[] formas;
    
    public static Forma[] criaFormas(int quantidade) {
        Forma[]formas=new Forma[]{};
        Random rand =new Random();
        double tam, tam2;
        for (int i = 0; i < quantidade; i++) {
            int v=rand.nextInt(1,4);
        switch (v) {
            case 1:
                Quadrado quadrado=new Quadrado();
                tam=rand.nextDouble(100);
                quadrado.setTipo("Quadrado");
                quadrado.setLargura(tam);
                quadrado.setComprimento(tam);
                formas[i]=quadrado;
                break;
            case 2:
                Retangulo ret=new Retangulo();
                ret.setTipo("Retangulo");
                do{
                tam=rand.nextDouble(100);
                tam2=rand.nextDouble(100);
                }while(tam==tam2);
            
                break;
            case 3:
                Elipse elipse=new Elipse();
                elipse.setTipo("elipse");
                do{
                    tam=rand.nextDouble(100);
                    tam2=rand.nextDouble(100);
                    }while(tam==tam2);
                if (tam>tam2) {
                }
                break;
            default:
                Circulo circulo=new Circulo();
                tam=rand.nextDouble(100);
                circulo.setTipo("Circulo");
                break;
        }

        }
        
    return formas;
    }
    
}
