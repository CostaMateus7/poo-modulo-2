package entities;

public class ContaCorrente {
    String primeiroNomeCliente;
    String sobrenomeCliente;
    long numeroContaCorrente;
    float juros = 0.01f;
    float saldo;
    float limiteChequeEspecial = -200.0f;

    public ContaCorrente() {

    }

    public ContaCorrente(String primeiroNomeCliente, String sobrenomeCliente, long numeroContaCorrente) {
        this.primeiroNomeCliente = primeiroNomeCliente;
        this.sobrenomeCliente = sobrenomeCliente;
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public String getNome() {
        return primeiroNomeCliente + " " + sobrenomeCliente;
    }

    public long getNumero() {
        return numeroContaCorrente;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        if (saldo - valor >= limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public void rendimento() {
        if (saldo >= 0) {
            saldo += saldo * juros;
        }
    }
}