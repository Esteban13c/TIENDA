public class Main {
    public static void main(String[] args) {
        TIENDA P1 = new TIENDA("arroz", "P1234", 1500, 25);

        P1.mostrarinformacio();
        P1.vender(10);
        P1.mostrarinformacio();
        P1.abastecer(5);
        P1.mostrarinformacio();
        P1.valorstock();

        P1.mostrarinformacio();
    }
}