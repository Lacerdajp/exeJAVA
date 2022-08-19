package P1Monitoria;

import java.util.ArrayList;

public abstract class Personagem {
    private final String nome;
    private double pontuacao;
    private  int qtForca;
    private  int  qtInteligencia;
    private  int  qtVida;
    private final Sexo sexo;
    private  ArrayList<Item> itens=new ArrayList<Item>();

    //construtor
    public Personagem(String nome,Sexo sexo) {
        this.nome = nome;
        this.sexo=sexo;
        this.qtForca=sexo.getForca();
        this.qtInteligencia=sexo.getInteligencia();
        this.qtVida=100;
    }

    //adicionar item 
    public void adicionarItem(Item item) {
        this.itens.add(item);
        atualizarVida(item.getVida());
        atualizarForca(item.getForca());
        atualizarInteligencia(item.getInteligencia());
    }
    public void removerItem(Item item) {
        this.itens.remove(item);
        atualizarVida(-item.getVida());
        atualizarInteligencia(-item.getInteligencia());
        atualizarForca(-item.getForca());
    }


    public void recebeDano(int dano){
        atualizarVida(-dano);
    }


    //atualizar atributos
    public void atualizarVida(int vidaNova) {
        qtVida=qtVida+vidaNova;
        if(qtVida>=100) qtVida=100;
        if(qtVida<=0) qtVida=0;
    }
    public void atualizarForca(int forcaNova) {
        qtForca=qtForca+forcaNova;
        if(qtForca>=100) qtForca=100;
        if(qtForca<=0) qtForca=0;
    }
    public void atualizarInteligencia(int inteligenciaNova) {
        qtInteligencia=qtInteligencia+inteligenciaNova;
        if(qtInteligencia>=100) qtInteligencia=100;
        if(qtInteligencia<=0) qtInteligencia=0;
    }





    //Getters and Setters
    public Sexo getSexo() {
        return sexo;
    }
    public String getNome() {
        return nome;
    }
     public double getPontuacao() {
         return pontuacao;
     }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setQtForca(int qtForca) {
        this.qtForca = qtForca;
    }

    public void setQtInteligencia(int qtInteligencia) {
        this.qtInteligencia = qtInteligencia;
    }

    public void setQtVida(int qtVida) {
        this.qtVida = qtVida;
    }

    public int  getQtForca() {
        return qtForca;
    }
    public int  getQtInteligencia() {
        return qtInteligencia;
    }
    public int  getQtVida() {
        return qtVida;
    }
    public ArrayList<Item> getItens() {
        return itens;
    } 




    
    
}
