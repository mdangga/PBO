class AkunBank{
    private String namaPemilik;
    private double saldo;

    //    constructor
    public AkunBank(String namaPemilik, double saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    //    getter and setter (deposit and withdraw) saldo
    public double getSaldo() {
        return saldo;
    }

    public void setDepositSaldo(double saldo) {
        if(saldo >= 0){
            this.saldo += saldo;
            System.out.println("Deposit Berhasil, saldo akun anda sekarang adalah Rp. " + this.saldo);
        }else{
            System.out.println("Deposit Gagal, pastikan jumlah yang anda masukan benar");
        }
    }

    public void setWithdrawSaldo(double saldo) {
        if(saldo > 0 && saldo <= this.saldo){
            this.saldo -= saldo;
            System.out.println("withdraw Berhasil, saldo akun anda sekarang tersisa Rp. " + this.saldo + ",00");
        }else{
            System.out.println("Penarikan Gagal, Saldo tidak mencukupi");
        }
    }
}
public class Latihan5 {
    public static void main(String[] args) {
        AkunBank angga = new AkunBank("Angga Murdika", 100_000);

//        mengakses saldo awal
        System.out.println("Saldo anda saat ini: Rp. " + angga.getSaldo());

//        transaksi
        angga.setDepositSaldo(50_000);
        System.out.println("Saldo anda saat ini: Rp. " + angga.getSaldo());

        angga.setWithdrawSaldo(10_000);
        System.out.println("Saldo anda saat ini: Rp. " + angga.getSaldo());

//        error
//        angga.saldo = 2_000_000;
    }
}
