class AkunBank{
    private double saldo;

//    constructor
    public AkunBank(double saldo) {
        this.saldo = saldo;
    }

//    getter and setter saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("saldo tidak bisa negatif!!");
        }
    }
}
public class Latihan3 {
    public static void main(String[] args) {
        AkunBank angga = new AkunBank(100_000);

//        cek saldo awal
        System.out.println("Saldo Awal : " + angga.getSaldo());

//        saldo baru diatas atau sama dengan 0
        angga.setSaldo(0);

//        cek saldo baru
        System.out.println("Saldo Baru: " + angga.getSaldo());

//        saldo baru dibawah 0
        angga.setSaldo(-1_000);
    }
}
