package Exercicio;

public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }
    
}
