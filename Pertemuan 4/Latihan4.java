interface Hewan4{
    void Makan();
}

interface Mamalia4{
    void menyusui();
}

class Kucing4 implements Hewan4, Mamalia4{
    @Override
    public void Makan() {
        System.out.println("Kucing Makan Ikan");
    }

    @Override
    public void menyusui() {
        System.out.println("Kucing Menyusui Anaknya");
    }
}
public class Latihan4 {
    public static void main(String[] args) {
        Kucing4 kucing = new Kucing4();

        kucing.Makan();
        kucing.menyusui();
    }
}
