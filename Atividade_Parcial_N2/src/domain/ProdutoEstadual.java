package domain;

public class ProdutoEstadual extends Produto {
    public ProdutoEstadual(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    public double calcularImposto() {
        return 0;
    }

    @Override
    public void gerarRelatorio() {

    }
}

