package Exercicio;
import java.util.ArrayList;

public class TesteFormasGeometricas {
    public static void main(String[] args) {

        ArrayList<FormaBidimensional> formas2D = new ArrayList<>();
        ArrayList<FormaTridimensional> formas3D = new ArrayList<>();


        Quadrado quadrado1 = new Quadrado(13);
        formas2D.add(quadrado1);

        Retangulo retangulo1 = new Retangulo(20, 2);
        formas2D.add(retangulo1);

        Circulo circulo1 = new Circulo(35);
        formas2D.add(circulo1);

        Quadrado quadrado2 = new Quadrado(77);
        formas2D.add(quadrado2);

        Retangulo retangulo2 = new Retangulo(150, 36);
        formas2D.add(retangulo2);

        Circulo circulo2 = new Circulo(69);
        formas2D.add(circulo2);

        Retangulo retangulo3 = new Retangulo(1000, 7);
        formas2D.add(retangulo3);

        Cubo cubo1 = new Cubo(71);
        formas3D.add(cubo1);

        Cubo cubo2 = new Cubo(44);
        formas3D.add(cubo2);

        Cubo cubo3 = new Cubo(29);
        formas3D.add(cubo3);

        Cubo cubo4 = new Cubo(69);
        formas3D.add(cubo4);
       
        
        int r = 1;

        System.out.println("=============== Formas bidimensionais ===============");
        for (FormaBidimensional forma : formas2D) {
            double area = forma.calcularArea();
            double perimetro = forma.calcularPerimetro();

            System.out.printf("%d. %s -> Área: %.2f | Perímetro: %.2f.%n", r++, forma.getNome(), area, perimetro);
            
        }

        System.out.println();

        int s = 1;

        System.out.println("=============== Formas tridimensionais ================");
        for (FormaTridimensional forma : formas3D) {
            double area = forma.calcularArea();
            double volume = forma.calcularVolume();

            System.out.printf("%d. %s -> Área: %.2f | Volume: %.2f.%n", s++, forma.getNome(), area, volume);
        }
    }
      
    }
