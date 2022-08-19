package P1Monitoria;

public class Mago extends Personagem {
    private int mana=0;
    public Mago(String nome, Sexo sexo) {
        super(nome, sexo);
    }

    public int  lancarMagia() {
        int danoCausado=0;
        if (mana>0) {
            danoCausado=getMana()*getQtInteligencia();
        }
        else{
            System.out.println("Não Possui mana suficiente");
        }
        return danoCausado;
    }




    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }


    
}
