public class Menu {
    public static void main(String[] args) {
//        mahasiswa mhs1 =  new mahasiswa("Angga", 2313231);
//        mahasiswa mhs2 =  new mahasiswa("Yuda", 2313230);
//
//        mhs1.tampilkanInfo();
//        mhs2.tampilkanInfo();

        Hewan kucing = new Hewan("kucing", "mamalia", 3);
        Hewan anjing = new Hewan("anjing", "mamalia", 3);
        Hewan ular = new Hewan("ular", "reptil", 1);
        Hewan burung = new Hewan("burung", "unggas", 1);

        kucing.tampilkanInfo();
        kucing.suaraHewan();
        kucing.bertambahUmur(2);
        kucing.tampilkanInfo();

        System.out.println();

        anjing.tampilkanInfo();
        anjing.suaraHewan();
        anjing.bertambahUmur(3);
        anjing.tampilkanInfo();

        System.out.println();

        ular.tampilkanInfo();
        ular.suaraHewan();
        ular.bertambahUmur(4);
        ular.tampilkanInfo();

        System.out.println();

        burung.tampilkanInfo();
        burung.suaraHewan();
        burung.bertambahUmur(4);
        burung.tampilkanInfo();
    }
}
