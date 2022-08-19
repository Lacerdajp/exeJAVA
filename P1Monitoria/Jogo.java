package P1Monitoria;
import java.util.ArrayList;

public class Jogo {
    private ArrayList<Fase>fases=new ArrayList<Fase>();
    private ArrayList<Personagem>personagens=new ArrayList<Personagem>();
    private Estado estado;

    //adiciona valores as listas
    public void adicionarPersonagem(Personagem personagem){
        this.personagens.add(personagem);
    }
    public void adicionarFases(Fase fase){
        this.fases.add(fase);
    }
    //adiciona 
    public void removerPersonagem(Personagem personagem) {
        this.personagens.remove(personagem);
    }
    public void removerFase(Fase fase) {
        this.fases.remove(fase);
        
    }




    //getters and setters
    public ArrayList<Fase> getFases() {
        return fases;
    }
    public void setFases(ArrayList<Fase> fases) {
        this.fases = fases;
    }
    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }
    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
}
