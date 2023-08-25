package questao03;

public class Quadrado extends FiguraGeometrica{

    private double lado;
    private final String NOME = "QUADRADO";

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", NOME='" + NOME + '\'' +
                "Area=" + calculaArea()+
                '}';
    }
}
