package questao03;

public class Triangulo extends FiguraGeometrica{

    private double base, altura;
    private final String NOME = "TRIANGULO";

    public Triangulo(double base, double altura) {
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
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", NOME='" + NOME + '\'' +
                "Area=" + calculaArea() +
                '}';
    }
}//fim da classe
