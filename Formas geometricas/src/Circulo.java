class Circulo extends FormaGeometrica {

    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
