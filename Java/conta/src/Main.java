public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta();
        Conta.numerodaconta = 150;
        conta.Saldo = 400;

        System.out.println("Numero da conta: " + Conta.numerodaconta);
        System.out.println("Numero da conta: " + conta.Saldo);
    }
}
