package questao04;

import java.util.List;

public class Pedido {
    private Produto item;
    private int quantidade;
    private FormaPagamento formaPagamento;

    public Pedido(Produto item, FormaPagamento formaPagamento) {
        this.item = item;
        this.formaPagamento = formaPagamento;
    }

    public Produto getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public String getInfoDescontos(){
        double dezPorCento = item.getPreco() * 0.9;
        double vintePorCento = item.getPreco() * 0.8;
        double vinteCincoPorCento = item.getPreco() * 0.75;

        String saida = String.format("Produto %s.\n" +
                "Até 10 unidades %.2f\n" +
                "De 11 até 20 unidades %.2f\n" +
                "De 21 a 50 unidades %.2f\n" +
                "Acime de 50 unidades\n",
                item.getNome(),
                item.getPreco(),
                dezPorCento,
                vintePorCento,
                vinteCincoPorCento);

        return saida;
    }

}
