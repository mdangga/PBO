package pertemuan3;

interface IntKendaraan {
    //    method
    void bergerak();
    void isiDaya();
}

class mobilListrik implements IntKendaraan{
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
