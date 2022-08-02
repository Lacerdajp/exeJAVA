package Topico3.ExeMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor= new ConversorMoeda();
        System.out.println("Digite o Valor e logo depois o tipo da moeda:");
        Scanner sc= new Scanner(System.in);
        Moeda atual=new Moeda(Double.valueOf(sc.nextLine()),TipoMonetario.valueOf(sc.nextLine().toLowerCase()));

        System.out.println("Digite para qual tipo de moeda deseja converter");
        Moeda nova=  conversor.converter(atual, TipoMonetario.valueOf(sc.nextLine().toLowerCase()));


        System.out.println("O valor da moeda em "+ nova.getTipo().toString()+" é: "+nova.getValor());
    }
}
