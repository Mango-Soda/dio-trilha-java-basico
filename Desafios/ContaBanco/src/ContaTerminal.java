import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo){
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    public ContaTerminal receberDados() throws Exception{
        Scanner scanner = new Scanner(System.in);
        this.numero = Integer.parseInt(lerEntrada(scanner, "Digite o número da conta bancária:"));
        this.agencia = lerEntrada(scanner, "Digite o nome da agência:");
        this.nomeCliente = lerEntrada(scanner, "Digite o nome do cliente:");
        this.saldo = Float.parseFloat(lerEntrada(scanner, "Insira o saldo a ser depositado:"));

        return new ContaTerminal(numero, agencia, nomeCliente, saldo);
    }

    public String lerEntrada(Scanner scanner, String mensagem){
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal(0, null, null, 0);

        conta.receberDados();

        String mensagem = String.format(
        "Olá %s, obrigado por criar uma conta no nosso banco. Sua agência é %s, conta %d e seu saldo é R$ %.2f.",
        conta.nomeCliente, conta.agencia, conta.numero, conta.saldo
        );

        System.out.println(mensagem);
    }
}