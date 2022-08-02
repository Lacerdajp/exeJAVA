package exeMonitoria.Documento;

public class Pessoa {
    private String nome, nomePai, nomeMae;
    private int diaNascimeto, mesNascimento,anoNascimento;
    private Nacionalidade nacionalidade;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private double altura,peso;
    

    public Pessoa(String nome, String nomePai, String nomeMae, int diaNascimeto, int mesNascimento, int anoNascimento,
            Nacionalidade nacionalidade, Sexo sexo, EstadoCivil estadoCivil, double altura, double peso) {
        this.nome = nome;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.diaNascimeto = diaNascimeto;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public int getDiaNascimeto() {
        return diaNascimeto;
    }
    public void setDiaNascimeto(int diaNascimeto) {
        this.diaNascimeto = diaNascimeto;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    
    
    
    
}
