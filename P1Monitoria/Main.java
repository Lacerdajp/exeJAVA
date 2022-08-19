package P1Monitoria;

public class Main {
    public static void main(String[] args) {
        Jogo joguinho=new Jogo();

        Fase inferno =new Fase("Inferno", 1);
        inferno.definirDificuldade();
        Fase maritma= new Fase("Maritma", 5);
        maritma.definirDificuldade();

        Guerreiro joao=new Guerreiro("João Pedro", Sexo.MASCULINO);
        Mago helena=new Mago("Helena", Sexo.FEMININO);

        Item espada =new Item("Espada",20,0,0) {};
        Item livroMagico=new Item("Livro Magico",0,20,0){};


        joao.adicionarItem(espada);
        joao.adicionarItem(espada);
        joao.setEstamina(1);
        helena.recebeDano(joao.ataquePoderoso());

        joguinho.adicionarFases(inferno);
        joguinho.adicionarFases(maritma);
        joguinho.setEstado(Estado.ATIVO);
        joguinho.adicionarPersonagem(joao);
        joguinho.adicionarPersonagem(helena);

        for (Fase fase : joguinho.getFases()) {
            System.out.println(fase.getNome()+" "+fase.getDificuldade());
        }


        for (Personagem personagem : joguinho.getPersonagens()) {
            System.out.println(personagem.getNome()+" "+personagem.getQtForca()+" "+personagem.getQtInteligencia()+" "+personagem.getQtVida()+" "+personagem.getSexo().toString());
        }



    }
    
}
