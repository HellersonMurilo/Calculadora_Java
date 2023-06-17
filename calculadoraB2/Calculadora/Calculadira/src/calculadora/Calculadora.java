package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int raiz = 0;

        System.out.println("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o primeiro valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação: ");
        String operacao = scanner.next();

        double resultado = 0.0;

        Soma soma = new Soma(num1, num2);
        Subtracao subtracao = new Subtracao(num1, num2);
        Multiplicar multiplicar = new Multiplicar(num1, num2);
        Dividir dividir = new Dividir(num1, num2);

        switch (operacao) {
            case "+":
                resultado = soma.soma();
                break;
            case "-":
                resultado = subtracao.subtracao();
                break;
            case "*":
                resultado = multiplicar.multiplicar();
                break;
            case "/":
                resultado = dividir.dividir();
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }

        System.out.println("Resultado: " + resultado);

            System.out.println("Caso deseje obter a raiz quadrada digite 1");
            raiz = scanner.nextInt();
            if (raiz == 1) {
                double resultadoRaiz = Math.sqrt(resultado);
                System.out.println("raiz quadrada igua a: " + resultadoRaiz);
            }
        
    }
}