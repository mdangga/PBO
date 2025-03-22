class Mesin{
    private void checkFuelTank(){
        System.out.println("cek bahan bakar sebelum menyalakan mesin");
    }
    private void checkEngine(){
        System.out.println("cek indikator mesin sebelum menyalakan mesin");
    }
    void nyalakanMesin(){
        checkEngine();
        checkFuelTank();
        System.out.println("Mesin menyala!! brmmmm");
    }

}
public class Latihan4 {
    public static void main(String[] args) {
        Mesin mobil = new Mesin();
        mobil.nyalakanMesin();
//        mobil.checkEngine
    }
}
