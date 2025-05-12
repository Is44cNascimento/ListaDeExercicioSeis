import java.util.ArrayList;
import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {

    private ArrayList<ContaEspecial> contasEspecias = new ArrayList<ContaEspecial>();

    public ContaEspecial(double saldo, String titular, String senha, String numeroDaConta) {
        super(saldo, titular, senha, numeroDaConta);
    }


    @Override
    public int quantidadeDeTransacao() {
        return getQuantidadeDeTransacao();
    }


    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!" + " Saldo: " + getSaldo());
        }else {
            System.out.println("Saldo insuficiente" + " Saldo: " + getSaldo());
        }
    }

    @Override
    public double tirarExtrato(double valor) {
        return getSaldo();
    }

    @Override
    public void alterarSenha(String senha) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua atual senha: ");
        String senhaAtual = sc.nextLine();
        System.out.println("Digite sua nova senha: ");
        String novaSenha = sc.nextLine();


        if (senha.equals(senhaAtual)) {
            setSenha(novaSenha);
        } else {
            System.out.println("Senha incorreta!");
        }
        sc.close();



    }

    public void criarContaEspecial(int quantidadeDeContas) {


        Scanner sc = new Scanner(System.in);

        int saldo = 0;
        String titular, senha, numeroDaConta;


        for (int i = 0; i <= quantidadeDeContas; i++) {

            System.out.println("Digite o saldo da conta " + i + " : ");
            saldo = sc.nextInt();

            System.out.println("Digite o nome do titular da conta " + i + " : ");
            titular = sc.next();


            System.out.println("Digite a senha da conta " + i + " : ");
            senha = sc.next();


            System.out.println("Digite o numero da conta " + i + " : ");
            numeroDaConta = sc.next();


            contasEspecias.add(i, new ContaEspecial(saldo, titular, senha, numeroDaConta));

            System.out.println("Conta " + i + " criada com sucesso!");

        }
    }

    public void mostrarContasEspecial() {
        for (int i = 0; i < contasEspecias.size(); i++) {
            System.out.println(contasEspecias.get(i).getSaldo() + " - " + contasEspecias.get(i).getTitular() + " - " + contasEspecias.get(i).getSenha() + " - " + contasEspecias.get(i).getNumeroDaConta());

        }
    }

}
