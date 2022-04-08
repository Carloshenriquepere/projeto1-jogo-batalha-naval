package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // write your code here
        boolean contianuaPartida = true;

        Scanner scanner = new Scanner(System.in);
        Cenario mapa = new Cenario();
        String entrada;

        while (contianuaPartida ){
            System.out.println("Entre com as posições x e y no formato x , y ou 'fim' para sair");
            entrada = scanner.nextLine();
            String[] numeros = entrada.split(",");
            if (entrada.equals("fim"))
                break;
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            System.out.println("x = " + x + ", e y =" + y);

            contianuaPartida = mapa.disparo(x,y);
            mapa.desenhaCenario();
        }

    }
}
