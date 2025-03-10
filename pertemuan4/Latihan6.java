package pertemuan4;

class Calculator6{
    int tambah(int a, int b){
        return a+b;
    }
    int tambah(int a, int b, int c){
        return a+b+c;
    }
    double tambah(double a, double b){
        return a+b;
    }
}
public class Latihan6 {
    public static void main(String[] args) {
        Calculator6 kalkulator = new Calculator6();

        System.out.println(kalkulator.tambah(5,10));
        System.out.println(kalkulator.tambah(5,10,15));
        System.out.println(kalkulator.tambah(5.5,2.5));

    }
}
