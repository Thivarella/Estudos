package aula05;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    @Override
    public String toString() {
        return "Num Conta: " + this.getNumConta() + "\nTipo: " + this.getTipo()
                + "\nDono: " + this.getDono() + "\nSaldo: " + this.getSaldo()
                + "\nStatus: " + ((this.isStatus())?"Aberta":"Fechada");
    }
    
    public Banco() {
        this.setSaldo(0.0f);
        this.setStatus(false);
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
    
    public void AbrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if("CC".equals(this.getTipo())){
            this.setSaldo(50f);
        }else if("CP".equals(this.getTipo())){
            this.setSaldo(150f);
        }
        System.out.println("Conta Aberta com sucesso");
    }
    public void FecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta possui Dinheiro");
        }else if(this.getSaldo()<0){
            System.out.println("Conta em Débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void Depositar(float valor){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Conta não está aberta!");
        }
    }
    
    public void Sacar(float valor){
        if(this.isStatus() && this.getSaldo()>=valor){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque realizado na conta de " + this.getDono());
        }else if(this.isStatus() && this.getSaldo()<valor){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Conta se encontra fechada");
        }
    }
    
    public void Mensalidade(){
        float valor=0;
        if("CC".equals(this.getTipo())){
            valor =12f;
        }else if ("CP".equals(this.getTipo())){
            valor = 20f;
        }
        
        if(this.isStatus() && this.getSaldo()>valor){
           this.setSaldo(this.getSaldo()-valor);
        }else if (this.isStatus() && this.getSaldo()<valor){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Conta se encontra fechada");
        }
    }
}
