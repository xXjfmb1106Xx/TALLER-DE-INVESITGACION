# Clase Trabajador
class Trabajador:
    def __init__(self, id_trabajador, nombre, cargo, fecha_nacimiento):
        self.id_trabajador = id_trabajador
        self.nombre = nombre
        self.cargo = cargo
        self.fecha_nacimiento = fecha_nacimiento

    def info_trabajador(self):
        return f"ID: {self.id_trabajador}, Nombre: {self.nombre}, Cargo: {self.cargo}, Fecha Nac.: {self.fecha_nacimiento}"


# Clase Cliente
class Cliente:
    def __init__(self, id_cliente, nombre, genero, fecha_nacimiento):
        self.id_cliente = id_cliente
        self.nombre = nombre
        self.genero = genero
        self.fecha_nacimiento = fecha_nacimiento
        self.servicios = []
        self.productos = []

    def adquirir_servicio(self, servicio):
        self.servicios.append(servicio)

    def adquirir_producto(self, producto):
        self.productos.append(producto)

    def info_cliente(self):
        return f"ID: {self.id_cliente}, Nombre: {self.nombre}, Género: {self.genero}, Fecha Nac.: {self.fecha_nacimiento}"


# Clase Servicio
class Servicio:
    def __init__(self, id_servicio, nombre_servicio, trabajador):
        self.id_servicio = id_servicio
        self.nombre_servicio = nombre_servicio
        self.trabajador = trabajador

    def info_servicio(self):
        return f"Servicio: {self.nombre_servicio}, ID: {self.id_servicio}, Atendido por: {self.trabajador.nombre}"


# Clase Producto
class Producto:
    def __init__(self, id_producto, nombre_producto, precio, contenido):
        self.id_producto = id_producto
        self.nombre_producto = nombre_producto
        self.precio = precio
        self.contenido = contenido

    def info_producto(self):
        return f"Producto: {self.nombre_producto}, ID: {self.id_producto}, Precio: ${self.precio}, Contenido: {self.contenido}"


# ------------------ EJEMPLO DE USO ------------------

# Crear un trabajador
trab1 = Trabajador(1, "Carlos Pérez", "Vendedor", "1990-05-12")

# Crear un cliente
cli1 = Cliente(100, "Ana Gómez", "F", "1995-08-20")

# Crear servicios y productos
serv1 = Servicio(200, "Mantenimiento", trab1)
prod1 = Producto(300, "Aceite de motor", 50.0, "1L")

# El cliente adquiere un servicio y un producto
cli1.adquirir_servicio(serv1)
cli1.adquirir_producto(prod1)

# Mostrar información
print("--- Cliente ---")
print(cli1.info_cliente())

print("\n--- Servicios adquiridos ---")
for s in cli1.servicios:
    print(s.info_servicio())

print("\n--- Productos adquiridos ---")
for p in cli1.productos:
    print(p.info_producto())

print("\n--- Trabajador ---")
print(trab1.info_trabajador())