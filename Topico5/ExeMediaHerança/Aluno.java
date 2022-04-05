package Topico5.ExeMediaHerança;

public class Aluno extends Pessoa {
    protected Nota[]notas;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }
    public void addNota() {
        
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

}
