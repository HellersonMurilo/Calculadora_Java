package calculadora;

public class Soma {
    private double num1;
    private double num2;

    public Soma(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //metodos 
    public double soma(){
        return (this.num1 + num2);
    }
}
