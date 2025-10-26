package domain;

public abstract class Produto {
    protected String descricao;
    protected double valor;
    protected double imposto;

    public Produto(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;

    }

    public abstract double calcularImposto();

    public abstract void gerarRelatorio();

    public String getDescricao()
    {
        return descricao;
    }

    protected abstract double aliquotaTaxaNacional();

    protected abstract double aliquotaTaxaImportacao();
}