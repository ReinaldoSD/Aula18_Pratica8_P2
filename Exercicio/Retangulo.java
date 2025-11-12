package Exercicio;

public class Retangulo extends FormaBidimensional{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
    
}