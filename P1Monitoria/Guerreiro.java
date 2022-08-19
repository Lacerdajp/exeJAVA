package P1Monitoria;

public class Guerreiro extends Personagem {
    private int estamina=0;
    public Guerreiro(String nome,Sexo sexo) {
        super(nome,sexo);
    }


    public  int ataquePoderoso(){
        int danoCausado=0;
        if (estamina>0) {
            danoCausado=getEstamina()*getQtForca();
        }else{
            System.out.println("Não Possui estamina suficiente");
        }
        return  danoCausado;
    }

    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    


    
    


    
}
