package pertemuan3;

abstract class AbsKendaraan {
    // attribute
    String merk;
    String nama;
    int jumlahRoda;

    public AbsKendaraan(String merk ,String nama, int jumlahRoda){
        this.merk = merk;
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }
    //    method
    abstract void bergerak();

    void infoKendaraan(){
        System.out.println("Merk: " + merk);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// subclass
class mobil extends AbsKendaraan{

    public mobil(String merk, String nama){
        super(merk ,nama, 4);
    }

    public mobil(String merk, String nama, int jumlahRoda){
        super(merk ,nama, jumlahRoda);
    }

    @Override
    void bergerak(){
        System.out.println(merk+ " " +nama + " memiliki " + jumlahRoda + " roda.");
        System.out.println(merk+ " " +nama + " bergerak dengan mesin bensin.");
        System.out.println(merk+ " " +nama + " bergerak dengan " + jumlahRoda + " roda yang ditenagai dari mesin bensin");
    }
}

class sepedaMotor extends AbsKendaraan{

    public sepedaMotor(String merk, String nama){
        super(merk ,nama, 2);
    }

    public sepedaMotor(String merk, String nama, int jumlahRoda){
        super(merk ,nama, jumlahRoda);
    }

    @Override
    void bergerak(){
        System.out.println(merk+ " " +nama + " bergerak dengan " + jumlahRoda + " roda yang ditenagai dari mesin bensin");
    }
}