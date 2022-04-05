package Topico3.ExeIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double altura=scan.nextDouble();
            double  massa=scan.nextDouble();
            IMC imc=new IMC();
            imc.calculoIMC(altura, massa);
            System.out.println(imc.getImc());
        }
        
    }
}
