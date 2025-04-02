import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        conta.DigitarNomeCliente(scanner.next());
        System.out.println("Digite sua agência: ");        
        conta.DigitarAgencia(scanner.next());
        System.out.println("Digite seu saldo: "); 
        conta.DigitarSaldo(scanner.nextDouble());

        System.out.println("O nome, a agência e o saldo digitados foram respectivamente: "+conta.NomeCliente+" "+conta.agencia+" "+conta.saldo);








        // Scanner scanner = new Scanner(System.in);
        // Pessoa pessoa = new Pessoa();
        // System.out.println("Digite seu nome: ");
        
        // pessoa.definirNome(scanner.next());

        // System.out.println("O nome digitado foi: "+pessoa.nome);
    }
}
