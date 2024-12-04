public class main_persona {
    public static void main(String[] args) {
        Persona p1, p2, p3;
        p1 = new Persona();
        p2 = new Persona("guille",20,"macho");
        p3 = new Persona("guille2",20,"biplano",22,185 );
        System.out.println(resultado(p1.IMC()));
        System.out.println(p1.IMC()+" "+p2.IMC()+" "+p3.IMC());
        System.out.println(p1.datos());
        System.out.println(p2.datos());
        System.out.println(p3.datos());

    }
    public static String resultado(int n){
        switch (n){
            case 1:
                return "tiene sobrepeso";
            case 0:
                return "peso ideal";
            case -1:
                return "esta delgado";
            default:
                return "ok";
        }
    }
}
