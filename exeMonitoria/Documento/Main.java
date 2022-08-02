package exeMonitoria.Documento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1=new Pessoa("João Pedro Lacerda ", "Henrique Geraldo",
         "Dayane Lacerda", 30, 11, 2000,
          Nacionalidade.BR, Sexo.MASCULINO, EstadoCivil.CASADO, 1.70, 70.0);
        
        System.out.println(pessoa1.getSexo().toString());
    }
}
