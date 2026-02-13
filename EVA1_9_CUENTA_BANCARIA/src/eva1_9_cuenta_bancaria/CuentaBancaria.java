package eva1_9_cuenta_bancaria;
public class CuentaBancaria {
    private String titular;
    private double monto;
    
    
    public CuentaBancaria(){
        titular = "-----";
        monto = 0;
    }
    
    public CuentaBancaria(String titular, double monto){
        this.titular = titular;
        this.monto = monto;
    }
    
    public void ingresar(double monto){
        if (monto < 0){
            this.monto += monto;
        } else {
            System.out.println("No puedes ingresar saldos negativos");
        }
    }
    
    public void retirar(double monto){
        if (this.monto >= monto){
            this.monto -= monto;
        } else {
            System.out.println("No puedes retirar esta cantidad por falta de credito:(");
        }
    }
    
    public void imprimirSaldo(){
        System.out.println("Este es su saldo restante: " + monto);
    }
}
