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

    @Override
    protected double aliquotaTaxaNacional() {
        return 0;
    }

    @Override
    protected double aliquotaTaxaImportacao() {
        return 0;
    }
}

