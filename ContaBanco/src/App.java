public class App {
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
