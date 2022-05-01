package P2.Questão3;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        ElementoQuimico a=new ElementoQuimico("Agua", "H20", 2, 0.5);
        ElementoQuimico b=new ElementoQuimico("Beba", "Kl", 15, 2.5);
        ElementoQuimico c=new ElementoQuimico("Hoje", "Xm", 13, 6.5);
        ElementoQuimico d=new ElementoQuimico("Seila", "Ph", 10, 8.5);
        ElementoQuimico e=new ElementoQuimico("Filho", "H2B", 2, 5.5);
        ElementoQuimico[] elementos=new ElementoQuimico[]{a,b,c,d,e};
        System.out.println(Arrays.toString(elementos));
        Arrays.sort(elementos);
        System.out.println(Arrays.toString(elementos));
    }
}
