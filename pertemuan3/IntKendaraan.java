package pertemuan3;

interface InKendaraan {
    //    method
    void bergerak();
    void isiDaya();
}

class mobilListrik implements InKendaraan{
    private String merk;
    private String nama;
    private int jumlahRoda = 4; // Default jumlah roda

    public mobilListrik(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }

    @Override
    public void bergerak() {
        System.out.println(merk+ " " +nama + " memiliki " + jumlahRoda + " roda.");
        System.out.println(merk+ " " +nama + " bergerak dengan mesin listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(merk+ " " +nama + " sedang diisi daya.");
    }
}

public class IntKendaraan {
    public static void main(String[] args) {
        InKendaraan model3 = new mobilListrik("tesla", "Model 3");
        InKendaraan seal = new mobilListrik("BYD", "seal");

        model3.bergerak();
        model3.isiDaya();

        System.out.println();

        seal.bergerak();
        seal.isiDaya();
    }
}
