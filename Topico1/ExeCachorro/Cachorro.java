package ExeCachorro;


public class Cachorro {
    String nome;

    public void late(Cachorro cachorro) {
        System.out.printf("%s: AUAU\n", cachorro.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cachorro c1;
        Cachorro c2;
        c1 = new Cachorro();
        c1.setNome("Genaro");
        c1.late(c1);
        c2 = new Cachorro();
        c2.setNome("Bingo");
        c2.late(c2);

    }
}
