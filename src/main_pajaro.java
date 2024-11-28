public class main_pajaro {
    public static void main(String[] args) {
        pajaro p1;
        p1 = new  pajaro("pajaroto", "bolinga",  false, 3, "azul", 1.2, 4,"213123");
        System.out.println(p1.getSintoma());
        System.out.println(p1.masa_corporal());
        System.out.println("se le trata");
        p1.setCurado(true);

    }

}
