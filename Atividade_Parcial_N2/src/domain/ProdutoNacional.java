package domain;

public class ProdutoNacional extends Produto {
    public ProdutoNacional(String descricao, double valorBase) {
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
        return 0.05;
    }

    @Override
    protected double aliquotaTaxaImportacao() {
        return 0;
    }
}
