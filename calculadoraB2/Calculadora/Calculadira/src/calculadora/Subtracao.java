package calculadora;

public class Subtracao {
    private double num1;
    private double num2;

    public Subtracao(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //metodos 
    public double subtracao(){
        return (this.num1 - num2);
    }
}