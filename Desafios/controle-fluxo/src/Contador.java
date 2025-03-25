import java.util.Scanner;

public class Contador {
    public static void Contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException("O segundo parâmetro não pode ser menor que o primeiro.");
        }
        else {
            for (int i = param1; i <= param2; i++) {
                System.out.printf("Imprimindo número %d%n", i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = Integer.parseInt(scanner.nextLine());
    
            try {
                Contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException ex) {
                throw new ParametrosInvalidosException("Erro: " + ex.getMessage());
            }         
        }
    }

}
