public abstract class ContaBancaria {

    private double saldo;
    private String titular;
    private String senha;
    private int quantidadeDeTransacao;
    private String numeroDaConta;


    public ContaBancaria(double saldo, String titular, String senha, String numeroDaConta) {
        this.saldo = saldo;
        this.titular = titular;
        this.senha = senha;
        this.numeroDaConta = numeroDaConta;

    }

    public int getQuantidadeDeTransacao() {
        return quantidadeDeTransacao;
    }

    public void setQuantidadeDeTransacao(int quantidadeDeTransacao) {
        this.quantidadeDeTransacao = quantidadeDeTransacao;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public abstract int quantidadeDeTransacao();
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract double tirarExtrato(double valor);
    public abstract void alterarSenha(String senha);
}