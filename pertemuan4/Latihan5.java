package pertemuan4;

class Hewan5 {
    String nama;

    Hewan5(String nama) {
        this.nama = nama;
    }
    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Kucing5 extends Hewan5{
    Kucing5(String nama){
        super(nama);
    }
}
public class Latihan5 {
    public static void main(String[] args) {
        Kucing5 kucing = new Kucing5("Gartfield");

        kucing.info();
    }
}
