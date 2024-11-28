class Persona {

    private String nombre;
    private int edad;
    private int peso;
    private int altura;
    private String sexo;

    public Persona(){}

    public Persona(String nombre, int edad,String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=0;
        this.altura=0;
    }
    public Persona(String nombre, int edad,String sexo,int peso,int altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public int IMC(){
        double n=(peso/(double)((altura/100)*(altura/100)));
        if (n < 20) {
            return -1;
        }
        if (n >= 20 && n <= 25) {
            return 0;
        }
        if (n > 25) {
            return 1;
        }
        return (int) n;
    }

    public String datos(){
        return  nombre+" "+edad+" "+sexo+" "+peso+" "+altura;
    }


}
