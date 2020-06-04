import java.util.UUID;

public class Account {


    private Double saldo;
    private String name;
    private String cpf;
    String uniqueID = UUID.randomUUID().toString();
    private Month fixChecks;
    private Month foods;


    public Account(String name, String cpf){
        this.name=name;
        this.cpf=cpf;
        this.saldo=100.00;


    }

    public void saque(Double valor){

        //Double saldoBase = 10.00;


        if(valor < getSaldo()) {

            this.saldo = saldo - valor;
            System.out.println("Seu saldo atual é: "+getSaldo());
            System.out.println("Saque realizado com sucesso");


        }else{
            System.out.println("O saldo de sua conta é insufiente para esse valor: "+valor);
            System.out.println("O seu saldo é "+getSaldo());

        }


    }

    public void saldoAccount(){

        System.out.println(getSaldo());

    }

    public void deposito(Double valor){
        this.saldo= saldo+valor;
    }


    public void transfer(Double valor){

        if(getUniqueID() == getUniqueID()){
            System.out.println("Você está tentando transferir para a mesma conta");
        }



    }



    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
