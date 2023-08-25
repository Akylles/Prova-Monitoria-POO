package questao01;

public class Aluno {
    private String nome, matricula;
    private double nota1, nota2, nota3;
    private double media;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = calculaMedia();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calculaMedia(){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public String mostraSituacao(){
        String situacao = "Reprovado";

        if(media > 6){
            situacao = "Aprovado";
        }else if(media >= 4){
            situacao = "Reposição da menor nota";
        }

        return  situacao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=' " + matricula + '\'' +
                ", nota1= " + nota1 +
                ", nota2= " + nota2 +
                ", nota3= " + nota3 +
                ", media= " + media +  '\'' +
                ", situacao= " + mostraSituacao();
    }
}
