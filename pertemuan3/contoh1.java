package pertemuan3;

abstract class Kendaraan {
    String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    abstract void bergerak();

    public void info() {
        System.out.println(nama + " adalah kendaraan.");
    }

}
// subclass
class contohMobil extends Kendaraan {
    public contohMobil(String nama){
        super(nama);
    }

    @Override
    void bergerak(){
        System.out.println(nama + " bergerak dengan roda.");
    }

}
class contohKapal extends Kendaraan {
    public contohKapal(String nama){
        super(nama);
    }

    @Override
    void bergerak(){
        System.out.println(nama + " bergerak di air.");
    }
}
public class contoh1 {
    public static void main(String[] args) {
        Kendaraan mobil = new contohMobil("Toyota");
        Kendaraan kapal = new contohKapal("Titanic");

        mobil.info();
        mobil.bergerak();
        System.out.println();
        kapal.info();
        kapal.bergerak();

    }
}
