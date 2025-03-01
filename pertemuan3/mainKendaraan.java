package pertemuan3;



// main class
public class mainKendaraan {
    public static void main(String[] args) {
        mobil rush = new mobil("Toyota","Rush");
        mobil raptor = new mobil("Ford","F150 Raptor R 6x6", 6);
        sepedaMotor beat = new sepedaMotor("Honda","Beat");
        sepedaMotor niken = new sepedaMotor("Yamaha","Niken GT", 3);

        rush.infoKendaraan();
        System.out.println();
        rush.bergerak();

        System.out.println();

        raptor.infoKendaraan();
        System.out.println();
        raptor.bergerak();

        System.out.println();

        beat.infoKendaraan();
        System.out.println();
        beat.bergerak();

        System.out.println();

        niken.infoKendaraan();
        System.out.println();
        niken.bergerak();

        System.out.println("====================================");
        // listrik

        mobilListrik model3 = new mobilListrik("tesla", "Model 3");
        mobilListrik seal = new mobilListrik("BYD", "seal");

        model3.bergerak();
        model3.isiDaya();

        System.out.println();

        seal.bergerak();
        seal.isiDaya();
    }
}
