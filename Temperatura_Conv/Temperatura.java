package Temperatura_Conv;

import java.util.*;
public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float C, F, K, E;
        System.out.println("Insira a temperatura em Celsius");
        C = sc.nextFloat();
         if (C < -273.15) {
            System.out.println("Entrada inválida!");        }
         else {
             Scanner escolha = new Scanner (System.in);
      String opcao;
      System.out.println("Digite F para Fahrenheit ou K para Kelvin para Converter");
      opcao = escolha.nextLine();
           if (opcao.equals("F")) {
          F = (C * 1.8f) + 132f;
          System.out.println("A temperatura em Fahrenheit é " +F); }
              if (opcao.equals("K")) {
          K = C + 273.15f;
          System.out.println("A temperatura em Kelvin é " +K); }
              
              else {
                  System.out.println("Opcao invalida!");
              }
    }
}
}