
//void ingresar(float c). Agrega al saldo de la cuenta la cantidad recibida.
//void extraer(float c) Descuenta del saldo la cantidad recibida. Tras la llamada a este método el saldo no podrá quedar en negativo.
//float getSaldo(). Devuelve el saldo actual.

public class Cuenta {
    private String nombre;
    private String apellido;
    private int id;
    private float saldo;

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }

    public Cuenta(String nombre, String apellido, int id, float saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.saldo = saldo;
    }
    public Cuenta(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.saldo = 0;
    }

    public Cuenta(){
        this.nombre = "";
        this.apellido = "";
        this.id = 0;
        this.saldo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresar(float monto) {
        float newSaldo = this.getSaldo()+monto;
        this.setSaldo(newSaldo);
        System.out.println("Nuevo balance: "+ this.getSaldo());
    }

    public void extraer(float monto) {
        float newSaldo = 0;
        if(monto > this.getSaldo()){
            System.out.println("Error. Saldo insuficiente");
        }
        else{
            newSaldo = this.getSaldo() - monto;
            this.setSaldo(newSaldo);
            System.out.println("Nuevo balance: " + this.getSaldo());
        }
    }

    public void mostrarSaldo(){

        System.out.println("Saldo de tu cuenta: " + this.getSaldo());

    }

    public void bienvenida(){
        System.out.println("Bienvenido " + this.getNombre() + " " +this.getApellido());
    }
}