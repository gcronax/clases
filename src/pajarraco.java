class pajaro {




    private String nombre;
    private String especie;
    private boolean curado;
    private int sintomas;
    private String color;
    private double peso;
    private int edad;
    private String telefono;
    private  static int numPajaros;
    static void nuevaPajaros(){
        numPajaros++;
    }
    private String sintoma;
    public pajaro(String es,double p, int e, boolean c ){
        especie=es;
        peso=p;
        edad=e;
        curado=c;
    }
    public void Pajaro(String nombre, String especie, boolean curado, int sintomas, String color, double peso, int edad, String telefono) {
        this.nombre = nombre;
        this.especie = especie;
        this.curado = curado;
        this.sintomas = sintomas;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
        this.telefono = telefono;
        nuevaPajaros();
        diagnostico(sintomas);
    }

    public String diagnostico(int sintomas){
        switch (sintomas){
            case 1:
                sintoma="fractura";
                break;
            case 2:
                sintoma="intoxicacion";
                break;
            case 3:
                sintoma="no come";
                break;
        }
        return "";
    }

    public String getSintoma() {
        return sintoma;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public static int getNumPajaros() {
        return numPajaros;
    }

    public int getSintomas() {
        return sintomas;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCurado(boolean curado) {
        this.curado = curado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int masa_corporal(){
        return (int) peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSintomas(int sintomas) {
        this.sintomas = sintomas;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
