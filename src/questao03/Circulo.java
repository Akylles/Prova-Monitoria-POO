package questao03;

public class Circulo extends FiguraGeometrica{

    private double raio;
    private final String NOME = "CIRCULO";

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", NOME='" + NOME + '\'' +
                "Area=" + calculaArea() +
                '}';
    }
}
