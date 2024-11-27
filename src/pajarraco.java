class pajaro {
    private String color;
    private double peso;
    private int edad;
    private boolean hamigrado;
    private String dieta;
    private  static int numPajaros;
    static void nuevaPajaros(){
        numPajaros++;
    }
    public pajaro( String c,double p,int e,boolean h,String d){
        this.color=c;
        edad=e;
        peso=p;
        hamigrado=h;
        dieta=d;



    }




}
