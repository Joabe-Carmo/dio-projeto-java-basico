public class ContaTerminal {
    int numero;
    String agencia;
    String NomeCliente;
    double saldo;

    public void DigitarAgencia(String DescricaoAgencia){
        agencia = DescricaoAgencia;
    }

    public void DigitarNomeCliente(String nome){
        NomeCliente = nome;
    }

    public void DigitarSaldo(double SaldoAtual){
        saldo = SaldoAtual;
    }
}
