package calculadora;

public class Dividir {
    private double num1;
    private double num2;

    public Dividir(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // metodos
    public double dividir() {
        if (dividir() != 0) {
            return num1 / num2;
        }
        else{
            System.out.println("nao é possivel dividir por 0");
            return 0;
        }
        
    }
}
