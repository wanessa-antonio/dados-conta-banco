import java.text.DecimalFormat;
import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que digite o nome
            System.out.print("Por favor, digite o seu nome: ");
            String titular = scanner.next();

            System.out.println();

            // Solicita ao usuário que digite o número da conta
            System.out.print("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println();

            // Solicita ao usuário que digite o saldo
            System.out.print("Por favor, digite o seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println();
            
            // Solicita ao usuário que digite a taxa de juros
            System.out.print("Por favor, digite a taxa de juros: ");
            double taxaJuros = scanner.nextDouble();

            ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

            System.out.println();
            
            System.out.println("Conta Poupanca:");
            contaPoupanca.exibirInformacoes();
        }
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
    }
}
