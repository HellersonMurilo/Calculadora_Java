package calculadora;

public class Multiplicar {
    private double num1;
    private double num2;

    public Multiplicar(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // metodos
    public double multiplicar() {
        return (this.num1 * num2);
    }
}
