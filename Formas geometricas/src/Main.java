public class Main {

    public static void main(String[] args) {

        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Retangulo(5, 4);
        formas[1] = new Circulo(3);
        formas[2] = new Triangulo(6, 2);

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Área: " + formas[i].calcularArea());
        }
    }
}
