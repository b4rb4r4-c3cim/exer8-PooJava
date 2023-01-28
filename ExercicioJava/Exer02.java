package ExercicioJava;

public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(1000);

        System.out.println(" saldo da conta  " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        } else{
            System.out.println("Não foi possível realizar saque, saldo insuficiente.");
        }

        saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso.");
            conta.consultarSaldo();
        } else{
            System.out.println("Não foi possível realizar saque, saldo insuficiente.");
        }

        System.out.println("Realizando depósito de 500 reais...");
        conta.realizarSaque(500);
        conta.consultarSaldo();

        

    }
}
