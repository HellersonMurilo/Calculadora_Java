package br.com.senai.operacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CalculadoraGeral {
    ArrayList<String> historico = new ArrayList<String>();
    Operacoes operacao = new Operacoes();

    public int inicioOp() {

        int inicio = 0;
        boolean booleano = false;
        boolean booleanoChar = false;
        double resultado;

        while (booleano == false) {
            inicio = Integer.parseInt(JOptionPane.showInputDialog(
                    " ### SEJA BEM VINDO A CALCULADORA JCP ### \n Digite sua opção: \n 1 - Calcular \n 2 - Historico \n 3 - Encerrar Calculadora"));
            while (inicio > 3 || inicio < 0) {
                JOptionPane.showMessageDialog(null, "Opção não encontrada, por favor tente novamente");
                inicio = Integer.parseInt(JOptionPane.showInputDialog(
                        " ### SEJA BEM VINDO A CALCULADORA JCP ### \n Digite sua opção: \n 1 - Calcular \n 2 - Historico \n 3 - Encerrar Calculadora"));
            }
            if (inicio == 1) {
                operacao.setNum1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
                operacao.setNum2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));

                while (booleanoChar == false) {
                    operacao.setOperador(JOptionPane.showInputDialog("Digite o operador: "));
                    switch (operacao.getOperador()) {
                        case "+":
                            operacao.setOperadorChar('+');
                            resultado = operacao.getNum1() + operacao.getNum2();
                            operacao.setResultado(resultado);
                            booleanoChar = true;
                            String calculo = operacao.getNum1() + "+" + operacao.getNum2() + "="
                                    + operacao.getResultado();
                                    historico.add(calculo);
                            break;
                        case "-":
                            operacao.setOperadorChar('-');
                            resultado = operacao.getNum1() - operacao.getNum2();
                            operacao.setResultado(resultado);
                            booleanoChar = true;
                            calculo = operacao.getNum1() + "-" + operacao.getNum2() + "="
                                    + operacao.getResultado();
                                    historico.add(calculo);
                            break;
                        case "*":
                            operacao.setOperadorChar('*');
                            resultado = operacao.getNum1() * operacao.getNum2();
                            operacao.setResultado(resultado);
                            booleanoChar = true;
                             calculo = operacao.getNum1() + "*" + operacao.getNum2() + "="
                                    + operacao.getResultado();
                                    historico.add(calculo);
                            break;
                        case "/":
                            operacao.setOperadorChar('/');
                            resultado = operacao.getNum1() / operacao.getNum2();
                            operacao.setResultado(resultado);
                            booleanoChar = true;
                             calculo = operacao.getNum1() + "/" + operacao.getNum2() + "="
                                    + operacao.getResultado();
                                    historico.add(calculo);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Operador informado inválido, tente novamente");
                            break;
                    }
                }
                JOptionPane.showMessageDialog(null, "O resultado é: " + operacao.getResultado());
                booleanoChar = false;
            }
            if (inicio == 2) {
                /* HISTORICO */
                JOptionPane.showMessageDialog(null, "Histórico de Contas \n" + historico);
            }
            if (inicio == 3) {
                JOptionPane.showMessageDialog(null, "Calculadora Encerrada");
                System.exit(0);
            }

        }
        return inicio;
    }
}
