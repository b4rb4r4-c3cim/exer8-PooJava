package ExercicioJava;
//exer02
public class ContaCorrente {
    //criando os atributos

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    //criando os contrutores
    public ContaCorrente() {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setEspecial(especial);
        this.setLimiteEspecial(limiteEspecial);
        this.setSaldo(saldo);
    }

    //criando get and set
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //criando os métodos para praticar ações dentro da classe
    //boolean se for verdadeiro ele conseguiu realizar o saque se for falso não conseguiu

    public boolean realizarSaque(double quantiaAsacar){
        //verificar se tem saldo na conta

        if(getSaldo() >= quantiaAsacar){
            setSaldo(getSaldo() - quantiaAsacar);
            return true;
        } else { //não tem saldo na conta, verifica-se o limite especial
            if(isEspecial()){
                //verificar se o limite especial tem saldo
                double limite = getLimiteEspecial() + getSaldo();
                if(limite >= quantiaAsacar){
                    setSaldo(getSaldo() - quantiaAsacar);
                    return true;
                } else {
                    return false;
                }
                } else{
                    return false; //não é especial e nao tem saldo suficiente
                }
            }
        }

    public void depositar(double valorDepositado){
        setSaldo(getSaldo() + valorDepositado);
    }

    public void consultarSaldo(){
        System.out.println("O saldo atual da conta = " + getSaldo());
    }
}
