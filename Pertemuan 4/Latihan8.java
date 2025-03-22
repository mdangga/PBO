interface Kendaraan8{
    void berjalan();
}

class Mobil8 implements Kendaraan8{
    @Override
    public void berjalan() {
        System.out.println("Mobil Berjalan dengan 4 roda.");
    }
}

class Motor8 implements Kendaraan8{
    @Override
    public void berjalan() {
        System.out.println("Motor Berjalan dengan 2 roda.");
    }
}
public class Latihan8 {
    public static void main(String[] args) {
        Kendaraan8 mobil = new Mobil8();
        Kendaraan8 motor = new Motor8();

        mobil.berjalan();
        motor.berjalan();
    }
}
