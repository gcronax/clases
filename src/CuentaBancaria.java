class CuentaBancaria {
    private  String titular;
    private  String n_cuenta;
    private  Double saldo;

    public CuentaBancaria(String t,String n,double s){
        this.titular=t;
        this.n_cuenta=n;
        this.saldo=s;
    }

    public CuentaBancaria(String t,String n){
        this.titular=t;
        this.n_cuenta=n;
    }


    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public String getTitular() {
        return titular;
    }
    public void ingresar(int n){
        this.saldo=saldo+n;
    }
    public void retirar(int n){
        this.saldo=saldo-n;
    }


    public String consulta() {
        return titular+" "+n_cuenta+" "+saldo;
    }
}
