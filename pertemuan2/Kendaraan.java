package pertemuan2;

class Vehicle{
//  attribute
    String merk;
    String tipe;
    int kecepatan;

//  constructor
    Vehicle(String merk, String tipe, int kecepatan){
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

//  method
    void tampilkanInfo(){
        System.out.println("merk: " + merk + ", tipe: " + tipe + ", kecepatan: " + kecepatan + " km");
    }

    void tambahKecepatan(int kecepatan){
        this.kecepatan += kecepatan;
        System.out.println("kecepatan kendaraan bertambah " + kecepatan + " km, sekarang kecepatan menjadi " + this.kecepatan + " km");
    }

    void kurangiKecepatan(int kecepatan){
        this.kecepatan -= kecepatan;
        System.out.println("kecepatan kendaraan berkurang " + kecepatan + " km, sekarang kecepatan menjadi " + this.kecepatan + " km");
    }

    void berhenti(){
        this.kecepatan = 0;
        System.out.println("NGEREM MENDADAK!!!");
    }

}
public class Kendaraan {
    public static void main(String[] args) {
        
        Vehicle honda = new Vehicle("honda", "mobil", 90);
        Vehicle toyota = new Vehicle("toyota", "mobil", 90);
        Vehicle yamaha = new Vehicle("yamaha", "motor", 60);
        Vehicle suzuki = new Vehicle("suzuki", "motor", 65);

        honda.tampilkanInfo();
        honda.tambahKecepatan(20);
        honda.kurangiKecepatan(20);
        honda.berhenti();
        honda.tampilkanInfo();

        System.out.println();

        toyota.tampilkanInfo();
        toyota.tambahKecepatan(20);
        toyota.kurangiKecepatan(20);
        toyota.berhenti();
        toyota.tampilkanInfo();

        System.out.println();

        yamaha.tampilkanInfo();
        yamaha.tambahKecepatan(20);
        yamaha.kurangiKecepatan(20);
        yamaha.berhenti();
        yamaha.tampilkanInfo();

        System.out.println();

        suzuki.tampilkanInfo();
        suzuki.tambahKecepatan(20);
        suzuki.kurangiKecepatan(20);
        suzuki.berhenti();
        suzuki.tampilkanInfo();

        System.out.println();
    }
}
