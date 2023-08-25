package questao03;

public class Retangulo extends FiguraGeometrica{
    private double base, altura;
    private final String NOME = "RETANGULO";

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", NOME='" + NOME + '\'' +
                "Area" + calculaArea() +
                '}';
    }
}
