
package contabanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.setSaldo(0f);
        this.setStatus(false);
    }
    
    public void abrirConta(){
        this.setStatus(true);
        if (this.tipo == "cc") {
            this.setSaldo(50f);
            System.out.println("Saldo inicial: " + this.getSaldo());
        } else if (this.tipo == "cp"){
            this.setSaldo(150f);
            System.out.println("Saldo inicial: " + this.getSaldo());
        } else {
            System.out.println("Escolha sua conta entre | cc | ou | cp |");
        }
        System.out.println    ("=========================================");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta negativa não pode ser fechada");
        } else {
            System.out.println("Conta fechada com sucesso");
            this.setStatus(false);
        }
        System.out.println("===========================");
    }
    
    public void depositar(Float saldo){
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Valor depositado: " + saldo);
            System.out.println("Saldo atual: " + this.saldo);
            System.out.println("===========================");
        } else {
            System.out.println("Conta fechada");
        }
    }
    
    public void sacar(Float saldo){
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("Valor sacado: " + saldo);
            System.out.println("Saldo atual: " + this.getSaldo());
        } else {
            System.out.println("Conta fechada");
        }
        System.out.println("===========================");
    }
    
    public void pagarMensal(){
            int v = 0;
            if (this.getTipo() == "cc" || this.getTipo() == "cp") {
                if (this.getTipo() == "cc") {
                    v = 12;
                }
                else if (this.getTipo() == "cp") {
                    v = 20;
                }
                if (this.isStatus() == true) {
                    if (this.getSaldo() >= v) {
                        this.setSaldo(this.getSaldo()-v);
                        System.out.println("Mensalidade paga com sucesso, valor : " + v);
                        System.out.println("Saldo atual: " + this.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                } else {
                    System.out.println("Impossível pagar");
                }
            } else {
                System.out.println("Tipo de conta inexistente");
            }
            
            System.out.println("===========================");
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
    
    public void status(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
}
