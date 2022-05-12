package PO;

public class TesteDeDownCasting {
    public static void main(String[] args) {
        Forma[] formas;
        formas= TestaForma.criaFormas(10);
        for (Forma forma : formas) {
            System.out.println("Forma Geometrica: "+ forma.getTipo()+ " Valor1 = "+ forma.getVal1()+" Valor 2= " +forma.getVal2());
            forma. imprime();
        }
    }
}
