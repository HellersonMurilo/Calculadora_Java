package br.com.senai.operacao;

public class Operacoes {
    private	String operador;
	private char operadorChar;
	private String strNumeros;
	private double num1, num2, resultado;
	
	public char getOperadorChar() {
		return operadorChar;
	}
	
	public void setOperadorChar(char operadorChar) {
		this.operadorChar = operadorChar;
	}
	
	public String getOperador() {
		return operador;
	}
	
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public String getStrNumeros() {
		return strNumeros;
	}
	
	public void setStrNumeros(String strNumeros) {
		this.strNumeros = strNumeros;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getResultado() {
		return resultado;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
}
