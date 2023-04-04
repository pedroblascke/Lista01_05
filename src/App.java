import java.util.Scanner;

public class App {

    public static void main (String[] args){

    //5- Faça um Programa que converta metros para centímetros.
    
    System.out.println("Por favor, digite um valor em metros");

    Scanner teclado = new Scanner(System.in);
    double numero = teclado.nextDouble();
    
    teclado.close();

    double total = (numero * 100);
    System.out.println("Seu número, em centímetros, é de: " + total + "cm");

    }
}


