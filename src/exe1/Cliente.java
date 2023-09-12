package exe1;

public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {

    }

    // Construtor
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // Métodos Setters
    public final void setNroConta(String nroConta) {
        if ((nroConta.length() == 8) && (nroConta.charAt(6) == '-')) {
            this.nroConta = nroConta;
        } else {
            this.nroConta = "";
            System.out.println("Número da conta inválido");
        }
    }

    public final void setNroAgencia(String nroAgencia) {
        if ((nroAgencia.length() == 6) && (nroAgencia.charAt(4) == '-')) {
            this.nroAgencia = nroAgencia;
        } else {
            this.nroAgencia = "";
            System.out.println("Número da agência inválido");
        }
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("O nome inválido");
        }
    }

    public final void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ficar negativo");
        }
    }

    // Métodos Getters
    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    // Métodos Expecíficos
    public void depositar(Float x) {
        this.setSaldo(this.saldo + x);
    }

    public void sacar(float x) {
        this.setSaldo(this.saldo - x);
    }

    @Override // informa que o método toString() é anulado da classe pai
    public String toString() {
        return "Cliente [nroConta=" + nroConta + ", nroAgencia=" + nroAgencia + ", nome=" + nome + ", saldo=" + saldo
                + "]";
    }
    
}