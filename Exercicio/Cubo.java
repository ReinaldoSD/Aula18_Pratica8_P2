package Exercicio;

public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * this.lado * this.lado;
    }

    @Override
    public double calcularVolume() {
        return this.lado * this.lado * this.lado;
    }
    
}