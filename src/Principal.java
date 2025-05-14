import contas.ContaCorrente;
import contas.ContaEspecial;
import contas.Tributavel;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente(8750,"isaac","1234", "0001");
        ContaEspecial contaEspecial = new ContaEspecial(10000,"juliana","1234", "0001");







        System.out.println("qual tipo de conta deseja criar: \n Conta Corrente - 1 \n Conta Especial - 2  ");
        int opc = sc.nextInt();


        if(opc == 1) {
            System.out.println("Quantas contas deseja criar: ");
            int quantidadeDeContas = sc.nextInt();

            contaCorrente.criarContaCorrente(quantidadeDeContas);
        }  else if(opc == 2) {
            System.out.println("Quantas contas deseja criar: ");
            int quantidadeDeContas = sc.nextInt();
            contaEspecial.criarContaEspecial(quantidadeDeContas);
        }else{
            System.out.println("Opção indisponivel!!! ");
        }





    }


}
