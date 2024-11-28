public class main_cuantebancaria {
    public static void main(String[] args) {
        CuentaBancaria c1;
        c1 = new CuentaBancaria("guille","123456789");
        c1 = new CuentaBancaria("guille","123456789",2500.56);
        System.out.println(c1.getSaldo());
        System.out.println("hago un ingreso de 500");
        c1.ingresar(500);
        System.out.println(c1.getSaldo());
        System.out.println("hago un retiro de 300");
        c1.retirar(300);
        System.out.println(c1.getSaldo());
        System.out.println(c1.consulta());
    }
}
