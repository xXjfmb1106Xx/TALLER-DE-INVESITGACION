// ============================
// Clase TRABAJADORES
// ============================
class Trabajador {
    private int idTrabajador;
    private String nombre;
    private String cargo;
    private String fechaNacimiento;

    public Trabajador(int idTrabajador, String nombre, String cargo, String fechaNacimiento) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String infoTrabajador() {
        return "ID: " + idTrabajador + ", Nombre: " + nombre +
                ", Cargo: " + cargo + ", Fecha Nac: " + fechaNacimiento;
    }

    // Getters y setters
    public int getIdTrabajador() { return idTrabajador; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public String getFechaNacimiento() { return fechaNacimiento; }
}


// ============================
// Clase CLIENTES
// ============================
class Cliente {
    private int idCliente;
    private String nombre;
    private String genero;
    private String fechaNacimiento;

    public Cliente(int idCliente, String nombre, String genero, String fechaNacimiento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String infoCliente() {
        return "ID: " + idCliente + ", Nombre: " + nombre +
                ", Género: " + genero + ", Fecha Nac: " + fechaNacimiento;
    }
}


// ============================
// Clase SERVICIOS
// ============================
class Servicio {
    private int idServicio;
    private String nombreServicio;
    private Trabajador trabajador; // Relación con Trabajador

    public Servicio(int idServicio, String nombreServicio, Trabajador trabajador) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.trabajador = trabajador;
    }

    public String infoServicio() {
        return "ID Servicio: " + idServicio + ", Nombre: " + nombreServicio +
                ", Atendido por: " + trabajador.getNombre();
    }
}


// ============================
// Clase PRODUCTOS
// ============================
class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private String contenido;

    public Producto(int idProducto, String nombreProducto, double precio, String contenido) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.contenido = contenido;
    }

    public String infoProducto() {
        return "ID Producto: " + idProducto + ", Nombre: " + nombreProducto +
                ", Precio: $" + precio + ", Contenido: " + contenido;
    }
}


// ============================
// PROGRAMA PRINCIPAL
// ============================
public class Main {
    public static void main(String[] args) {
        // Crear un trabajador
        Trabajador trabajador1 = new Trabajador(1, "Ana Gómez", "Vendedora", "1990-05-14");

        // Crear un cliente
        Cliente cliente1 = new Cliente(101, "Carlos López", "M", "1995-07-21");

        // Crear un servicio asociado al trabajador
        Servicio servicio1 = new Servicio(201, "barberia", trabajador1);

        // Crear un producto
        Producto producto1 = new Producto(301, "shampoo", 7000.0, "1L");

        // Mostrar información
        System.out.println("=== INFO TRABAJADOR ===");
        System.out.println(trabajador1.infoTrabajador());

        System.out.println("\n=== INFO CLIENTE ===");
        System.out.println(cliente1.infoCliente());

        System.out.println("\n=== INFO SERVICIO ===");
        System.out.println(servicio1.infoServicio());

        System.out.println("\n=== INFO PRODUCTO ===");
        System.out.println(producto1.infoProducto());
}
}