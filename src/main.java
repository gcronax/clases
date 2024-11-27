import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Coche c1,c2,c3,c4;
        int ace=0;
        String name;



        System.out.println("dame tu nombre ");
        name= scan.next();

        c1 =new Coche(ThreadLocalRandom.current().nextInt(-40, 120),name);


        System.out.println("dame tu nombre ");
        name= scan.next();

        c2 =new Coche(ThreadLocalRandom.current().nextInt(-40, 120),name);

        System.out.println("dame el numero de horas: ");
        int n=scan.nextInt();
        for (int i = 0; i < n; i++) {
            c1.setRecorre(1);
            c1.setAceleracion(ThreadLocalRandom.current().nextInt(-40, 120));
            c2.setRecorre(1);
            c2.setAceleracion(ThreadLocalRandom.current().nextInt(-40, 120));

        }
        System.out.println(c1.getColor());
        System.out.println(c1.getDistancia());

        System.out.println(c2.getColor());
        System.out.println(c2.getDistancia());
    }
}
