package AtividadeSomativa;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Digite o 1° valor!!");
        double valorUm = sc.nextDouble();
        System.out.println("Digite o 2° valor!!");
        double valorDois = sc.nextDouble();
        System.out.println(
                "Escolha o método de operação, para ADIÇÃO (1), SUBTRAÇÃO (2), DIVISÃO (3), MULTIPLICAÇÃO (4)");
        int metodo = sc.nextInt();

        if (metodo == 1) {

            System.out.println(" O resultado é " + (valorUm += valorDois));
        } else if (metodo == 2) {

            System.out.println(" O resultado é " + (valorUm -= valorDois));
        } else if (metodo == 3 && valorDois != 0) {

            System.out.println(" O resultado é " + (valorUm /= valorDois));
        } else if (metodo == 4) {

            System.out.println(" O resultado é " + (valorUm *= valorDois));
        } else {
            System.out.println(
                    "Método não identificado, Digite novamente para ADIÇÃO (1), SUBTRAÇÃO (2), DIVISÃO (3), MULTIPLICAÇÃO (4)");
        }
    }

    public void exercicio2() {
     System.out.println(" Digite o Número de matricula do aluno!! ");
     int nMatricula = sc.nextInt();
     double moduloOuResto = nMatricula%2;
    if ( moduloOuResto == 0 && nMatricula <=1000 ) {
        System.out.println(" O aluno está no Time do Chris");
    } else if ( moduloOuResto != 0 && nMatricula <=1000 ) {
        System.out.println(" O aluno está no Time do  Greg");
    } else if (moduloOuResto == 0 && nMatricula >=1000) {
        System.out.println(" O aluno está no Time do  Caruso");
    } else if ( moduloOuResto != 0 && nMatricula >=1000) {
        System.out.println(" O aluno está no Time do  Jerome");
    }
    }

    public void exercicio3() {
        

     System.out.println(" Quantos kilos de maças foram compradas? ");
     double kilos = sc.nextDouble();
     double valor = 2.30;
    

     System.out.println(" Quantos kilos de bananas foram compradas? ");
        double kilos1 = sc.nextDouble();
        double valor1 = 1.80;

        System.out.println(" Quantos kilos de morangos foram compradas? ");
        double kilos2 = sc.nextDouble();
        double valor2 = 3.50;

        double totalPreco = valor+valor1+valor2;
        double totalKilos = kilos+kilos1+kilos2;
  
       
        if ( totalKilos>= 15 || totalPreco>= 30 ) {
          double total = totalKilos - totalKilos*0.1;
          System.out.println(" O valor do produto é R$ " + total);
        }
        

        
    }
}

